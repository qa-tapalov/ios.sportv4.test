package Tests;

import PageObject.InitialClass;
import io.appium.java_client.MobileElement;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartItemTest extends InitialClass {

    @Test
    public void checkElementOnCartItem() throws InterruptedException {
        openListing("10671281");
        clickOnElement(lPage.getImageItem());
        checkElementOnPage(cartPage.getBackBtn());
        checkElementOnPage(cartPage.getImageItem());
        checkElementOnPage(cartPage.getCompareEmpty());
        checkElementOnPage(cartPage.getFavoriteEmpty());
        checkElementOnPage(cartPage.getShare());
        checkElementOnPage(cartPage.getLabel());
        checkElementOnPage(cartPage.getIconReview());
        checkElementOnPage(cartPage.getIconBrand());
        verticalSwipeByPercentages(0.8,0.4,0.5);
        checkElementOnPage(cartPage.getColors());
        checkElementOnPage(cartPage.getSizeGroups());
        checkElementOnPage(cartPage.getSize1());
        checkElementOnPage(cartPage.getSizes());
        checkElementOnPage(cartPage.getAddBasketMain());
        checkElementOnPage(cartPage.getDefaultPickup());
        verticalSwipeByPercentages(0.8,0.4,0.5);
        checkElementOnPage(cartPage.getDescription());
        checkElementOnPage(cartPage.getSpecifications());

    }

    //взаимодействие с картинкой товара
    //https://testrail.app.local/testrail/index.php?/cases/view/684813
    @Test
    public void imageGallery() throws InterruptedException {
        openListing("10642580");
        clickOnElement(lPage.getImageItem());
        clickOnElement(cartPage.getImageItem());
        clickOnElement(cartPage.getCloseGallery());
        checkElementOnPage(cartPage.getIndicatorGallery());

    }


    //воспроизведение видео
    //https://testrail.app.local/testrail/index.php?/cases/view/684816
//    @Test
//    public void videoOnItem() throws InterruptedException {
//        openListing("10656190");
//        clickOnElement(lPage.getImageItem());
//        clickOnElement(cartPage.getPlayVideo());
//        checkElementOnPage(cartPage.getPlayPause());
//        driver.navigate().back();
//        checkElementOnPage(cartPage.getPlayVideo());
//    }


    //отображение рич контента
    //https://testrail.app.local/testrail/index.php?/cases/view/687803
    @Test
    public void checkItemWithRichContent() throws InterruptedException {
        openListing("10558310");
        clickOnElement(lPage.getImageItem());
        checkElementOnPage(cartPage.getRichContent());
        verticalSwipeByPercentages(0.8,0.4,0.5);
        clickOnElement(cartPage.getRichContent());
        checkElementOnPage(cartPage.getRichWebView());

    }
    //открытие таблицы размеров
    //https://testrail.app.local/testrail/index.php?/cases/view/684821
    @Test
    public void openTableSize() throws InterruptedException {
        openListing("10671281");
        clickOnElement(lPage.getImageItem());
        Thread.sleep(2000);
        verticalSwipeByPercentages(0.8,0.3,0.5);
        clickOnElement(cartPage.getTableSizeLink());
        checkElementOnPage(cartPage.getTableView());
        driver.navigate().back();
        checkElementOnPage(cartPage.getTableSizeLink());
    }



    //нельзя добавить товар в корзину без выбора размера
    //
    @Test
    public void checkSnackChooseSize() throws InterruptedException {
        openListing("10671281");
        clickOnElement(lPage.getImageItem());
        scrollToMobileElement("Вопросы о товаре", "down");
        clickOnElement(cartPage.getBtnAddBasketFloat());
        assertElementByText(cartPage.getSnackChooseSize(),"Выберите размер");


    }


}
