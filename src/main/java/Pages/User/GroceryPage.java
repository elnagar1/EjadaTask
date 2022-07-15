package Pages.User;

import Utilities.Base.PageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GroceryPage extends PageBase {

    public GroceryPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@text='Supermarket']")
    public MobileElement supermarketCategory;

    @AndroidFindBy(id = "bottom")
    public MobileElement nearestSupermarketBt;

    @AndroidFindBy(id = "text_view_add_to_cart")
    public MobileElement addBt;

    @AndroidFindBy(id = "text_view_add")
    public MobileElement plusBt;

    @AndroidFindBy(id = "iv_add_new_item")
    public MobileElement specialItemBt;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView")
    public MobileElement addSpecialItemBt;

    @AndroidFindBy(id = "et_add_item_order_anything")
    public MobileElement anotherProductTx;

    @AndroidFindBy(id = "btnConfirmBasket")
    public MobileElement addToCardBt;

    @AndroidFindBy(xpath = "//*[@text='Vegetables']")
    public MobileElement subcategoryBt;

    @AndroidFindBy(xpath = "//*[@text='View Cart']")
    public MobileElement checkoutBt;

    @AndroidFindBy(id = "ib_basket")
    public MobileElement counterBasketBt;

    @AndroidFindBy(id = "textView")
    public MobileElement supermarketDeliveryFee;

    @AndroidFindBy(id = "tvAddNewItem_basket")
    public MobileElement addOtherItemBt;

    @AndroidFindBy(id = "btnCancelDelete")
    public MobileElement cancelDeleteBt;

    @AndroidFindBy(id = "btnConfirmDelete")
    public MobileElement confirmDeleteBt;

    @AndroidFindBy(id = "tv_logout_order_notes_dialog")
    public MobileElement clearAllDialog;


    @AndroidFindBy(id = "tvProceed")
    public MobileElement proceedToCheckoutBt;

    @AndroidFindBy(id = "confirm")
    public MobileElement orderPriceSubmitBt;

    @AndroidFindBy(id = "tvLessThan100")
    public MobileElement lessThan100Bt;

    @AndroidFindBy(id = "storeName")
    public MobileElement storeName;

    @AndroidFindBy(id = "favoriteName")
    public MobileElement location;

    @AndroidFindBy(id = "change")
    public MobileElement changeLocation;

    @AndroidFindBy(id = "linearProducts")
    public MobileElement productsList;

    @AndroidFindBy(id = "cash")
    public MobileElement cashBt;

    @AndroidFindBy(id = "wallet")
    public MobileElement walletBt;

    @AndroidFindBy(id = "online")
    public MobileElement onlineBt;

    @AndroidFindBy(id = "five")
    public MobileElement fiveShgardiTipBt;

    @AndroidFindBy(id = "customTipValue")
    public MobileElement otherShgradiTipBt;

    @AndroidFindBy(id = "reset")
    public MobileElement resetShgardiTipBt;

    @AndroidFindBy(id = "hasPromo")
    public MobileElement promoCodeBt;

    @AndroidFindBy(id = "radio")
    public MobileElement firstPromoCodeBt;

    @AndroidFindBy(id = "btn")
    public MobileElement submitPromoCodeBt;

    @AndroidFindBy(id = "promoValue")
    public MobileElement promoCodeValue;

    @AndroidFindBy(id = "fees_delivery_layout")
    public MobileElement invoiceBreakDown;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView")
    public MobileElement orderPrice;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout[2]/android.widget.TextView[1]")
    public MobileElement deliveryFee;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.TextView[1]")
    public MobileElement shgardiTip;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.LinearLayout/android.widget.TextView[1]")
    public MobileElement subtotal;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.LinearLayout/android.view.ViewGroup[5]/android.widget.LinearLayout/android.widget.TextView[1]")
    public MobileElement totalPrice;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.LinearLayout/android.view.ViewGroup[6]/android.widget.LinearLayout/android.widget.TextView[1]")
    public MobileElement totalInvoice;

    @AndroidFindBy(id = "btn")
    public MobileElement placeOrderBt;

    @AndroidFindBy(id = "title")
    public MobileElement trackOrderScreen;


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




