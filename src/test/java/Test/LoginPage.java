package Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends BasePage {
	
	 public LoginPage(AppiumDriver driver) {
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    }
	 
	 
	 
	  public void login(String username, String password) {
	        usernameField.sendKeys(username);
	        passwordField.sendKeys(password);
	        loginButton.click();
	    }
	  
	  
	  @AndroidFindBy(accessibility = "test-Username" )
	    private WebElement usernameField;

	    @AndroidFindBy(accessibility = "test-Password")
	    private WebElement passwordField;

	    @AndroidFindBy(accessibility = "test-LOGIN")
	    private WebElement loginButton;

	  

}
