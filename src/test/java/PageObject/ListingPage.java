package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ListingPage extends BaseClass {
    private final By backBtn = MobileBy.xpath("//XCUIElementTypeButton[@name=\"back\"]");
    private final By iconSort = MobileBy.xpath("//XCUIElementTypeImage[@name=\"sorting\"]");
    private final By sort = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]");
    private final By compare = MobileBy.xpath("//XCUIElementTypeButton[@name=\"compare\"]");
    private final By cardStyle = MobileBy.xpath("//XCUIElementTypeButton[@name=\"cardStyle\"]");
    private final By filters = MobileBy.xpath("//XCUIElementTypeButton[@name=\"filters\"]");
    private final By imageItem = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]");
    private final By favoriteItem = MobileBy.xpath("(//XCUIElementTypeButton[@name=\"favoriteEmpty\"])[1]");
    private final By compareItem = MobileBy.xpath("(//XCUIElementTypeButton[@name=\"compareEmpty\"])[1]");
    private final By reviewItem = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]");
    private final By basketBtn = MobileBy.xpath("(//XCUIElementTypeButton[@name=\"cart\"]");
    private final By bottomSheetChooseSize = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]");
    private final By addBasketBtn = MobileBy.xpath("//XCUIElementTypeButton[@name=\"В корзину\"]");
    private final By sizeGroup = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther");
    private final By sizeChooser = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeCollectionView");

    private final By sizeElement1 = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By sizeElement2 = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By sizeElement3 = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By sizeElement4 = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By sizeElement5 = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell[5]/XCUIElementTypeOther/XCUIElementTypeOther");


    public By getBasketBtn() {
        return basketBtn;
    }

    public By getSizeElement1() {
        return sizeElement1;
    }

    public By getSizeElement2() {
        return sizeElement2;
    }

    public By getSizeElement3() {
        return sizeElement3;
    }

    public By getSizeElement4() {
        return sizeElement4;
    }

    public By getSizeElement5() {
        return sizeElement5;
    }


    public By getImageItem() {
        return imageItem;
    }

    public By getBackBtn() {
        return backBtn;
    }



    public By getAddBasketBtn() {
        return addBasketBtn;
    }

    public By getBottomSheetChooseSize() {
        return bottomSheetChooseSize;
    }

    public By getCardStyle() {
        return cardStyle;
    }


    public By getCompare() {
        return compare;
    }

    public By getCompareItem() {
        return compareItem;
    }

    public By getFavoriteItem() {
        return favoriteItem;
    }

    public By getFilters() {
        return filters;
    }

    public By getIconSort() {
        return iconSort;
    }

    public By getReviewItem() {
        return reviewItem;
    }

    public By getSizeChooser() {
        return sizeChooser;
    }

    public By getSizeGroup() {
        return sizeGroup;
    }

    public By getSort() {
        return sort;
    }
}
