package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.pagefactory.AndroidFindBy;
import pageObjects.CheckOutInfoPage;
import pageObjects.CheckOutOverViewPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyCartPage;
import testBase.BaseClass;

public class AddToCartTest extends BaseClass {
	
	@Test
	public void verify_addToCart() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");
		lp.clickOnLogin();
		HomePage hp = new HomePage(driver);
		hp.clickOnAddtoCart();
	    hp.clickOnCart();
	    MyCartPage mcp = new MyCartPage(driver);
	    mcp.clickOnCheckout();
	    CheckOutInfoPage cip= new CheckOutInfoPage(driver);
	    cip.enterFirstName("saurav");
	    cip.enterLastName("tester");
	    cip.enterzipCode("441112");
	    cip.clickOnContinue();
	    CheckOutOverViewPage chkoverpg = new CheckOutOverViewPage(driver);
	   String titletext = chkoverpg.gecheckOuttile();
	  //  Assert.assertEquals(titletext, "CHECKOUT: OVERVIEW");
	    Thread.sleep(3000);
	    	  
	    	    		

	    chkoverpg.scrollToElement(driver);
	    chkoverpg.clickF();
	    
	}
	
	

}
