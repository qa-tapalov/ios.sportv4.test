package Tests;

import PageObject.InitialClass;
import org.junit.Test;

public class ListingTest extends InitialClass {

    @Test
    public void checkElementOnListing() throws InterruptedException {
        openListing("10672588");
        checkElementOnPage(lPage.getIconSort());
        checkElementOnPage(lPage.getSort());
        checkElementOnPage(lPage.getCompare());
        checkElementOnPage(lPage.getFilters());
        checkElementOnPage(lPage.getCardStyle());
    }

    @Test
    public void checkElementOnItem() throws InterruptedException {
        openListing("10672588");
        checkElementOnPage(lPage.getImageItem());
        checkElementOnPage(lPage.getCompareItem());
        checkElementOnPage(lPage.getFavoriteItem());
        checkElementOnPage(lPage.getReviewItem());
        checkElementOnPage(lPage.getBasketBtn());

    }

    @Test
    public void checkElementOnWindowChooseSize() throws InterruptedException {
        openListing("10672588");
        clickOnElement(lPage.getBasketBtn());
        checkElementOnPage(lPage.getBottomSheetChooseSize());
        checkElementOnPage(lPage.getSizeChooser());
        checkElementOnPage(lPage.getSizeGroup());
    }

    @Test
    public void addBasketFromListing() throws InterruptedException {
        openListing("10672588");
        clickOnElement(lPage.getBasketBtn());
        chooseAvailableSize();
        clickOnElement(lPage.getAddBasketBtn());
    }



}
