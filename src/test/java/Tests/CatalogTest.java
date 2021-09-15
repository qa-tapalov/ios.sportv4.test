package Tests;

import Pages.InitialClass;
import org.junit.Test;

public class CatalogTest extends InitialClass {

    @Test
    public void checkCatalog() throws InterruptedException {
        clickOnElement(cPage.getCatalog());
        checkElementOnPage(cPage.getBarcode());
        checkElementOnPage(cPage.getCamera());
        checkElementOnPage(cPage.getSearchBar());
        checkElementOnPage(cPage.getTab1());
        checkElementOnPage(cPage.getTab2());
    }


    @Test
    public void checkSubCategoryRazdel(){
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
    @Test
    public void checkResentlyWatched() throws InterruptedException {
        clickOnElement(cPage.getCatalog());
        Thread.sleep(1000);
        verticalSwipeByPercentages(0.8,0.01,0.5);
        isElementDisplayed(cPage.getRecentView());
        clickOnElement(cPage.getSearchBar());
        sendKeys(cPage.getSearchBar(),"кроссовки");
        Thread.sleep(1000);
        tapByCoordinates(150,320);
        Thread.sleep(1000);
        tapByCoordinates(30,40);
        clickOnElement(sBar.getClose());
        Thread.sleep(1000);
        verticalSwipeByPercentages(0.8,0.01,0.5);
        isElementDisplayed(cPage.getRecentView());
    }






}
