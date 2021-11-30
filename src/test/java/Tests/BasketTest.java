package Tests;

import PageObject.InitialClass;
import io.appium.java_client.MobileElement;
import io.qameta.allure.*;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasketTest extends InitialClass {

    @Test
//    @Epic("Корзина")
//    @Feature("Первый экран корзины")
//    @Link("https://testrail.app.local/testrail/index.php?/cases/view/727985")
//    @Description("Верстка пустой корзины")
    public void checkEmptyBasket(){
//        clickOnElement(onboardPage.getCloseBtn());
        clickOnElement(basketPage.getBasket());
        assertElementByText(basketPage.getTitleBasket(),"Корзина");
        checkElementOnPage(basketPage.getChooseCity());
        checkElementOnPage(basketPage.getCityName());
        checkElementOnPage(basketPage.getEmptyBasketImage());
        checkElementOnPage(basketPage.getEmptyBasketText());
        checkElementOnPage(basketPage.getBtnToCatalog());

    }


    //добавить кредит, тотал, баннер, промокод
    @Test
    @Epic("Корзина")
    @Feature("Первый экран корзины")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/727986")
    @Description("Плавающая кнопка в корзину")
    public void itemsInBasket() throws InterruptedException {
//        clickOnElement(onboardPage.getCloseBtn());
        addItemOnBasket("10542186",1);
        checkElementOnPage(basketPage.getBlockFloat());
        checkElementOnPage(basketPage.getBtnFloat());
        checkElementOnPage(basketPage.getBlockFloatPrice());
        checkElementOnPage(basketPage.getBtnFloat());
    }

    @Test
    @Epic("Корзина")
    @Feature("Первый экран корзины")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/727986")
    @Description("Блок кредита")
    public void creditOnBasket() throws InterruptedException {
        addItemOnBasket("10542186",1);
        checkElementOnPage(basketPage.getCreditConteiner());
        checkElementOnPage(basketPage.getCreditIcon());
        checkElementOnPage(basketPage.getCreditTitle());
        checkElementOnPage(basketPage.getCreditDesc());
        checkElementOnPage(basketPage.getCreditLable());


    }

    @Test
//    @Epic("Корзина")
//    @Feature("Первый экран корзины")
//    @Story("Изменение города")
//    @Link("https://testrail.app.local/testrail/index.php?/cases/view/727987")
//    @Description("Верстка блока изменения города")
    public void checkElementOnCityChooser(){
//        clickOnElement(onboardPage.getCloseBtn());
        clickOnElement(basketPage.getBasket());
        clickOnElement(basketPage.getChooseCity());
        checkElementOnPage(basketPage.getTitleChooserCity());
        checkElementOnPage(basketPage.getSearchBarOnChooserCity());


    }


    @Test
    @Epic("Корзина")
    @Feature("Первый экран корзины")
    @Story("Изменение города")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/727987")
    @Description("Изменение города в корзине")
    public void changeCity(){
//        clickOnElement(onboardPage.getCloseBtn());
        clickOnElement(basketPage.getBasket());
        MobileElement cityName = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(basketPage.getCityName()));
        System.out.println("Город до изменения: " + cityName.getText());
        clickOnElement(basketPage.getChooseCity());
        clickOnElement(basketPage.getCityNameOnChooserCity());
        clickOnElement(basketPage.getBasket());

    }

    @Test
    @Epic("Корзина")
    @Feature("Первый экран корзины")
    @Story("Список товаров")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/727991")
    @Description("Отображение и кликабельность лейблов у товара")
    public void checkLabelOnItem() throws InterruptedException {
//        clickOnElement(onboardPage.getCloseBtn());
        clickOnElement(onboardPage.getCloseBtn());
        addItemOnBasket("10542186",1);
        checkElementOnPage(basketPage.getLabelFinalPrice());
        clickOnElement(basketPage.getLabelFinalPrice());
        checkElementOnPage(basketPage.getBottomSheetLabel());
        checkElementOnPage(basketPage.getBottomSheetLabelTitle());
        checkElementOnPage(basketPage.getBottomSheetLabelDesc());


    }

}
