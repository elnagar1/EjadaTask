package Steps;

import Pages.Courier.CourierLoginPage;
import Pages.Courier.CourierOrderPage;
import Pages.User.CheckOutPage;
import Pages.User.UserLoginPage;
import Pages.User.SendPackagePage;
import Pages.Web.WebLoginPage;
import Utilities.Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException;


public class PackageOrder {
    AppiumDriver<MobileElement> userDriver, courierDriver;
    WebDriver webDriver;


    UserLoginPage userLogin;
    CourierLoginPage courierLogin;
    SendPackagePage userPackagePage;
    WebLoginPage webLogin;
    CheckOutPage checkOut;
    CourierOrderPage courierOrderPage;


    @Given("Open User app")
    public void openUserApp() throws IOException, ParseException {
        userDriver = TestBase.getNewUserDriver();
        userLogin = new UserLoginPage(userDriver);
    }

    @And("Open Courier app")
    public void openCourierApp() throws IOException, ParseException {
        courierDriver = TestBase.getNewCourierDriver();
        courierLogin = new CourierLoginPage(courierDriver);
    }

    @And("Open Dashboard")
    public void openDashboard() {
        webDriver = TestBase.getNewWebDriver("chrome-headless");
        webLogin = new WebLoginPage(webDriver);

    }

    @And("Click to skip button u")
    public void clickToSkipButtonU() {
        userLogin.clickButton(userLogin.skipButton);
    }

    @And("Choose EN language u")
    public void chooseENLanguageU() {
        if (!userLogin.getText(userLogin.numberContinue).equalsIgnoreCase("Continue")) {
            userLogin.clickButton(userLogin.changeLang);
        }
    }

    @And("Choose Dev Environment u")
    public void chooseDevEnvironmentU() {
        userLogin.clickButton(userLogin.btnChooseDev);
        userLogin.clickButton(userLogin.chooseDev);
        userLogin.clickButton(userLogin.confirmDev);
    }

    @And("Change Flag to Egypt u")
    public void changeFlagToEgyptU() {
        userLogin.clickButton(userLogin.countryCodeTxtBox);
        userLogin.clickButton(userLogin.egypt);
    }

    @And("Enter \"([^\"]*)\" number u")
    public void enterNumberU(String UPhone) {
        userLogin.sendText(userLogin.numberTxtBox,UPhone);
    }

    @And("Click continue u")
    public void clickContinueU() {
        userLogin.clickButton(userLogin.numberContinue);
    }

    @And("Enter \"([^\"]*)\" password u")
    public void enterPasswordU(String UPassword) {
        userLogin.sendText(userLogin.passwordTxtBox,UPassword);
    }

    @And("Click to Sign in u")
    public void clickToSignInU() {
        userLogin.clickButton(userLogin.loginBtn);
    }

    @And("Choose EN language c")
    public void chooseENLanguageC() {

        if (!courierLogin.getText(courierLogin.btn_continue).equalsIgnoreCase("Continue")) { courierLogin.changeLang.click();  }
    }

    @And("Choose Dev Environment c")
    public void chooseDevEnvironmentC() {
        courierLogin.clickButton(courierLogin.btnChooseDev);
        courierLogin.clickButton(courierLogin.chooseDev);
        courierLogin.clickButton(courierLogin.confirmDev);
    }

    @And("Change Flag to Egypt c")
    public void changeFlagToEgyptC() {
        courierLogin.clickButton(courierLogin.tvCountryCodeNumber);
        courierLogin.clickButton(courierLogin.cl_select_egypt);
    }

    @And("Enter \"([^\"]*)\" number c")
    public void enterNumberC(String CPhone) {
        courierLogin.sendText(courierLogin.etCurrentNumber,CPhone);
   }

    @And("Click continue c")
    public void clickContinueC() {
        courierLogin.clickButton(courierLogin.btn_continue);
    }

    @And("Enter \"([^\"]*)\" password c")
    public void enterPasswordC(String CPassword) {
        courierLogin.sendText(courierLogin.etNewPassword,CPassword);
    }

    @And("Click to Sign in c")
    public void clickToSignInC() {
        courierLogin.clickButton(courierLogin.btnLogin);
    }

    @And("Enter admin Email \"([^\"]*)\"")
    public void enterAdminEmail(String DEmail) {
        webDriver.navigate().to("https://dashboard-dev.shgardi.app/auth/login");
        webLogin.setTextElementText(webLogin.emailTxtBox, DEmail);
    }

