package Utilities.Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AndroidPageBase {

	public static AndroidDriver androidDriver;



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
	

}
