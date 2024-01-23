package Steps;

import Constant.GlobalConstant;
import Pages.Web.CheckoutPage;
import Pages.Web.LoginPage;
import Pages.Web.ProductsPage;
import Utilities.LoadProperties;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class CycleSteps  {

    WebDriver webDriver;
    WebDriver driver = BaseSteps.driver;
    private String url =  LoadProperties.userData.getProperty("url");;




    @Given("Visit url")
    public void visitUrl() {
        driver.get(url);
    }

    @When("^Login with a valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void login_with_a_valid_and(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        LoginPage.getInstance(driver)
                .addCredential(arg1,arg2)
                .clickLogin();
    }

    @And("Verify that you’ve been logged in successfully and navigated to the products page")
    public void verifyThatYouVeBeenLoggedInSuccessfullyAndNavigatedToTheProductsPage() {
        ProductsPage.get()
                .verifyExistInProductsPage();
    }

    @And("Add the most expensive two products to your cart")
    public void addTheMostExpensiveTwoProductsToYourCart() {

  ProductsPage.get()
          .getPrices()
          .sortPrices()
          .addProductsToCart();
    }

    @And("Click on the cart button")
    public void clickOnTheCartButton() {

        ProductsPage.get().clickCardBtn();

    }

    @And("Verify that you’ve been navigated to “Cart” page and the previously selected products are displayed at the page")
    public void verifyThatYouVeBeenNavigatedToCartPageAndThePreviouslySelectedProductsAre() {
        ProductsPage.get().verifyCartPage();
    }


    @And("Click on the “Checkout” button")
    public void clickOnTheCheckoutButton() {
        ProductsPage.get().clickCheckout();
    }

    @And("Verify that you’ve been navigated to the “Checkout” page")
    public void verifyThatYouVeBeenNavigatedToTheCheckoutPage() {
        CheckoutPage.get().verifyExistInCheckoutPage();;
    }

    @And("Fill all the displayed form")
    public void fillAllTheDisplayedForm() {
        CheckoutPage.get().fillAllData();
    }
    @And("Click on the “Continue” button")
    public void clickOnTheContinueButton() {
        CheckoutPage.get().clickContinue();
    }

    @Then("Verify that you’ve been navigated to the “Overview” page")
    public void verifyThatYouVeBeenNavigatedToTheOverviewPage() {
        CheckoutPage.get().verifyCheckoutOverviewPage();

    }

    @Then("Verify the Items total amount before taxes")
    public void verifyTheItemsTotalAmountBeforeTaxes() {
        CheckoutPage.get().verifyTotalAmount();
    }

    @Then("Verify that the URL matches with this url")
    public void verifyThatTheURLMatchesWithThisUrl() {
          CheckoutPage.get().softAssert.assertTrue(BaseSteps.driver.getCurrentUrl().equals(GlobalConstant.STEPTOWURL));

    }

    @Then("Click on the “Finish” button")
    public void clickOnTheFinishButton() {
        CheckoutPage.get().clickFinish();
    }

    @Then("Verify both, the_ThankYou_and the _order has been dispatched_ messages")
    public void verifyBothTheThankYouAndTheOrderHasBeenDispatchedMessages() {

        CheckoutPage.get().VerifyEndMessages(GlobalConstant.HEADER,GlobalConstant.MESSAGE);

    }



    @When("Login with invalid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void loginWithInvalidCredentials(String usName, String pass) {
        LoginPage.getInstance(driver)
                .addCredential(usName,pass)
                .clickLogin();
    }

    @Then("Verify each error message")
    public void verifyEachErrorMessage() {
        LoginPage.getInstance(driver).checkErrorMessage();
    }


}
