package Utilities;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import org.testng.log4testng.Logger;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;

public class PageBase {

	private static final int GLOBAL_TIME_OUT = 60 ;
	WebDriver driver;
	public JavascriptExecutor jse ;
	Logger logger = Logger.getLogger(PageBase.class);
	public static ExtentTest extantTest;
	public Assertion hardAssert;
	public SoftAssert softAssert;
	// create constructor
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver =driver;
		 hardAssert = new Assertion();
		 softAssert = new SoftAssert();
	}








	public void assertTowExpectedResult(String actualResult, String expectedResult1, String expectedResult2) {
		new SoftAssert().assertTrue(actualResult.equals(expectedResult1) || actualResult.equals(expectedResult2));
	}

	public void assertContainTowExpectedResult(String actualResult, String expectedResult1, String expectedResult2) {

		new SoftAssert().assertTrue(actualResult.contains(expectedResult1) || actualResult.contains(expectedResult2));
	}

	public boolean verifyElementClickable(WebElement element) {

		by(element,"Verify Clickable");
			try {
				waitForElementPresent(element);
			}catch (Exception e ){

			}

			try {
				return element.getAttribute("clickable").equals("true");
			} catch (Exception e) {
				return element.getAttribute("enabled").equals("true");
			}


	}


	public String getText(WebElement element) {
             String xx= null;

			int count = 0;
			//It will try 4 times to find same element using name.
			while (count < 2) {
				try {

						waitForElementPresent(element);

					by(element,"Get Text");
					 xx =element.getText();
				} catch (StaleElementReferenceException e) {
					e.toString();
					System.out.println("Trying to recover from a stale element :" + "\u001B[31m");
					System.out.print(e.getMessage() + "\u001B[0m");
					count++;

				}

			}
			return xx;



	}




	public void click(WebElement button, Long second) {

			int count = 0;
			//It will try 3 times to find same element using name.

			while (count < 2) {
				try {

					if (second == null) {
						waitUntilElementToBeClickable(button);
					} else {
						waitUntilElementToBeClickable(button, second.intValue());
					}

					break;
				} catch (StaleElementReferenceException e) {

					System.out.println(">>> Trying to recover from a stale element :" + "\u001B[31m");
					System.out.println(e.getMessage() + "\u001B[0m");
					count++;
				}



			}



	}

	public void clickWithoutWait(WebElement button) {

			int count = 0;
			while (count < 2) {
				try {
					by(button,"Click");
					button.click();

					break;
				} catch (StaleElementReferenceException e) {
					e.toString();
					System.out.println("Trying to recover from a stale element :" + "\u001B[31m");
					System.out.println(e.getMessage() + "\u001B[0m");
					count++;
				}


			}

	}

	public void click(WebElement button) {

			click(button, null);

	}

	public void CheckQuickPayAndClick(WebElement button) {
		try {
			driver.switchTo().alert().accept();

		}catch (Exception x){
			System.out.println("No Alert");
		}


			click(button, null);

	}


	public void tap(WebElement button) {

			click(button, null);

	}


	public void setText(WebElement element, String data, Long second) {


			int count = 0;
			//It will try 4 times to find same element using name.
			while (count < 2) {
				try {
					if (second == null) {
						waitForElementPresent(element);
					} else {
						waitForElementPresent(element, second.intValue());
					}
					by(element,"Set Text");
					element.sendKeys(data);

					break;
				} catch (StaleElementReferenceException e) {
					e.toString();
					System.out.println("Trying to recover from a stale element :" + "\u001B[31m");
					System.out.println(e.getMessage() + "\u001B[0m");
					count++;

				}

			}


	}

	public void setText(WebElement element, String data) {

			setText(element, data, null);


	}


	public void waitForElementPresent(WebElement element) {


			waitUntilElementVisible(element, GLOBAL_TIME_OUT);


	}

	public void setImplicitWait() {
		driver.manage().timeouts().implicitlyWait(GLOBAL_TIME_OUT, TimeUnit.SECONDS);
	}

	public void waitForElementPresent(WebElement element, int time) {

			waitUntilElementVisible(element, time);


	}

	public void waitUntilElementVisible(WebElement element) {
		waitUntilElementVisible(element, GLOBAL_TIME_OUT);
	}

	public void waitUntilElementToBeClickable(WebElement element, int time) {
		by(element, "Waiting and Click");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time).getSeconds());
		wait.pollingEvery(Duration.ofSeconds(1))
				.until(ExpectedConditions.elementToBeClickable(element))
				.click();
	}
	public void waitUntilElementToBeClickable(WebElement element) {
		by(element, "Waiting and Click");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(GLOBAL_TIME_OUT).getSeconds());
		wait.until(ExpectedConditions.elementToBeClickable(element))
				.click();

	}

	public WebElement waitUntilElementWithCondition(WebElement element,ExpectedConditions conditions) {
		by(element,"Waiting");
		return  new WebDriverWait(driver, Duration.ofSeconds(GLOBAL_TIME_OUT).getSeconds())
				.until(conditions.presenceOfElementLocated(by(element)));
	}

	public WebElement waitUntilElementWithCondition(WebElement element,ExpectedConditions conditions,int time ) {
		by(element,"Waiting");
		return  new WebDriverWait(driver, Duration.ofSeconds(time).getSeconds())
				.until(conditions.presenceOfElementLocated(by(element)));
	}

	public void waitUntilElementVisible(WebElement element, int time) {
		by(element,"Waiting");

		new WebDriverWait(driver, Duration.ofSeconds(time).getSeconds())
				.until(ExpectedConditions
						.visibilityOf(element));


	}



	public void waitUntil(BooleanSupplier condition, int seconds) {
		new WebDriverWait(driver, Duration.ofSeconds(seconds).getSeconds())
				.pollingEvery(Duration.ofMillis(500)).until((WebDriver driver) -> condition.getAsBoolean());


	}

	public void waitUntil(BooleanSupplier condition) {
		waitUntil(condition, GLOBAL_TIME_OUT);
	}






	public By by(WebElement element,String Action) {
		String locator;
		String text = element.toString();


		text = text.substring(0, text.length() - 1);
		if (text.contains("xpath")) {
			locator = text.split("xpath: ")[1];
			if(extantTest==null) {

			}else {

				extantTest.info(Action +": "+locator);
			}

			logger.info(Action +":: "+ locator);
			return By.xpath(locator);
		} else if (text.contains("id")) {
			locator = text.split("id: ")[1];
			return By.id(locator);
		} else if (text.contains("className")) {
			locator = text.split("className: ")[1];
			return By.className(locator);
		} else {
			return null;
		}
	}
	public By by(WebElement element) {
		String locator;
		String text = element.toString();

		text = text.substring(0, text.length() - 1);
		if (text.contains("xpath")) {
			locator = text.split("xpath: ")[1];
			return By.xpath(locator);
		} else if (text.contains("id")) {
			locator = text.split("id: ")[1];
			return By.id(locator);
		} else if (text.contains("className")) {
			locator = text.split("className: ")[1];
			return By.className(locator);
		} else {
			return null;
		}
	}



















	public  void setTextElementText(WebElement textElement , String value)
	{
		textElement.sendKeys(value);
	}


	public void scrollToBottom() 
	
	{
		jse.executeScript("scrollBy(0,2500)"); 
	}
	
	public void clearText(WebElement element) 
	{
		element.clear();
	}



	public  void typeRandomNumber(WebElement element, int data) {
		Random random = new Random();
		int rn = random.nextInt(100);
		String randomNumber = Integer.toString(rn);
		element.sendKeys(randomNumber);
	}

	public  String getTextBoxValue(WebElement element) {
		return element.getAttribute("value");
	}

	public  boolean VerifyTextEquals(WebElement element,String expected){
		boolean flag=false;
		if(element.getText().equals(expected))
			return flag=true;
		return flag;
	}

	public String getTitle(){
		return driver.getTitle();
	}

	public String getCurrentUrl(){
		return driver.getCurrentUrl();
	}

	public boolean isSelected(WebElement element) {
		return element.isSelected();
	}

	public void selectCheckBox(WebElement element) {
		if (!isSelected(element))
			element.click();
	}

	public void deSelectCheckbox(WebElement element) {
		if (isSelected(element))
			element.click();
	}

	public void selectRadioButton(WebElement element) {
		if (!isSelected(element))
			element.click();
	}

	public void deSelectRadioButton(WebElement element) {
		if (isSelected(element))
			element.click();
	}

	public boolean isEnabled(WebElement element){
		return element.isEnabled();
	}

	public  boolean isDisplayed(WebElement element){
		waitForElementPresent(element);
		return element.isDisplayed();
	}

	public  void selectByText(WebElement element,String text){
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}

	public  void selectByIndex(WebElement element,int index){
		Select select=new Select(element);
		select.selectByIndex(index);
	}

	public  void selectByValue(WebElement element,String value){
		Select select=new Select(element);
		select.selectByValue(value);
	}

	public  String getFirstSelectedOption(WebElement element){
		Select select=new Select(element);
		return select.getFirstSelectedOption().getText();
	}

	public  List<WebElement> getAllSelectedOptions(WebElement element){
		Select select=new Select(element);
		return select.getAllSelectedOptions();
	}

	public  List<WebElement> getAllOptions(WebElement element){
		Select select=new Select(element);
		return select.getOptions();
	}

	public  void deSelectByText(WebElement element,String text){
		Select select=new Select(element);
		select.deselectByVisibleText(text);
	}

	public  void deSelectByIndex(WebElement element,int index){
		Select select=new Select(element);
		select.deselectByIndex(index);
	}

	public  void deSelectByValue(WebElement element,String value){
		Select select=new Select(element);
		select.deselectByValue(value);
	}



	public Alert getAlert() {
		return driver.switchTo().alert();
	}

	public void AcceptAlert() {
		getAlert().accept();
	}

	public void DismissAlert() {
		getAlert().dismiss();
	}

	public String getAlertText() {
		String text = getAlert().getText();
		return text;
	}

	public  boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	public  void AcceptAlertIfPresent() {
		if (!isAlertPresent())
			return;
		AcceptAlert();
	}

	public  void DismissAlertIfPresent() {

		if (!isAlertPresent())
			return;
		DismissAlert();
	}

	public  void AcceptPrompt(String text) {

		if (!isAlertPresent())
			return;

		Alert alert = getAlert();
		alert.sendKeys(text);
		alert.accept();
	}

	public  void scrollToElemet(WebElement element) {
		tryJavascript("window.scrollTo(arguments[0],arguments[1])", element.getLocation().x, element.getLocation().y);
	}

	public  void scrollToElemetAndClick(WebElement element) {
		scrollToElemet(element);
		element.click();
	}

	public  void scrollIntoView(WebElement element) {
		tryJavascript("arguments[0].scrollIntoView()", element);
		WebDriver driver;



	}

	public  void scrollIntoViewAndClick(WebElement element) {
		waitUntilElementLocated(25,element);
		scrollIntoView(element);
		element.click();
	}

	public void scrollDownVertically() {
		tryJavascript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public  void scrollUpVertically() {
		tryJavascript("window.scrollTo(0, -document.body.scrollHeight)");
	}

	public  void scrollDownByPixel() {
		tryJavascript("window.scrollBy(0,1500)");
	}

	public  void scrollUpByPixel() {
		tryJavascript("window.scrollBy(0,-1500)");
	}

	public  void ZoomInBypercentage() {
		tryJavascript("document.body.style.zoom='40%'");
	}

	public  void ZoomBy100percentage() {
		tryJavascript("document.body.style.zoom='100%'");
	}





	public  void setImplicitWait(int time){
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}


	public  void waitUntilElementLocated(int time,WebElement element){
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public  void waitUntilElementToClick(int time,WebElement element){
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public  synchronized Object execJavascript(String script, Object... args) {
		JavascriptExecutor scriptExe = ((JavascriptExecutor)driver);
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




}