    @And("Enter admin Password \"([^\"]*)\"")
    public void enterAdminPassword(String DPassword) {
        webLogin.setTextElementText(webLogin.passwordTxtBox, DPassword);
    }

    @And("Click admin Sign In")
    public void clickAdminSignIn() {
        webLogin.clickButton(webLogin.loginBtn);
    }

    @When("Choose Package order type")
    public void choosePackageOrderType() throws InterruptedException {
        userPackagePage= new SendPackagePage(userDriver);
        userPackagePage.scrollToPackage();
        userPackagePage.clickButton(userPackagePage.Package);
    }

    @And("Click in changeLocation then choose currentLocation")
    public void clickInChangeLocationThenChooseCurrentLocation() {
        userPackagePage.clickButton(userPackagePage.btnChangePickupLocation);
        userPackagePage.clickButton(userPackagePage.currentLocation);
    }

    @And("Click in EnterLocation")
    public void clickInEnterLocation() {
        userPackagePage.clickButton(userPackagePage.btnEnterDropoffLocation);
    }

    @And("Click chooseInMap button")
    public void clickChooseInMapButton() {
        userPackagePage.clickButton(userPackagePage.chooseMap); }

    @And("Choose location")
    public void chooseLocation() throws InterruptedException {

        userPackagePage.scrollInMap();
        userPackagePage.clickButton(userPackagePage.Done);
    }

    @And("Click Done button")
    public void clickDoneButton() {
        userPackagePage.sendText(userPackagePage.writeOrder,"PlayStation4");
    }

    @And("Write deliver product")
    public void writeDeliverProduct() throws InterruptedException {
        userPackagePage.scrollScreen();

    }

    @And("Enter your order then choose it's image")
    public void enterYourOrderThenChooseItSImage() {
     }

    @And("Click next")
    public void clickNext() {
        userPackagePage.clickButton(userPackagePage.Next);
    }

    @And("Choose Cash payment type")
    public void chooseCashPaymentType() {
        checkOut = new CheckOutPage(userDriver);
        checkOut.clickOnlyIfElementPresent(checkOut.tv_cash);
        checkOut.clickOnlyIfElementPresent(checkOut.cash);

    }

    @And("Click Place order button")
    public void clickPlaceOrderButton() {
        checkOut.clickButton(checkOut.btn);
        checkOut.orderNumber = checkOut.getText(checkOut.orderNumberButton);
        System.out.println(checkOut.orderNumber );
    }

    @And("Click Order panel")
    public void clickOrderPanel() {
        courierOrderPage = new CourierOrderPage(courierDriver);
        courierOrderPage.clickButton(courierOrderPage.OrdersPanel);
        courierOrderPage.clickButton(courierOrderPage.RunningPanel);
        courierOrderPage.clickButton(courierOrderPage.OrdersPanel);

    }

    @And("Click to order")
    public void clickToOrder() {
        courierOrderPage.clickButton(courierOrderPage.order);
    }

    @And("Click to accept button")
    public void clickToAcceptButton() {
        courierOrderPage.clickButton(courierOrderPage.btnAccept);
    }

    @And("Change order statue")
    public void changeOrderStatue() {
        courierOrderPage.clickButton(courierOrderPage.tvUpdateOrderStatus);
        courierOrderPage.clickButton(courierOrderPage.btnDone);
    }

    @And("Click Orders")
    public void clickOrders() {
        webLogin.setImplicitWait(25);
        Actions action = new Actions(webDriver);
        action.moveToElement(webLogin.kt_aside_menu).perform();
        webLogin.click(webLogin.Orders);

    }

    @And("Click Order list")
    public void clickOrderList() {
        webLogin.click(webLogin.OrdersList);
    }

    @And("Click Advanced search")
    public void clickAdvancedSearch() {
        webLogin.searchPanel.click();
    }

    @And("Enter order number")
    public void enterOrderNumber() {
        webLogin.order_number.sendKeys(checkOut.orderNumber);
    }

    @And("Click order status")
    public void clickOrderStatus() {
        webLogin.chooseDelivered.click();}

    @And("Select delivered")
    public void selectDelivered() {
        webLogin.delivered.click();
        webLogin.chooseDelivered.click();}

    @And("Double Click to search button")
    public void doubleClickToSearchButton() {
        webLogin.btn_search.submit();
        webLogin.btn_search.click();
    }


    @And("Click to View button")
    public void clickToViewButton() {
        webLogin.scrollToElemetAndClick(webLogin.orderDetails);
        webLogin.orderDetails.click();
    }



}