package Tests;

import PageObject.InitialClass;
import io.appium.java_client.MobileElement;
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
//    @Epic("Корзина")
//    @Feature("Первый экран корзины")
//    @Link("https://testrail.app.local/testrail/index.php?/cases/view/727986")
//    @Description("Верстка корзины с товарами")
    public void itemsInBasket() throws InterruptedException {
//        clickOnElement(onboardPage.getCloseBtn());
        addItemOnBasket("10542186",1);
        checkElementOnPage(basketPage.getBtnMain());

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
//    @Epic("Корзина")
//    @Feature("Первый экран корзины")
//    @Story("Изменение города")
//    @Link("https://testrail.app.local/testrail/index.php?/cases/view/727987")
//    @Description("Изменение города в корзине")
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
    public void test() throws InterruptedException {
        openListing("10542186");

    }

}
