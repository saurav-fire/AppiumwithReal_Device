package Test;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;

public class LoginTest extends BasePage {
	
	   private LoginPage loginPage;

	    @BeforeMethod
	    public void setUp() throws MalformedURLException {
	        setup();
	        loginPage = new LoginPage(driver);
	    }

	    @Test
	    public void testLogin() {
	        loginPage.login("standard_user", "secret_sauce");
	    }

		
	}
	
	
	
	
	


