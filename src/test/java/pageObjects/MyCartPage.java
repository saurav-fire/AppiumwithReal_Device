package pageObjects;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyCartPage extends BasePage{

	public MyCartPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"CHECKOUT\"]")
	WebElement chckbtn;
	
	public void clickOnCheckout()
	{
		chckbtn.click();
	}

}
