package Tests;

import PageObject.InitialClass;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Link;
import org.junit.Test;

public class ListingTest extends InitialClass {

    @Epic("Плитка товаров")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/671850")
    @Description("Проверка наличия элементов в товарной плитке")
    @Test
    public void checkElementOnListing() throws InterruptedException {
        clickOnElement(onboardPage.getCloseBtn());
        openListing("10672588");
        checkElementOnPage(lPage.getIconSort());
        checkElementOnPage(lPage.getSort());
        checkElementOnPage(lPage.getCompare());
        checkElementOnPage(lPage.getFilters());
        checkElementOnPage(lPage.getCardStyle());
    }

    @Epic("Плитка товаров")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/671854")
    @Description("Проверка наличия элементов на карточке товара в товарной плитке")
    @Test
    public void checkElementOnItem() throws InterruptedException {
        clickOnElement(onboardPage.getCloseBtn());
        openListing("10672588");
        checkElementOnPage(lPage.getImageItem());
        checkElementOnPage(lPage.getCompareItem());
        checkElementOnPage(lPage.getFavoriteItem());
        checkElementOnPage(lPage.getReviewItem());
        checkElementOnPage(lPage.getBasketBtn());

    }


    @Test
    public void checkElementOnWindowChooseSize() throws InterruptedException {
        clickOnElement(onboardPage.getCloseBtn());
        openListing("10672588");
        clickOnElement(lPage.getBasketBtn());
        checkElementOnPage(lPage.getBottomSheetChooseSize());
        checkElementOnPage(lPage.getSizeChooser());
        checkElementOnPage(lPage.getSizeGroup());
    }

    @Test
    public void addBasketFromListing() throws InterruptedException {
        clickOnElement(onboardPage.getCloseBtn());
        openListing("10672588");
        clickOnElement(lPage.getBasketBtn());
        chooseAvailableSize();
        clickOnElement(lPage.getAddBasketBtn());
    }



}
