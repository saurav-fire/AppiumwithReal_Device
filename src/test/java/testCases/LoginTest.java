package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class LoginTest extends BaseClass {
	

	@Test
	public void testLogin() 
	{
		LoginPage lp = new LoginPage(driver);
		//logger.info("Enter User Name And Password");
		lp.login(p.getProperty("username"), p.getProperty("password"));
		lp.clickOnLogin();
		System.out.println("successful");
		Assert.assertTrue(true);
	}

}
