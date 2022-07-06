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
