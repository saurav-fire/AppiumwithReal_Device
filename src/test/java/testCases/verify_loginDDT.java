package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class verify_loginDDT extends BaseClass {
	
	
	@Test(dataProvider = "loginData",dataProviderClass = DataProviders.class)
	public void verify_loginDDT(String email,String pwd,String exp) throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.login(email, pwd);
		lp.clickOnLogin();
		Thread.sleep(2000);
		Assert.assertTrue(false);
		
	}
	
	
	

}
