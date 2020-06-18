package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Utility.Addcust;
import Utility.Datadriver;

public class Testbase {

	
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static FileInputStream fis;
	public static String path = System.getProperty("user.dir");
	public static Datadriver excel = new Datadriver();
	public static Addcust ADD = new Addcust(driver);
	public static Properties or = new Properties();
	@BeforeSuite
	public void setup() {

		if (driver == null) {
			try {
				fis = new FileInputStream(path + "\\src\\test\\resources\\config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				config.load(fis);
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				fis = new FileInputStream(path + "\\src\\test\\resources\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				or.load(fis);
			} catch (IOException e) {
			
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (config.getProperty("browser").equals("chrome")) {
			try {
				System.setProperty("webdriver.chrome.driver", path + "//Executable//chromedriver.exe");
				driver = new ChromeDriver();
		
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (config.getProperty("browser").equals("Firefox")) {

			System.setProperty("webdriver.gecho.driver", path + "src\\test/resources\\executables\\geckodriver.exe");
		}

		else if (config.getProperty("browser").equals("edge")) {

			System.setProperty("webdriver.edge.driver", path + "src\\test/resources\\executables\\edgedriver.exe");
		}
		String url = config.getProperty("testURL");
		
		System.out.println(url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
				TimeUnit.SECONDS);

	}

	public boolean elementpresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	
	
	@AfterSuite
	public void teardown() {

		if (driver != null) {
			driver.quit();
		}
		
	}

}
