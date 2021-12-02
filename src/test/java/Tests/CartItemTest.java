package Tests;

import PageObject.InitialClass;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartItemTest extends InitialClass {

    @Epic("Карточка товара")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/684815")
    @Description("Проверка элементов в карточке товара")
    @Test
    public void checkElementOnCartItem() throws InterruptedException {
        clickOnElement(onboardPage.getCloseBtn());
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
        verticalSwipeByPercentages(0.8,0.2,0.5);
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

    @Epic("Карточка товара")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/684815")
    @Description("Проверка отображение блока отзывы")
    @Test
    public void checkBoxReview() throws InterruptedException {
        clickOnElement(onboardPage.getCloseBtn());
        openListing("10671281");
        clickOnElement(lPage.getImageItem());
        scrollToMobileElement("Отзывы покупателей", "down");
        checkElementOnPage(cartPage.getReviewBox());

    }


    @Epic("Карточка товара")
    @Feature("Фото товара")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/684813")
    @Description("Взаимодействие с картинкой товара")
    @Test
    public void imageGallery() throws InterruptedException {
        clickOnElement(onboardPage.getCloseBtn());
        openListing("10642580");
        clickOnElement(lPage.getImageItem());
        clickOnElement(cartPage.getImageItem());
        clickOnElement(cartPage.getCloseGallery());
        checkElementOnPage(cartPage.getIndicatorGallery());

    }



//    @Epic("Карточка товара")
//    @Feature("Видео товара")
//    @Link("https://testrail.app.local/testrail/index.php?/cases/view/684816")
//    @Description("Наличие кнопки воспроизведения видео и воспроизведение видео")
//    @Test
//    public void videoOnItem() throws InterruptedException {
//        openListing("10656190");
//        clickOnElement(lPage.getImageItem());
//        clickOnElement(cartPage.getPlayVideo());
//        checkElementOnPage(cartPage.getPlayPause());
//        driver.navigate().back();
//        checkElementOnPage(cartPage.getPlayVideo());
//    }



    @Epic("Карточка товара")
    @Feature("Товар с рич контентом")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/687803")
    @Description("Отображение рич контента и его кликабельность")
    @Test
    public void checkItemWithRichContent() throws InterruptedException {
        clickOnElement(onboardPage.getCloseBtn());
        openListing("10558310");
        clickOnElement(lPage.getImageItem());
        checkElementOnPage(cartPage.getRichContent());
        verticalSwipeByPercentages(0.8,0.3,0.5);
        clickOnElement(cartPage.getRichContent());
        checkElementOnPage(cartPage.getRichWebView());

    }

    @Epic("Карточка товара")
    @Feature("Таблица размеров")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/684821")
    @Description("Проверка наличия ссылки на таблицу размеров и её открытие")
    @Test
    public void openTableSize() throws InterruptedException {
        clickOnElement(onboardPage.getCloseBtn());
        openListing("10671281");
        clickOnElement(lPage.getImageItem());
        Thread.sleep(2000);
        verticalSwipeByPercentages(0.8,0.3,0.5);
        clickOnElement(cartPage.getTableSizeLink());
        checkElementOnPage(cartPage.getTableView());
        driver.navigate().back();
        checkElementOnPage(cartPage.getTableSizeLink());
    }


    @Test
    @Epic("Карточка товара")
    @Feature("Блок доступности")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/684825")
    @Description("Проверка появления блока доступности товара в магазине")
    public void checkDefaultPickup() throws InterruptedException {
        clickOnElement(onboardPage.getCloseBtn());
        openListing("10642580");
        clickOnElement(lPage.getImageItem());
        verticalSwipeByPercentages(0.8,0.3,0.5);
        checkElementOnPage(cartPage.getDefaultPickup());
        clickOnElement(cartPage.getSizeItem1());
        checkElementOnPage(cartPage.getPickup());

    }

    @Epic("Карточка товара")
    @Feature("Добавление в корзину с КТ")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/684819")
    @Description("Проверка появления алерта, при добавлении в корзину, если не выбрать размер")
    @Test
    public void checkSnackChooseSize() throws InterruptedException {
        clickOnElement(onboardPage.getCloseBtn());
        openListing("10671281");
        clickOnElement(lPage.getImageItem());
        scrollToMobileElement("Вопросы о товаре", "down");
        clickOnElement(cartPage.getBtnAddBasketFloat());


    }


}
