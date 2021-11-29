package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class SearchBar extends BaseClass {

    private final By taps = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeCollectionView");
    private final By tap1 = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]");
    private final By tap2 = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]");
    private final By tap3 = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]");
    private final By hint1 = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther");
    private final By hint2 = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[5]/XCUIElementTypeOther");
    private final By hint3 = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[7]/XCUIElementTypeOther");
    private final By close = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Отмена\"]");
    private final By searchBtn = MobileBy.xpath("//XCUIElementTypeButton[@name=\"Search\"]");
    private final By cartItemFromSearch1 = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[10]");
    private final By cartItemFromSearch2 = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[12]");
    private final By cartItemFromSearch3 = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[14]");


    public By getSearchBtn() {return searchBtn;}
    public By getCartItemFromSearch2() {return cartItemFromSearch2;}
    public By getCartItemFromSearch3() {return cartItemFromSearch3;}
    public By getCartItemFromSearch1() {return cartItemFromSearch1;}
    public By getHint2() {return hint2;}
    public By getHint3() {return hint3;}
    public By getTap1() {return tap1;}
    public By getTap2() {return tap2;}
    public By getTap3() {return tap3;}
    public By getTaps() {return taps;}
    public By getHint1() {
        return hint1;
    }
    public By getClose() {return close;}
}
