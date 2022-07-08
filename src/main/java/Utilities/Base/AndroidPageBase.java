package Utilities.Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;

public class AndroidPageBase {

	public static AndroidDriver androidDriver;
	Logger logger = Logger.getLogger(AndroidPageBase.class);

	static int timeinSec=30;



	// create constructor
	public AndroidPageBase(AndroidDriver driver)
	{
		this.androidDriver=driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	protected static void clickButton(AndroidElement button)
	{
		button.click();
	}

	protected static void setTextElementText(AndroidElement textElement , String value)
	{
		textElement.sendKeys(value);
	}




	public  void setImplicitWait(int time){
		androidDriver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}


	public  void waitUntilElementLocated(int time,WebElement element){
		WebDriverWait wait=new WebDriverWait(androidDriver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public  void waitUntilElementToClick(int time,WebElement element){
		WebDriverWait wait=new WebDriverWait(androidDriver,time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public  synchronized Object execJavascript(String script, Object... args) {
		JavascriptExecutor scriptExe = ((JavascriptExecutor)androidDriver);
		return scriptExe.executeScript(script, args);
	}

	public  synchronized Object tryJavascript(String script, Object... args) {
		try {
			return execJavascript(script, args);
		} catch (Exception ignore) {
			return "";
		}
	}

	public  boolean isPageLoaded() {
		String state = (String) tryJavascript("return document.readyState;");
		return state.matches("complete|loaded|interactive");
	}

	public  boolean isJQueryDone() {
		Object jsResponse = tryJavascript("return jQuery.active;");
		if (jsResponse instanceof Long) {
			return ((Long) jsResponse) == 0;
		} else if (jsResponse instanceof String) {
			String response = (String) jsResponse;
			return (response.startsWith("{\"hCode\"") || response.isEmpty());
		} else {
			return true;
		}
	}

	public  boolean isAngularDone() {
		Object jsResponse = tryJavascript("return window.getAllAngularTestabilities().filter(x=>!x.isStable()).length;");
		if (jsResponse instanceof Long) {
			return ((Long) jsResponse) == 0;
		} else if (jsResponse instanceof String) {
			String response = (String) jsResponse;
			return response.isEmpty();
		} else {
			return true;
		}
	}

	public  void waitUntil(BooleanSupplier condition, int seconds) {
		new WebDriverWait(androidDriver, seconds).until((WebDriver driver) -> condition.getAsBoolean());
	}

	public  void waitUntil(BooleanSupplier condition) {
		waitUntil(condition, timeinSec);
	}

}
