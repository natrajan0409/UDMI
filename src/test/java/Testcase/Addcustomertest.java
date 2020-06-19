package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import Utility.Addcust;
import base.Testbase;

public class Addcustomertest extends Testbase {
	
	
	@Test(dataProvider = "Input1")

	public  void Addcustomer(String  FirstName, String Latsname, String postcode) {
		
		Addcust Add1 = PageFactory.initElements(driver, Addcust.class);
		
		Add1.addcust.click();
		System.out.println("addcust");
		Add1.firstname.sendKeys(FirstName);
		Add1.lastname.sendKeys(Latsname);
		Add1.postcode.sendKeys(postcode);
		Add1.addcustbutton.click();

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


