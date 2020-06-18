package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.Addcust;
import base.Testbase;

public class bankmagerlogin extends Testbase  {
	
	
	
	@Test
	public void bankmager() throws InterruptedException
	
	{
		
	System.out.println(ADD.btmage); 
	ADD.btmage.click(); 
	
		Thread.sleep(10000);
		//Assert.assertTrue(elementpresent(By.xpath(or.getProperty("addcust"))), "login not sucessfully");
		//Thread.sleep(1000);

	}
}
