package Tests;

import PageObject.InitialClass;
import org.junit.Test;

public class BasketTest extends InitialClass {

    @Test
    public void checkEmptyBasket(){
        clickOnElement(bPage.getBasket());
        checkElementOnPage(bPage.getTitleBasket());
        checkElementOnPage(bPage.getChooseCity());
        checkElementOnPage(bPage.getImageEmptyBasket());
        checkElementOnPage(bPage.getTitleEmptyBasket());
        checkElementOnPage(bPage.getBtn());
    }


}
