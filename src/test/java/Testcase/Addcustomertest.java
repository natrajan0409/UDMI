package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import Utility.Addcust;
import base.Testbase;

public class Addcustomertest extends Testbase {
	
	
	@Test(dataProvider = "Input1")

	public  void Addcustomer(String  FirstName, String Latsname, String postcode) {
		

		driver.findElement(By.xpath(or.getProperty("addcust"))).click();
		System.out.println("addcust");
		driver.findElement(By.cssSelector(or.getProperty("firstname"))).sendKeys(FirstName);
		driver.findElement(By.cssSelector(or.getProperty("lastname"))).sendKeys(Latsname);
		driver.findElement(By.cssSelector(or.getProperty("postcode"))).sendKeys(postcode);
		driver.findElement(By.xpath(or.getProperty("addcustbutton"))).click();

	}

	@DataProvider(name="Input1")
	public Object[][] input1feed()
	{
		

	
		 int row  = excel.getrowcount(1);
		 
		  Object [][]  keyword= new Object [row][2];
		  int i;
		  for( i=1; i<=row; i++);
		  {
		        keyword[i][0]=excel.Getdata(0,i,0);
		         keyword[i][1]=excel.Getdata(0,i,1);
		  }
		  return keyword;
	} 

		}


