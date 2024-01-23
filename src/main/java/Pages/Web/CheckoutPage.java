package Pages.Web;

import Steps.BaseSteps;
import Utilities.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase {
    public  static CheckoutPage instance;
    @FindBy(xpath = "//span[@class='title']")
    WebElement checkoutTitle;
    @FindBy(xpath = "//*[@id='first-name']")
    WebElement firstNameTxb;
    @FindBy(xpath = "//*[@id='last-name']")
    WebElement lastNameTxb;
    @FindBy(xpath = "//*[@id='postal-code']")
    WebElement postalCodeTxb;
    @FindBy(xpath = "//*[@id='continue']")
    WebElement continueBtn;
    @FindBy(xpath = "//span[@class='title']")
    WebElement checkoutOverviewTitle;

    @FindBy(xpath = " //*[@class = 'summary_subtotal_label']")
    WebElement subAmountLbl;

    @FindBy(xpath = "//*[@id='finish']")
    WebElement finishBtn;

    @FindBy(xpath = "//*[@class='complete-header']")
    WebElement completeHeader;

    @FindBy(xpath = "//*[@class='complete-text']")
    WebElement completeText;
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public static CheckoutPage getInstance(WebDriver driver) {
        instance = new CheckoutPage(driver);
        return instance;
    }

    public static CheckoutPage get() {
        if (instance == null) {
            instance = new CheckoutPage(BaseSteps.driver);
        }
        return instance;
    }

    public void verifyExistInCheckoutPage() {
        hardAssert.assertTrue(checkoutTitle.getText().equalsIgnoreCase("Checkout: Your Information"));
    }

    public void fillAllData() {
        setText(firstNameTxb,"Ahmed");
        setText(lastNameTxb,"Ali");
        setText(postalCodeTxb,"10983");
    }

    public void verifyCheckoutOverviewPage() {
        hardAssert.assertTrue(checkoutOverviewTitle.getText().equalsIgnoreCase("Checkout: Overview"));

    }
    public  void clickContinue(){
        click(continueBtn);
    }

    public void verifyTotalAmount() {
       String xx = subAmountLbl.getText().replace("Item total: $","");
       System.out.println("XXXX"+xx);
        softAssert.assertTrue(xx.equals(ProductsPage.get().getPricesAmounts()+""));

    }

    public void clickFinish() {
        click(finishBtn);
    }

    public void VerifyEndMessages(String header, String Message) {
        softAssert.assertTrue(completeHeader.getText().equals(header));
        softAssert.assertTrue(completeText.getText().equals(Message));
    }
}
