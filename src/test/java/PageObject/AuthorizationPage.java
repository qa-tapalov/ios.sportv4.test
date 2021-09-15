package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AuthorizationPage extends BaseClass {
    private final By profile = MobileBy.xpath("//XCUIElementTypeTabBar[@name=\"Панель вкладок\"]/XCUIElementTypeOther/XCUIElementTypeButton[5]");
    private final By auth = MobileBy.xpath("//XCUIElementTypeButton[@name=\"АВТОРИЗАЦИЯ\"]");
    private final By titleAuth = MobileBy.AccessibilityId("ВХОД ИЛИ РЕГИСТРАЦИЯ");
    private final By contryCode = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By phoneBar = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther");
    private final By btnSendCode = MobileBy.xpath("//XCUIElementTypeButton[@name=\"Получить код\"]");
    private final By btnFb = MobileBy.AccessibilityId("facebookButton");
    private final By btnOk = MobileBy.AccessibilityId("okButton");
    private final By btnVk = MobileBy.AccessibilityId("vkButton");
    private final By close = MobileBy.AccessibilityId("close");

    public By getAuth() {return auth;}
    public By getBtnFb() {return btnFb;}
    public By getBtnOk() {return btnOk;}
    public By getBtnSendCode() {return btnSendCode;}
    public By getBtnVk() {return btnVk;}
    public By getClose() {return close;}
    public By getContryCode() {return contryCode;}
    public By getPhoneBar() {return phoneBar;}
    public By getProfile() {return profile;}
    public By getTitleAuth() {return titleAuth;}
}
