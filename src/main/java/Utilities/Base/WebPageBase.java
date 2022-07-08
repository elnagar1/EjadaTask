package Utilities.Base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;

public class WebPageBase {

	 WebDriver driver;
	public JavascriptExecutor jse ;
	Logger logger = Logger.getLogger(WebPageBase.class);
	static int timeinSec=30;

	// create constructor 
	public WebPageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	
	public static void clickButton(WebElement button)
	{
		button.click();
	}
	
	public static void setTextElementText(WebElement textElement , String value)
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

	public static void typeText(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void typeTextIfElementPresent(WebElement element, String data) {
		if (element.isDisplayed()) {
			element.sendKeys(data);
		}
	}

	public static void clearTxtBox(WebElement element) {
		element.clear();
	}

	public static void typeRandomNumber(WebElement element, int data) {
		Random random = new Random();
		int rn = random.nextInt(100);
		String randomNumber = Integer.toString(rn);
		element.sendKeys(randomNumber);
	}

	public static String getTextBoxValue(WebElement element) {
		return element.getAttribute("value");
	}

	public static String getText(WebElement element){
		return element.getText();
	}

	public static boolean VerifyTextEquals(WebElement element,String expected){
		boolean flag=false;
		if(element.getText().equals(expected))
			return flag=true;
		return flag;
	}

	public  String getTitle(){
		return driver.getTitle();
	}

	public String getCurrentUrl(){
		return driver.getCurrentUrl();
	}

	public boolean isSelected(WebElement element) {
		if (element.isSelected())
			return true;
		return false;
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
		if(element.isEnabled())
			return true;
		return false;
	}

	public static boolean isDisplayed(WebElement element){
		if(element.isDisplayed())
			return true;
		return false;
	}

	public static void selectByText(WebElement element,String text){
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}

	public static void selectByIndex(WebElement element,int index){
		Select select=new Select(element);
		select.selectByIndex(index);
	}

	public static void selectByValue(WebElement element,String value){
		Select select=new Select(element);
		select.selectByValue(value);
	}

	public static String getFirstSelectedOption(WebElement element){
		Select select=new Select(element);
		return select.getFirstSelectedOption().getText();
	}

	public static List<WebElement> getAllSelectedOptions(WebElement element){
		Select select=new Select(element);
		return select.getAllSelectedOptions();
	}

	public static List<WebElement> getAllOptions(WebElement element){
		Select select=new Select(element);
		return select.getOptions();
	}

	public static void deSelectByText(WebElement element,String text){
		Select select=new Select(element);
		select.deselectByVisibleText(text);
	}

	public static void deSelectByIndex(WebElement element,int index){
		Select select=new Select(element);
		select.deselectByIndex(index);
	}

	public static void deSelectByValue(WebElement element,String value){
		Select select=new Select(element);
		select.deselectByValue(value);
	}

	public  void click(WebElement element){
		waitUntil(() ->isDisplayed(element));
		element.click();
	}

	public static void clickOnlyIfElementPresent(WebElement element){
		if(isDisplayed(element))
			element.click();
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

	public  void waitUntil(BooleanSupplier condition, int seconds) {
		new WebDriverWait(driver, seconds).until((WebDriver driver) -> condition.getAsBoolean());
	}

	public  void waitUntil(BooleanSupplier condition) {
		waitUntil(condition, timeinSec);
	}

}
