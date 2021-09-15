package Tests;

import Pages.InitialClass;
import com.google.common.collect.ImmutableMap;
import org.junit.Test;
import org.openqa.selenium.Keys;

public class SearchTest extends InitialClass {

    @Test
    public void checkElementOnSearch() throws InterruptedException {
        clickOnElement(cPage.getCatalog());
        clickOnElement(cPage.getSearchBar());
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
