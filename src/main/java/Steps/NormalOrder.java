package Steps;

import Utilities.Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import Pages.Courier.CourierLoginPage;
import Pages.User.UserLoginPage;
import Pages.Web.LoginPage;
import java.io.IOException;
import java.net.MalformedURLException;


public class NormalOrder  {

    AndroidDriver userdriver;
    AndroidDriver courierdriver;
    UserLoginPage userlogin ;
    CourierLoginPage Courierlogin;
    WebDriver webDriver;
    LoginPage webLogin;

    @Given("^user is on Login screen$")
    public void userIsOnLoginScreen() throws InterruptedException, IOException, ParseException {
        userdriver= TestBase.getNewUserDriver();
        userlogin = new UserLoginPage(userdriver);
        userlogin.UserLogin("+201012661525","a12345678");
    }

    @When("^Click skip button$")
    public void clickSkipButton() throws IOException, InterruptedException, ParseException {

        courierdriver=  TestBase.getNewCourierDriver();
        Courierlogin = new CourierLoginPage(courierdriver);
        Courierlogin.CourierLogin();
    }

    @And("^Change country and choose egypt$")
    public void changeCountryAndChooseEgypt() throws MalformedURLException, InterruptedException {
        webDriver=  TestBase.getNewWebDriver("chrome");
        webLogin = new LoginPage(webDriver);
        webLogin.clickLogin("mohamed.abdelhy@shgardi.app","123456");
        webLogin.LunchWeb(userlogin.orderNumber);
    }

    @And("^insert \"([^\"]*)\"  click continue and insert \"([^\"]*)\" and click sign in$")
    public void insertClickContinueAndInsertAndClickSignIn(String arg0, String arg1) throws Throwable {

    }

    @Then("^you can view  Home$")
    public void youCanViewHome() {
    }

    @Given("^user is on Home screen$")
    public void userIsOnHomeScreen() {
    }

    @When("^Click search button$")
    public void clickSearchButton() {
    }

    @And("^Click menu button and choose anything then click done$")
    public void clickMenuButtonAndChooseAnythingThenClickDone() {
    }

    @And("^click search button and insert \"([^\"]*)\"$")
    public void clickSearchButtonAndInsert(String arg0) throws Throwable {

    }

    @And("^choose one result and click next button$")
    public void chooseOneResultAndClickNextButton() {
    }

    @And("^enter your products Click Checkout$")
    public void enterYourProductsClickCheckout() {
    }

    @And("^Choose Order price and click submit$")
    public void chooseOrderPriceAndClickSubmit() {
    }

    @And("^Choose payment type cash and then click place order$")
    public void choosePaymentTypeCashAndThenClickPlaceOrder() {
    }

    @Then("^assert output$")
    public void assert_output() throws Throwable {

    }

}
