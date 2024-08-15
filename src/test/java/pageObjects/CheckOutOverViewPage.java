package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CheckOutOverViewPage extends BasePage {
	

	public CheckOutOverViewPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\'CHECKOUT: OVERVIEW\']")
	WebElement titleChckOverView;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"FINISH\"]")
	WebElement btnFinish;

	public String gecheckOuttile() {
		return titleChckOverView.getText();
	}

	
	
	
	
	  public void scrollToElement(AppiumDriver driver) {
	  
	  driver.findElement(AppiumBy.
	  androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"FINISH\"));"
	  ));
	  
	  }
	 	   //Finally working
	  
	  
	
	 
	  
	  
	 

	   
		/*
		 * public void scrollToElement() { boolean canscrollmore = (Boolean)
		 * driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
		 * "elementId",((RemoteWebElement)btnFinish ).getId(), "direction","down",
		 * "percent",1.0 ));
		 * 
		 * }
		 */
	public void clickF() {
		btnFinish.click();
	}

}
