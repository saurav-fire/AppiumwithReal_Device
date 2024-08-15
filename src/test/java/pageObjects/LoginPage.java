package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends BasePage {
	
	
	 
	  public LoginPage(AppiumDriver driver) {
		super(driver);
		
	}

	
	  
	  
	  @iOSXCUITFindBy(iOSClassChain  = "**/XCUIElementTypeTextField[`name == \"test-Username\"`]" )
	    public WebElement usernameField;

	    @iOSXCUITFindBy(iOSClassChain  = "**/XCUIElementTypeSecureTextField[`name == \"test-Password\"`]")
	  public WebElement passwordField;

	    @iOSXCUITFindBy(iOSClassChain  = "**/XCUIElementTypeOther[`name == \"test-LOGIN\"`]")
	    public WebElement loginButton;

	    public void login(String username, String password) {
	        usernameField.sendKeys(username);
	        passwordField.sendKeys(password);
	        
	    }
	    
	    public void clickOnLogin()
	    {
	    	loginButton.click();
	    }

}
