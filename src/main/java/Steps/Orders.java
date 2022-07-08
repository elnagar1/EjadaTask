package Steps;

import Pages.Courier.CourierLoginPage;
import Pages.User.UserLoginPage;
import Pages.User.UserPackagePage;
import Pages.Web.WebLoginPage;
import Utilities.Base.TestBase;
import Utilities.Helper;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Orders {

    AndroidDriver userDriver,courierDriver;
    WebDriver webDriver;


    UserLoginPage userLogin;
    CourierLoginPage courierLogin;
    UserPackagePage userPackagePage;
    WebLoginPage webLogin;



    @Given("Start user app")
    public void startUserApp() throws IOException, ParseException {
        userDriver = TestBase.getNewUserDriver();
    }

    @When("Click skip button and choose env")
    public void clickSkipButtonAndChooseEnv() {
        //Skid
        userLogin = new UserLoginPage(userDriver);
        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin.skipButton.click();

        //Login
        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin.btnChooseDev.click();

        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin.chooseDev.click();

        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin.confirmDev.click();
    }
    @And("Choose country code for user")
    public void chooseCountryCodeForUser() {
        if (userLogin.numberContinue.getText().equalsIgnoreCase("Continue")){

        }else {
            userLogin.changeLang.click();
        }

        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin.countryCodeTxtBox.click();

        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin.egypt.click();
    }


    @When("^Enter \"([^\"]*)\"  click continue$")
    public void enter_click_continue(String UPhone) {


        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin.numberTxtBox.sendKeys(UPhone);

        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin.numberContinue.click();
    }

    @When("^Enter \"([^\"]*)\" and click sign in$")
    public void enter_and_click_sign_in(String UPassword)  {

        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin.passwordTxtBox.sendKeys(UPassword);

        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin.loginBtn.click();

    }

    @And("Click search box from home and choose anything")
    public void clickSearchBoxFromHomeAndChooseAnything() throws InterruptedException {    //Click to search
        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin. tv_search_main.click();


        //Click to choose anything
        Thread.sleep(5000);
        userLogin.choose.click();

        Thread.sleep(5000);
        userLogin. rbAnything.click();
        userLogin. button_done.click();

    }
    @When("^Go back to search screen and search with \"([^\"]*)\"$")
    public void go_back_to_search_screen_and_search_with(String address) {
        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin.search.sendKeys(address);
    }


    @And("Choose one result and click next button")
    public void chooseOneResultAndClickNextButton() {

        userDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        userLogin.rv_notify.click();

        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin.btn_confirm_cost.click();
    }

    @And("Enter your products and Click checkout")
    public void enterYourProductsAndClickCheckout() {
        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin.et_add_item_order_anything.click();

        //problem is here
        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin.et_add_item_order_anything.sendKeys("bread ");

        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userDriver.navigate().back();

        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin.cl_proceed_checkout.click();
    }

    @And("Choose order price and click submit")
    public void chooseOrderPriceAndClickSubmit() {
        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin.tvLessThan100.click();

        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin.confirm.click();
    }

    @And("Choose payment type cash and then click place order")
    public void choosePaymentTypeCashAndThenClickPlaceOrder() {
        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userLogin.tv_cash.click();
        userLogin.btn.click();
        userDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
       userLogin.orderNumber = userLogin.orderNumberButton.getText();
        System.out.println(userLogin.orderNumber );
    }


    @And("Click sendPackage order type")
    public void clickSendPackageOrderType() throws InterruptedException {
        userPackagePage= new UserPackagePage(userDriver);
        userPackagePage.scrollToPackage();
        userPackagePage.Package.click();
    }

    @And("Click in changeLocation  then choose currentLocation")
    public void clickInChangeLocationThenChooseCurrentLocation() {
        userPackagePage.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userPackagePage.btnChangePickupLocation.click();

        userPackagePage.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userPackagePage.currentLocation.click();
    }

    @And("Click in EnterLocation then Click chooseInMap button")
    public void clickInEnterLocationThenClickChooseInMapButton() {
        userPackagePage.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userPackagePage.btnEnterDropoffLocation.click();
        userPackagePage.chooseMap.click();
    }

    @And("Choose location and click Done button")
    public void chooseLocationAndClickDoneButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(userPackagePage.driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Done']")));
        userPackagePage.scrollInMap();
        userPackagePage.Done.click();
    }

    @And("Write the thing that you want to deliver then choose it's image then Click next")
    public void writeTheThingThatYouWantToDeliverThenChooseItSImageThenClickNext() {
        userPackagePage.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userPackagePage.writeOrder.sendKeys("PlayStation4");

        userPackagePage.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userPackagePage.scrollScreen();
        userPackagePage.Next.click();}

    @And("Open courier app")
    public void openCourierApp() throws IOException, ParseException {
        courierDriver =  TestBase.getNewCourierDriver();
    }

    @And("Choose country code for c")
    public void chooseCountryCodeForC()  {
        courierLogin = new CourierLoginPage(courierDriver);

        courierLogin.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        if (courierLogin.btn_continue.getText().equalsIgnoreCase("Continue")){

        }else {
            courierLogin.changeLang.click();
        }
            courierLogin.tvCountryCodeNumber.click();
        courierLogin.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        courierLogin.cl_select_egypt.click();
    }

    @And("Enter \"([^\"]*)\"  click continue c")
    public void enterClickContinueC(String CPhone) {


        courierLogin.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        courierLogin.etCurrentNumber.sendKeys(CPhone);

        courierLogin.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        courierLogin.btn_continue.click();
    }

    @And("Enter \"([^\"]*)\" and click signIn  courier")
    public void enterAndClickSignInC(String CPassword) {
        courierLogin.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        courierLogin.etNewPassword.sendKeys(CPassword);

        courierLogin.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        courierLogin.btnLogin.click();
    }

    @And("Open orders panel and accept order")
    public void openOrdersPanelAndAcceptOrder() {
        courierLogin.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        courierLogin.driver.findElement(By.xpath("//*[@text='Orders panel']")).click();

        courierLogin.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        courierLogin.order.click();
        courierLogin.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        courierLogin.btnAccept.click();
    }

    @And("Change order status")
    public void changeOrderStatus() {
        courierLogin.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        courierLogin.tvUpdateOrderStatus.click();
        courierLogin.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        courierLogin.btnDone.click();
    }

    @And("Add price and upload invoice  then click send button")
    public void addPriceAndUploadInvoiceThenClickSendButton() {
        courierLogin.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        courierLogin.tvUpdateOrderStatus.click();

        courierLogin.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        courierLogin.etPrice.sendKeys("50");

        courierLogin.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        courierLogin.ibUpload.click();

        courierLogin.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        courierLogin.userCamera.click();
        courierLogin.driver.pressKey(new KeyEvent(AndroidKey.CAMERA));

        courierLogin.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        courierLogin.driver.findElement(By.xpath("//*[@text='موافق']")).click();

        courierLogin.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        courierLogin.btnSend.click();

    }


    @And("Start Dashboard")
    public void startDashboard() {
        webDriver=  TestBase.getNewWebDriver("chrome");
    }

    @And("Enter login credential \"([^\"]*)\" W \"([^\"]*)\" and click login")
    public void enterLoginCredentialWAndClickLogin(String DEmail, String DPassword) {
        webLogin = new WebLoginPage(webDriver);
        webDriver.navigate().to("https://dashboard-dev.shgardi.app/auth/login");
        webLogin.setTextElementText(webLogin.emailTxtBox, DEmail);
        webLogin.setTextElementText(webLogin.passwordTxtBox, DPassword);
        webLogin.clickButton(webLogin.loginBtn);
    }

    @And("Open orders list")
    public void openOrdersList() {
        webDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        Actions action = new Actions(webDriver);
        action.moveToElement(webLogin.kt_aside_menu).perform();

        webDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        webLogin.Orders.click();
        webDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        webLogin.OrdersList.click();
    }

    @And("Search about order number and open its details")
    public void searchAboutOrderNumberAndOpenItsDetails() {
        webDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        webLogin.searchPanel.click();
        webLogin.order_number.sendKeys(userLogin.orderNumber);
        webLogin.chooseDelivered.click();
        webLogin.delivered.click();
        webLogin.chooseDelivered.click();
        webLogin.btn_search.click();

        webDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,350)", "");

        new Actions(webDriver).moveToElement(webLogin.orderDetails).perform();
        webLogin.orderDetails.click();
    }


    @Then("Assert results")
    public void assertResults() {
    }

    @AfterMethod
    public void closeBrowser(Scenario scenario,ITestResult result){

        if (webDriver!=null) { webDriver.quit();}
        if (courierDriver!=null) { courierDriver.quit();}
        if (userDriver!=null) { userDriver.quit();}

        System.out.println("Scenario Completed: "+scenario.getName());
        System.out.println("Scenario Status is: "+scenario.getStatus());

    }
}
