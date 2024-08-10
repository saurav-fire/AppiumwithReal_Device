package Base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class BasePage {
	
		public AppiumDriver driver;
		public void setup() throws MalformedURLException
		{
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("platformName", "Android");
			caps.setCapability("appium:automationName", "UiAutomator2");
			caps.setCapability("appium:deviceName", "onw8rw6tamyp85pv");

			caps.setCapability("appPackage", "com.swaglabsmobileapp"); // app package

			caps.setCapability("appActivity", "com.swaglabsmobileapp.SplashActivity"); // app activity

			URL url = new URL("http://127.0.0.1:4723/");
			 driver = new AppiumDriver(url, caps);
			System.out.println(driver.getSessionId());
			
		}
		

	

	}
