package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class BasketPage extends BaseClass {

    private final By basket = MobileBy.xpath("//XCUIElementTypeTabBar[@name=\"Панель вкладок\"]/XCUIElementTypeButton[4]");
    private final By titleBasket = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Корзина\"]");
    private final By chooseCity = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton");
    private final By btn = MobileBy.xpath("//XCUIElementTypeButton[@name=\"Начать покупки\"]");


    public By getBasket() {
        return basket;
    }

    public By getBtn() {
        return btn;
    }

    public By getTitleBasket() {
        return titleBasket;
    }

    public By getChooseCity() {
        return chooseCity;
    }
}
