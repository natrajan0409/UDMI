package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.Addcust;
import base.Testbase;

public class bankmagerlogin extends Testbase  {
	
	
	
	@Test
	public void bankmager() throws InterruptedException
	
	{
		Addcust Add1 = PageFactory.initElements(driver, Addcust.class);
	System.out.println(Add1.btmage); 
	Add1.btmage.click(); 
	
		Thread.sleep(1000);
	    Assert.assertTrue(elementpresent(By.xpath(or.getProperty("addcust"))), "login not sucessfully");
		Thread.sleep(1000);

	}
}
