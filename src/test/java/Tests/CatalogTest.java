package Tests;

import PageObject.InitialClass;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Link;
import org.junit.Test;

public class CatalogTest extends InitialClass {

    @Epic("Каталог приложения")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/671781")
    @Description("проверка наличия элементов в каталоге ")
    @Test
    public void checkCatalog() throws InterruptedException {
        clickOnElement(onboardPage.getCloseBtn());

        clickOnElement(cPage.getCatalog());
        checkElementOnPage(cPage.getBarcode());
        checkElementOnPage(cPage.getCamera());
        checkElementOnPage(cPage.getSearchBar());
        checkElementOnPage(cPage.getTab1());
        checkElementOnPage(cPage.getTab2());
    }


    @Epic("Каталог приложения")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/671788")
    @Description("проверка наличия элементов на 2-3 уровнях каталога")
    @Test
    public void checkSubCategoryRazdel(){
        clickOnElement(onboardPage.getCloseBtn());

        clickOnElement(cPage.getCatalog());
        clickOnElement(cPage.getCategory());
        checkElementOnPage(cPage.getBackBtn());
        checkElementOnPage(cPage.getCategoryTitle());
        checkElementOnPage(cPage.getCategoryImg());
        clickOnElement(cPage.getSubcategory());
        checkElementOnPage(cPage.getCategory());
        checkElementOnPage(cPage.getBackBtn());
        checkElementOnPage(cPage.getSubcategoryTitle());

    }

    @Epic("Каталог приложения")
    @Link("https://testrail.app.local/testrail/index.php?/cases/view/671800")
    @Description("Проверка появление блока ранее просмотренных товаров")
    @Test
    public void checkResentlyWatched() throws InterruptedException {
        clickOnElement(onboardPage.getCloseBtn());

        clickOnElement(cPage.getCatalog());
        Thread.sleep(1000);
        verticalSwipeByPercentages(0.8,0.01,0.5);
        isElementDisplayed(cPage.getRecentView());
        clickOnElement(cPage.getSearchBar());
        sendKeys(cPage.getSearchBar(),"кроссовки");
        Thread.sleep(1000);
        clickOnElement(sBar.getCartItemFromSearch1());
        Thread.sleep(1000);
        clickOnElement(cPage.getBackBtn());
        clickOnElement(sBar.getClose());
        Thread.sleep(1000);
        verticalSwipeByPercentages(0.8,0.01,0.5);
        isElementDisplayed(cPage.getRecentView());
    }






}
