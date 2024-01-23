package Pages.Web;

import Steps.BaseSteps;
import Utilities.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductsPage extends PageBase {
    public  static ProductsPage instance;
    List prices = new ArrayList<>();
    @FindBy(xpath = "//*[@id='shopping_cart_container']")
    WebElement shoppingIc;
    @FindAll({@FindBy(xpath = "//*[@class='inventory_item_price']")})
    List<WebElement> productElements;

    @FindBy(xpath = "//span[@class='title']")
    WebElement cartTitle;
    @FindBy(xpath = "//*[@id='checkout']")
    WebElement checkoutBtn;
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public static ProductsPage getInstance(WebDriver driver) {
        instance = new ProductsPage(driver);
        return instance;
    }

    public static ProductsPage get() {
        if (instance == null) {
            instance = new ProductsPage(BaseSteps.driver);
        }
        return instance;
    }

    public ProductsPage verifyExistInProductsPage() {
        hardAssert.assertTrue(isDisplayed(shoppingIc));
        hardAssert.assertEquals(BaseSteps.driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");

        return this;
    }

    public ProductsPage getPrices() {

        for (WebElement productElement : productElements) {
            String priceText = productElement.getText();
            double price = Double.parseDouble(priceText.substring(1).replace("$", ""));
            prices.add(price);
        }
        return  this;
    }
 public  ProductsPage sortPrices() {
     //Sort
     prices.sort(Comparator.reverseOrder());

     return this;
 }
 public void addProductsToCart(){
     // Add the top two products to cart
     for (int i = 0; i < 2; i++) {
         WebElement addToCartButton1 = BaseSteps.driver.findElement(By.xpath("//*[text()='" + prices.get(i) + "']//following-sibling::button"));
         addToCartButton1.click();
     }
 }





    public void clickCardBtn() {
        click(shoppingIc);
    }

    public void verifyCartPage() {
      hardAssert.assertTrue(cartTitle.getText().equalsIgnoreCase("Your Cart"));
        for (int i = 0; i < 2; i++) {
             BaseSteps.driver.findElement(By.xpath("//*[text()='" + prices.get(i) + "']"));
        }
    }
    public void clickCheckout() {
        click(checkoutBtn);
    }

    public Double  getPricesAmounts(){
    Double x = .0;
        for (int i = 0; i < 2; i++) {
           Double amount = (Double) prices.get(i);
            x =x+ amount;
        }
        return  x;
    }
}
