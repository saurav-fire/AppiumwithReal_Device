package pageObjects;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CheckOutInfoPage extends BasePage {

	public CheckOutInfoPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(accessibility = "test-First Name")
	WebElement txtFirstName;
	
	@AndroidFindBy(accessibility = "test-Last Name")
	WebElement txtLastName;
	
	@AndroidFindBy(accessibility = "test-Zip/Postal Code")
	WebElement txtzipCode;
	
	@AndroidFindBy(accessibility = "test-CONTINUE")
	WebElement btnContinue;
	
	
	public void enterFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	public void enterLastName(String lname)
	{
		txtLastName.sendKeys(lname);
	}
	
	public void enterzipCode(String zcode)
	{
		txtzipCode.sendKeys(zcode);
	}
	public void clickOnContinue()
	{
		btnContinue.click();
	}
	
	
	
}
