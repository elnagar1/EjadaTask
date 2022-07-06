package Steps;

import Pages.Courier.CourierLoginPage;
import Pages.User.UserLoginPage;
import Pages.Web.LoginPage;
import Utilities.Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class NormalOrder2 {

    AndroidDriver userdriver;
    UserLoginPage userlogin ;

    AndroidDriver courierdriver;
    CourierLoginPage Courierlogin;

    WebDriver webDriver;
    LoginPage webLogin;
    public String orderNumber;

    @Given("Open user app login screen")
    public void openUserAppLoginScreen() throws IOException, ParseException {
        userdriver= TestBase.getNewUserDriver();
        userlogin = new UserLoginPage(userdriver);
    }

    @When("Click skip button and choose env")
    public void clickSkipButtonAndChooseEnv() {
        //Skid
        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin.skipButton.click();

        //Login
        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin.btnChooseDev.click();

        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin.chooseDev.click();

        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin.confirmDev.click();
    }

    @And("Choose country code")
    public void chooseCountryCode() {
        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin.countryCodeTxtBox.click();

        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin.egypt.click();
    }

    @When("^Enter \"([^\"]*)\"  click continue$")
    public void enter_click_continue(String UPhone) throws Throwable {

        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin.numberTxtBox.sendKeys(UPhone);

        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin.numberContinue.click();
    }

    @When("^Enter \"([^\"]*)\" and click sign in$")
    public void enter_and_click_sign_in(String UPassword) throws Throwable {

        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin.passwordTxtBox.sendKeys(UPassword);

        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin.loginBtn.click();

    }

    @And("Click search box from home and choose anything")
    public void clickSearchBoxFromHomeAndChooseAnything() throws InterruptedException {    //Click to search
        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin. tv_search_main.click();


        //Click to choose anything
        Thread.sleep(5000);
        userlogin.choose.click();

        Thread.sleep(5000);
        userlogin. rbAnything.click();
        userlogin. button_done.click();

    }
    @When("^Go back to search screen and search with \"([^\"]*)\"$")
    public void go_back_to_search_screen_and_search_with(String address) throws Throwable {



        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        userlogin.search.sendKeys(address);
    }


    @And("Choose one result and click next button")
    public void chooseOneResultAndClickNextButton() {

        userdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        userlogin.rv_notify.click();

        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin.btn_confirm_cost.click();
    }

    @And("Enter your products and Click checkout")
    public void enterYourProductsAndClickCheckout() {
        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin.et_add_item_order_anything.click();

        //problem is here
        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin.et_add_item_order_anything.sendKeys("bread ");

        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userdriver.navigate().back();

        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin.cl_proceed_checkout.click();
    }

    @And("Choose order price and click submit")
    public void chooseOrderPriceAndClickSubmit() {
        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin.tvLessThan100.click();

        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin.confirm.click();
    }

    @And("Choose payment type cash and then click place order")
    public void choosePaymentTypeCashAndThenClickPlaceOrder() {
        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin.tv_cash.click();

        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        userlogin.btn.click();

        userdriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        orderNumber = userlogin.orderNumberButton.getText();

        System.out.println(orderNumber);
    }

    @Then("Order must done")
    public void orderMustDone() throws IOException, ParseException, InterruptedException {

        courierdriver=  TestBase.getNewCourierDriver();
        Courierlogin = new CourierLoginPage(courierdriver);
        Courierlogin.CourierLogin();


        webDriver=  TestBase.getNewWebDriver("chrome");
        webLogin = new LoginPage(webDriver);
        webLogin.clickLogin("mohamed.abdelhy@shgardi.app","123456");
        webLogin.LunchWeb(userlogin.orderNumber);
    }
}
