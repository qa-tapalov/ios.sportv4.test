package Tests;

import Pages.InitialClass;
import org.junit.Test;

public class AuthorizationTest extends InitialClass {


    @Test
    public void checkAuthPage(){
        clickOnElement(authPage.getProfile());
        clickOnElement(authPage.getAuth());
        checkElementOnPage(authPage.getClose());
        checkElementOnPage(authPage.getTitleAuth());
        checkElementOnPage(authPage.getContryCode());
        checkElementOnPage(authPage.getPhoneBar());
        checkElementOnPage(authPage.getBtnSendCode());
        checkElementOnPage(authPage.getBtnFb());
        checkElementOnPage(authPage.getBtnOk());
        checkElementOnPage(authPage.getBtnVk());


    }




}
