package Tests;

import PageObject.InitialClass;
import org.junit.Test;

public class SearchTest extends InitialClass {

    @Test
    public void checkElementOnSearch() throws InterruptedException {
        clickOnElement(cPage.getCatalog());
        clickOnElement(cPage.getSearchBar());
        sendKeys(cPage.getSearchBar(),"кроссовки");
        checkElementOnPage(sBar.getClose());
        checkElementOnPage(sBar.getTaps());
        checkElementOnPage(sBar.getTap1());
        checkElementOnPage(sBar.getTap2());
        checkElementOnPage(sBar.getTap3());
        checkElementOnPage(sBar.getHint1());
        checkElementOnPage(sBar.getHint2());
        checkElementOnPage(sBar.getHint3());
        checkElementOnPage(sBar.getCartItemFromSearch1());
        checkElementOnPage(sBar.getCartItemFromSearch2());
        checkElementOnPage(sBar.getCartItemFromSearch3());

    }


}
