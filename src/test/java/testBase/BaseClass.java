package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.chromium.ChromiumDriver;

public class BaseClass {
	public  Properties p;
	//public  Logger logger;
	public  AppiumDriver driver;
	
	@BeforeMethod
	public void setup() throws IOException {
	    FileReader file = new FileReader("./src/test/resources/config.properties");
	    p = new Properties(); 
	    p.load(file); 
	  //  LogManager.getLogger(this.getClass()); 

	    DesiredCapabilities caps = new DesiredCapabilities();

	    // Ensure your credentials are correct
	  //  caps.setCapability("browserstack.user", "saurabhbansod_3dtBwW");
	  //  caps.setCapability("browserstack.key", "1M4up9mzYGEbyS32czqn");

	    // Enable debugging
	//    caps.setCapability("browserstack.debug", "true");
	 //   caps.setCapability("appium:verbose", "true");

	//   caps.setCapability("app", "bs://70488ab1a8661fdf1596cfdba40c7d9dcc88c0fb");
	    caps.setCapability("platformName", "ios");
	   // caps.setCapability("appium:automationName", "");
	    //caps.setCapability("appium:deviceName", "Xiaomi Redmi Note 8");
	    caps.setCapability("appium:platformVersion", "16");
	    
	    caps.setCapability("bundleId", "com.saucelabs.SwagLabsMobileApp");
	    caps.setCapability("appName", "com.saucelabs.SwagLabsMobileApp");
	    

	   // caps.setCapability("appPackage", "com.swaglabsmobileapp");
	  //  caps.setCapability("appActivity", "com.swaglabsmobileapp.SplashActivity");
	    caps.setCapability("project", "First Java Project");
	    caps.setCapability("build", "Java Android");
	    caps.setCapability("name", "first_test");
	 //   caps.setCapability("browserstack.local", "true");
	    
	   // caps.setCapability("appium:automationName", "UiAutomator2");
		caps.setCapability("appium:deviceName", "iPhone 14 Pro");

	    

	    URL url = new URL("http://hub.browserstack.com/wd/hub");
	//    URL url = new URL("http://127.0.0.1:4723/");
	    driver = new AppiumDriver(url, caps);
	    System.out.println(driver.getSessionId());
	}



	
	
	
	
		
	
	
	
	/*
	 * public static void setup() throws IOException { FileReader file = new
	 * FileReader("./src//test//resources//config.properties"); p = new
	 * Properties(); p.load(file); // logger =
	 * LogManager.getLogger(this.getClass()); browserstackOption =
	 * getBrowerstackOptions();
	 * 
	 * 
	 * UiAutomator2Options options = new UiAutomator2Options();
	 * options.setDeviceName("Xiaomi Redmi Note 8")
	 * .setAutomationName("UiAutomator2") .setPlatformName("Android")
	 * .setPlatformVersion("9.0") .setAppPackage("com.swaglabsmobileapp")
	 * .setAppActivity("com.swaglabsmobileapp.SplashActivity")
	 * .setApp("bs://37cdfcb593c491878ffcaaead4686531eb47d0b7")
	 * .setCapability("bstack:options", browserstackOption);
	 * .setCapability("bstack:caps", browserstackOption);
	 * URL url = new URL("http://hub.browserstack.com/wd/hub/"); driver = new
	 * ChromiumDriver(options);
	 * 
	 * driver = new AppiumDriver(url, options);
	 * System.out.println(driver.getSessionId()); }
	 * 
	 * 
	 * 
	 * static HashMap <String,Object> browserstackOption = new HashMap<String, Object>();
	public static HashMap <String,Object> getBrowerstackOptions ()
	{
		browserstackOption.put("userName","saurabhbansod_3dtBwW");
		browserstackOption.put("accessKey","1M4up9mzYGEbyS32czqn");
		browserstackOption.put("appiumVersion","2.7.1");
		return browserstackOption;
		
	 */	
	
	
	

	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

		String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile = new File(targetFilePath);

		sourceFile.renameTo(targetFile);

		return targetFilePath;

	}

}
