package Utilities.Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;

public class PageBase {

	public AppiumDriver<MobileElement> appiumDriver;
	static int timeInSec =30;

	// create constructor
	public PageBase(AppiumDriver<MobileElement> driver) {
		this.appiumDriver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


	public String getText(MobileElement element) {
		waitUntilElementLocated(25,element);
		return element.getText();
	}


	public  void clickButton(MobileElement button) {
		waitUntilElementLocated(30,button);
		button.click();
	}


	public  void sendText(MobileElement element, String data) {
		waitUntilElementLocated(25,element);
		element.sendKeys(data);

	}


	public static void setTextElementText(MobileElement textElement , String value)
	{
		textElement.sendKeys(value);
	}

	public  void setImplicitWait(int time){
		appiumDriver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}


	public  void waitUntilElementLocated(int time,WebElement element){
		WebDriverWait wait=new WebDriverWait(appiumDriver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public  void waitUntilElementToClick(int time,WebElement element){
		WebDriverWait wait=new WebDriverWait(appiumDriver,time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}


	public  void waitUntil(BooleanSupplier condition, int seconds) {
		new WebDriverWait(appiumDriver, seconds).until((WebDriver driver) -> condition.getAsBoolean());
	}

	public  void waitUntil(BooleanSupplier condition) {
		waitUntil(condition, timeInSec);
	}

	public  void clickOnlyIfElementPresent(MobileElement element){
		if(isDisplayed(element))
			element.click();
	}
	public  boolean isDisplayed(MobileElement element){
		return element.isDisplayed();
	}
}
