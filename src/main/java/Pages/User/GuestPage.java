package Pages.User;

import Utilities.Base.AndroidPageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GuestPage extends AndroidPageBase {

    public GuestPage(AndroidDriver driver) {
        super(driver);
    }
    @AndroidFindBy(id = "continue_no_login")
    public AndroidElement continueWithoutBt;

    @AndroidFindBy(id = "btn_explore_competition")
    public AndroidElement exploreBt;

    @AndroidFindBy(id = "tv_are_you_sure_login_dialog")
    public AndroidElement loginDialog;

    @AndroidFindBy(id = "btnlogin_login_dialog")
    public AndroidElement loginBt;

    @AndroidFindBy(id = "btnlogin_login_dialog")
    public AndroidElement notnowBt;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ImageView")
    public AndroidElement supermarketBt;

    @AndroidFindBy(id = "name")
    public AndroidElement storeBt;

    @AndroidFindBy(id = "btn_got_it")
    public AndroidElement specialOffersDialog;

    @AndroidFindBy(className = "android.view.ViewGroup")
    public AndroidElement storeItem;

    @AndroidFindBy(className = "android.widget.TextView")
    public AndroidElement addToCartBt;

    @AndroidFindBy(id = "name")
    public AndroidElement supermarketCardBt;

//    @AndroidFindBy(id = "text_view_add_to_cart")
//    public AndroidElement supermarketItemBt;

    @AndroidFindBy(id = "text_view_add_to_cart")
    public AndroidElement supermarketItemBt;

    @AndroidFindBy(id = "floatingCart")
    public AndroidElement floatingCartBt;

    @AndroidFindBy(id = "tvProceed")
    public AndroidElement checkoutBt;

    @AndroidFindBy(id = "cart")
    public AndroidElement basketBt;

    @AndroidFindBy(id = "imageView17")
    public AndroidElement notificationBt;

    @AndroidFindBy(id = "text_view_open_save_loc")
    public AndroidElement locationBt;

    @AndroidFindBy(id = "page_myOrders")
    public AndroidElement myOrdersBt;

    @AndroidFindBy(id = "btn_order_layout_no_orders")
    public AndroidElement orderNowBt;

//    @AndroidFindBy(xpath = "//*[@text='Supermarket']")
//    public AndroidElement supermarketBt;


    public void clickContinueWithoutBt () { continueWithoutBt.click(); }
    public void clickExploreBt () { exploreBt.click(); }
    public void clickLoginBt () { loginBt.click(); }
    public void clickNotnowBt () { notnowBt.click(); }
    public void clickSupermarketBt () { supermarketBt.click(); }
    public void clickStoreBt () { storeBt.click(); }
    public void clickStoreItem () { storeItem.click(); }
    public void clickAddToCartBt () { addToCartBt.click(); }
    public void clickSupermarketCardBt () { supermarketCardBt.click(); }
    public void clickSupermarketItemBt () { supermarketItemBt.click(); }
    public void clickCheckoutBt () { checkoutBt.click(); }
    public void clickBasketBt () { basketBt.click(); }
    public void clickLocationBt () { locationBt.click(); }
    public void clickMyOrdersBt () { myOrdersBt.click(); }
    public void clickOrderNowBt () { orderNowBt.click(); }
    public void clickFloatingCartBt () { floatingCartBt.click(); }
    public void clickNotificationBt () { notificationBt.click(); }
    public void clickSpecialOffersDialog () { specialOffersDialog.click(); }
    public void openLoginDialog() { loginDialog.click(); }




}

