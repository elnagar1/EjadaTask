package Steps;

import Constant.GlobalConstant;
import Pages.Mobile.LoginPage;
import Pages.Web.CheckoutPage;
import Pages.Web.ProductsPage;
import Utilities.LoadProperties;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class MobileCycleSteps {

    WebDriver webDriver;
    WebDriver driver ;


    @Given("Open app")
    public void openApp() {
        driver = BaseSteps.driver;

    }


    @When("^Login with credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void login_with_credentials_and(String usName, String pass) {
        // Write code here that turns the phrase above into concrete actions
        LoginPage.getInstance(driver)
                .addCredential(usName,pass)
                .clickLogin();
    }



    @Then("Verify status \"([^\"]*)\"")
    public void verifyStatus(String status) {

            LoginPage.getInstance(driver).checkProductScreenIsExist(status);

    }
}
