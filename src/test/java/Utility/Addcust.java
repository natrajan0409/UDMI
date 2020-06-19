package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcust  {
	
	WebDriver driver;
	@FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
	public WebElement btmage;
	@FindBy(xpath = "//button[@ng-class='btnClass1']") 
	public WebElement addcust;
	@FindBy(css = ("body.ng-scope:nth-child(2) div.ng-scope:nth-child(3) div.container-fluid.ng-scope div.ng-scope div.border.box.padT20.ng-scope div.center > button.btn.btn-lg.tab:nth-child(1)"))
	public WebElement firstname;
	@FindBy(css = ("body.ng-scope:nth-child(2) div.ng-scope:nth-child(3) div.container-fluid.ng-scope div.ng-scope div.border.box.padT20.ng-scope div.ng-scope div.ng-scope div.marTop form.ng-pristine.ng-invalid.ng-invalid-required div.form-group:nth-child(2) > input.form-control.ng-pristine.ng-untouched.ng-invalid.ng-invalid-required:nth-child(2)"))
	public WebElement lastname;
	@FindBy(xpath = ("body.ng-scope:nth-child(2) div.ng-scope:nth-child(3) div.container-fluid.ng-scope div.ng-scope div.border.box.padT20.ng-scope div.ng-scope div.ng-scope div.marTop form.ng-pristine.ng-invalid.ng-invalid-required div.form-group:nth-child(3) > input.form-control.ng-pristine.ng-untouched.ng-invalid.ng-invalid-required:nth-child(2)"))
	public WebElement postcode;
	@FindBy(css = ("body.ng-scope:nth-child(2) div.ng-scope:nth-child(3) div.container-fluid.ng-scope div.ng-scope div.border.box.padT20.ng-scope div.ng-scope div.ng-scope div.marTop form.ng-pristine.ng-invalid.ng-invalid-required > button.btn.btn-default:nth-child(4)"))
	public WebElement addcustbutton;

	public Addcust(WebDriver driver)
	 
	 {
	  this.driver = driver;
	  }
}