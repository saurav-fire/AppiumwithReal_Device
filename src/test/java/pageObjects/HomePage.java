package pageObjects;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage {

	public HomePage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	


	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"ADD TO CART\"])[1]")
	WebElement btnAddToCart;
	
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.view.ViewGroup\r\n"
			+ "")
	WebElement btnCart;
	
	
	public void clickOnAddtoCart()
	{
		btnAddToCart.click();
		
	}
	
	public void clickOnCart()
	{
		btnCart.click();
		
	}
	

}
