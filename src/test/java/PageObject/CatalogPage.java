package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class CatalogPage extends BaseClass {

    private final By catalog = MobileBy.xpath("//XCUIElementTypeTabBar[@name=\"Панель вкладок\"]/XCUIElementTypeOther/XCUIElementTypeButton[2]");
    private final By searchBar = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By barcode = MobileBy.AccessibilityId("barcode");
    private final By camera = MobileBy.AccessibilityId("camera");
    private final By tab1 = MobileBy.xpath("//XCUIElementTypeButton[@name=\"Разделы\"]");
    private final By tab2 = MobileBy.xpath("//XCUIElementTypeButton[@name=\"Каталог\"]");
    private final By category = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther");
    private final By categoryTitle = MobileBy.AccessibilityId("Женщинам");
    private final By categoryImg = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeImage");
    private final By backBtn = MobileBy.AccessibilityId("back");
    private final By subcategory = MobileBy.AccessibilityId("Обувь");
    private final By subcategoryTitle = MobileBy.AccessibilityId("Женская обувь");
    private final By recentView = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Вы ранее смотрели\"]");


    public By getRecentView() {
        return recentView;
    }

    public By getCatalog() {return catalog;}

    public By getBarcode() {return barcode;}

    public By getCamera() {return camera;}

    public By getSearchBar() {return searchBar;}

    public By getTab1() {return tab1;}

    public By getTab2() {return tab2;}

    public By getBackBtn() {
        return backBtn;
    }

    public By getCategoryImg() {
        return categoryImg;
    }

    public By getCategoryTitle() {
        return categoryTitle;
    }

    public By getCategory() {
        return category;
    }

    public By getSubcategory() {
        return subcategory;
    }

    public By getSubcategoryTitle() {
        return subcategoryTitle;
    }
}
