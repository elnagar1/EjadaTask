package Pages.User;

import Utilities.Base.AndroidPageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SupermarketOrderPage extends AndroidPageBase {

    public SupermarketOrderPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@text='Supermarket']")
    public AndroidElement supermarketCategory;

    @AndroidFindBy(id = "bottom")
    public AndroidElement nearestSupermarketBt;

    @AndroidFindBy(id = "text_view_add_to_cart")
    public AndroidElement addBt;

    @AndroidFindBy(id = "text_view_add")
    public AndroidElement plusBt;

    @AndroidFindBy(id = "iv_add_new_item")
    public AndroidElement specialItemBt;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView")
    public AndroidElement addSpecialItemBt;

    @AndroidFindBy(id = "et_add_item_order_anything")
    public AndroidElement anotherProductTx;

    @AndroidFindBy(id = "btnConfirmBasket")
    public AndroidElement addToCardBt;

    @AndroidFindBy(xpath = "//*[@text='Vegetables']")
    public AndroidElement subcategoryBt;

    @AndroidFindBy(xpath = "//*[@text='View Cart']")
    public AndroidElement checkoutBt;

    @AndroidFindBy(id = "ib_basket")
    public AndroidElement counterBasketBt;

    @AndroidFindBy(id = "textView")
    public AndroidElement supermarketDeliveryFee;

    @AndroidFindBy(id = "tvAddNewItem_basket")
    public AndroidElement addOtherItemBt;

    @AndroidFindBy(id = "btnCancelDelete")
    public AndroidElement cancelDeleteBt;

    @AndroidFindBy(id = "btnConfirmDelete")
    public AndroidElement confirmDeleteBt;

    @AndroidFindBy(id = "tv_logout_order_notes_dialog")
    public AndroidElement clearAllDialog;


    @AndroidFindBy(id = "tvProceed")
    public AndroidElement proceedToCheckoutBt;

    @AndroidFindBy(id = "confirm")
    public AndroidElement orderPriceSubmitBt;

    @AndroidFindBy(id = "tvLessThan100")
    public AndroidElement lessThan100Bt;

    @AndroidFindBy(id = "storeName")
    public AndroidElement storeName;

    @AndroidFindBy(id = "favoriteName")
    public AndroidElement location;

    @AndroidFindBy(id = "change")
    public AndroidElement changeLocation;

    @AndroidFindBy(id = "linearProducts")
    public AndroidElement productsList;

    @AndroidFindBy(id = "cash")
    public AndroidElement cashBt;

    @AndroidFindBy(id = "wallet")
    public AndroidElement walletBt;

    @AndroidFindBy(id = "online")
    public AndroidElement onlineBt;

    @AndroidFindBy(id = "five")
    public AndroidElement fiveShgardiTipBt;

    @AndroidFindBy(id = "customTipValue")
    public AndroidElement otherShgradiTipBt;

    @AndroidFindBy(id = "reset")
    public AndroidElement resetShgardiTipBt;

    @AndroidFindBy(id = "hasPromo")
    public AndroidElement promoCodeBt;

    @AndroidFindBy(id = "radio")
    public AndroidElement firstPromoCodeBt;

    @AndroidFindBy(id = "btn")
    public AndroidElement submitPromoCodeBt;

    @AndroidFindBy(id = "promoValue")
    public AndroidElement promoCodeValue;

    @AndroidFindBy(id = "fees_delivery_layout")
    public AndroidElement invoiceBreakDown;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView")
    public AndroidElement orderPrice;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout[2]/android.widget.TextView[1]")
    public AndroidElement deliveryFee;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.TextView[1]")
    public AndroidElement shgardiTip;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.LinearLayout/android.widget.TextView[1]")
    public AndroidElement subtotal;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.LinearLayout/android.view.ViewGroup[5]/android.widget.LinearLayout/android.widget.TextView[1]")
    public AndroidElement totalPrice;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.LinearLayout/android.view.ViewGroup[6]/android.widget.LinearLayout/android.widget.TextView[1]")
    public AndroidElement totalInvoice;

    @AndroidFindBy(id = "btn")
    public AndroidElement placeOrderBt;

    @AndroidFindBy(id = "title")
    public AndroidElement trackOrderScreen;


    public void clickSupermarketCategory() {
        supermarketCategory.click();
    }

    public void clickNearestSupermarketBt() {
        nearestSupermarketBt.click();
    }

    public void clickAddBt() {
        addBt.click();
    }

    public void clickPlusBT() {
        plusBt.click();
    }

    public void clickSpecialItemBt() {
        specialItemBt.click();
    }

    public void clickAddSpecialItemBt() {
        addSpecialItemBt.click();
    }

    public void addAnotherProductTx(String anotherProduct) {
        anotherProductTx.sendKeys(anotherProduct);
    }

    public void clickAddToCartBt() {
        addToCardBt.click();
    }

    public void clickSubcategoryBt() {
        subcategoryBt.click();
    }

    public void clickCheckoutBt() {
        checkoutBt.click();
    }

    public void clickCounterBasketBt() {
        counterBasketBt.click();
    }

    public void clickAddOtherItemBt() {
        addOtherItemBt.click();
    }

    public void clickCancelDeleteBt() {
        cancelDeleteBt.click();
    }

    public void clickConfirmDeleteBt() {
        confirmDeleteBt.click();
    }

    public void clickProceedToCheckout() {
        proceedToCheckoutBt.click();
    }

    public void clickOrderPriceSubmitBt() {
        orderPriceSubmitBt.click();
    }

    public void clickLessThan100Bt() {
        lessThan100Bt.click();
    }

    public void clickChangeLocation() {
        changeLocation.click();
    }

    public void clickProductList() {
        productsList.click();
    }

    public void clickCashBt() {
        cashBt.click();
    }

    public void clickWalletBt() {
        walletBt.click();
    }

    public void clickOnlineBt() {
        onlineBt.click();
    }

    public void clickFiveShgradiTipBt() {
        fiveShgardiTipBt.click();
    }

    public void clickRestShgardiTipBt() {
        resetShgardiTipBt.click();
    }

    public void clickPromoCodeBt() {
        promoCodeBt.click();
    }

    public void clickFirstPromoCodeBt() {
        firstPromoCodeBt.click();
    }

    public void clickSubmitPromoCodeBt() {
        submitPromoCodeBt.click();
    }

    public void getOrderPrice() {
        orderPrice.getText();
    }

    public void getDeliveryFee() {
        deliveryFee.getText();
    }

    public void getShgardiTip() {
        shgardiTip.getText();
    }

    public void getSubtotal() {
        subtotal.getText();
    }

    public void getTotalPrice() {
        totalPrice.getText();
    }

    public void getTotalInvoice() {
        totalInvoice.getText();
    }

    public void clickPlaceOrderBt() {
        placeOrderBt.click();
    }


}




