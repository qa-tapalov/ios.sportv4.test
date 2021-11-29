package Tests;

import PageObject.InitialClass;
import org.junit.Test;

public class AuthorizationTest extends InitialClass {


    @Test
    public void checkAuthPage(){
//        clickOnElement(onboardPage.getCloseBtn());
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

    @Test
    public void authWithPhone(){
        clickOnElement(authPage.getProfile());
        clickOnElement(authPage.getAuth());
        sendKeys(authPage.getPhoneBar(),"79071239901");
        clickOnElement(authPage.getBtnSendCode());
        sendKeys(authPage.getSendCodeBar(),"1234");
        checkElementOnPage(authPage.getNameProfile());
    }


}
