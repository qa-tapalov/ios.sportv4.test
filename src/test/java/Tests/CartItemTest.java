package Tests;

import Pages.InitialClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;

public class CartItemTest extends InitialClass {

    @Test
    public void checkElementOnCartItem() throws InterruptedException {
        openListing("10672588");
        clickOnElement(lPage.getImageItem());
        checkElementOnPage(cartPage.getBackBtn());
        checkElementOnPage(cartPage.getImageItem());
        checkElementOnPage(cartPage.getCompareEmpty());
        checkElementOnPage(cartPage.getFavoriteEmpty());
        checkElementOnPage(cartPage.getShare());
        checkElementOnPage(cartPage.getLabel());
        checkElementOnPage(cartPage.getIconReview());
        checkElementOnPage(cartPage.getIconBrand());
        scrollToMobileElement("productCardDeliveryNoDataKey","down");
        checkElementOnPage(cartPage.getColors());
        checkElementOnPage(cartPage.getSizeGroups());
        checkElementOnPage(cartPage.getSize1());
        checkElementOnPage(cartPage.getSizes());
        checkElementOnPage(cartPage.getAddBasketMain());
        checkElementOnPage(cartPage.getDefaultPickup());
        checkElementOnPage(cartPage.getPickup());
        checkElementOnPage(cartPage.getAddBasketFloat());
        checkElementOnPage(cartPage.getBtnAddBasketFloat());
        checkElementOnPage(cartPage.getPriceAddBasketFloat());
        checkElementOnPage(cartPage.getDescription());
        checkElementOnPage(cartPage.getSpecifications());
        checkElementOnPage(cartPage.getReviewBox());
        checkElementOnPage(cartPage.getQuestionsBox());



    }

    @Test
    public void scroll() throws InterruptedException {
        openListing("10672588");
        clickOnElement(lPage.getImageItem());
        scrollToMobileElement("productCardDeliveryNoDataKey","down");
        checkElementOnPage(cartPage.getDefaultPickup());
    }




}
