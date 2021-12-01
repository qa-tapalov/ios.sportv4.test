package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class CartItemPage extends BaseClass {

    private final By imageItem = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By indicatorGallery = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeOther/XCUIElementTypePageIndicator");
    private final By closeGallery = MobileBy.xpath("//XCUIElementTypeButton[@name=\"close\"]");
    private final By backBtn = MobileBy.xpath("//XCUIElementTypeButton[@name=\"back\"]");
    private final By favoriteEmpty = MobileBy.xpath("//XCUIElementTypeButton[@name=\"favoriteEmpty\"]");
    private final By compareEmpty = MobileBy.xpath("//XCUIElementTypeButton[@name=\"compareEmpty\"]");
    private final By share = MobileBy.xpath("//XCUIElementTypeButton[@name=\"share\"]");
    private final By label = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther\n");
    private final By richContent = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Обзор\"]");

    private final By richWebView = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeOther");
    private final By iconBrand = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeImage");
    private final By iconReview = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By colors = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView");
    private final By tableSizeLink = MobileBy.xpath("//XCUIElementTypeButton[@name=\"Таблица размеров\"]");
    private final By closeTableSize = MobileBy.xpath("//XCUIElementTypeButton[@name=\"close\"]");
    private final By titleTableSize = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Таблица размеров\"]");
    private final By tableView = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeWebView");
    private final By closeVideoPlayer = MobileBy.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther");
    private final By playPause = MobileBy.xpath("//XCUIElementTypeButton[@name=\"Play/Pause\"]");
    private final By playVideo = MobileBy.xpath("//XCUIElementTypeButton[@name=\"playVideo\"]");

    private final By sizeGroups = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther[2]");
    private final By sizes = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeCollectionView");
    private final By size1 = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]");
    private final By addBasketMain = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[5]/XCUIElementTypeOther");
    private final By defaultPickup = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Для отображения наличия, выберите размер\"]");
    private final By pickup = MobileBy.xpath("//XCUIElementTypeImage[@name=\"arrowRight\"]");
    private final By addBasketFloat = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By btnAddBasketFloat = MobileBy.xpath("//XCUIElementTypeButton[@name=\"В корзину\"]");
    private final By priceAddBasketFloat = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]");
    private final By description = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Описание\"]");
    private final By specifications = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Характеристики\"]");
    private final By reviewBox = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Отзывы покупателей\"]");
    private final By questionsBox = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Вопросы о товаре\"]");
    private final By snackChooseSize = MobileBy.xpath("//XCUIElementTypeOther[@name=\"[Title], Выберите размер\"]");
    private final By defaultState = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Для отображения наличия, выберите размер\"]");

    private final By sizeItem1 = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By sizeItem2 = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By sizeItem3 = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By sizeItem4 = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By sizeItem5 = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeCollectionView/XCUIElementTypeCell[5]/XCUIElementTypeOther/XCUIElementTypeOther");

    public By getDefaultState() {
        return defaultState;
    }

    public By getSizeItem1() {
        return sizeItem1;
    }

    public By getSizeItem2() {
        return sizeItem2;
    }

    public By getSizeItem3() {
        return sizeItem3;
    }

    public By getSizeItem4() {
        return sizeItem4;
    }

    public By getSizeItem5() {
        return sizeItem5;
    }

    public By getSnackChooseSize() {return snackChooseSize;}
    public By getRichWebView() {return richWebView;}
    public By getCloseVideoPlayer() {return closeVideoPlayer;}
    public By getPlayPause() {return playPause;}
    public By getPlayVideo() {return playVideo;}
    public By getRichContent() {return richContent;}
    public By getCloseGallery() {return closeGallery;}
    public By getCloseTableSize() {return closeTableSize;}
    public By getIndicatorGallery() {return indicatorGallery;}
    public By getTableSizeLink() {return tableSizeLink;}
    public By getTitleTableSize() {return titleTableSize;}
    public By getTableView() {return tableView;}
    public By getBackBtn() {return backBtn;}
    public By getAddBasketMain() {return addBasketMain;}
    public By getAddBasketFloat() {return addBasketFloat;}
    public By getColors() {return colors;}
    public By getCompareEmpty() {return compareEmpty;}
    public By getBtnAddBasketFloat() {return btnAddBasketFloat;}
    public By getDefaultPickup() {return defaultPickup;}
    public By getFavoriteEmpty() {return favoriteEmpty;}
    public By getIconBrand() {return iconBrand;}
    public By getImageItem() {return imageItem;}
    public By getIconReview() {return iconReview;}
    public By getDescription() {return description;}
    public By getLabel() {return label;}
    public By getPickup() {return pickup;}
    public By getPriceAddBasketFloat() {return priceAddBasketFloat;}
    public By getQuestionsBox() {return questionsBox;}
    public By getShare() {return share;}
    public By getSize1() {return size1;}
    public By getReviewBox() {return reviewBox;}
    public By getSizeGroups() {return sizeGroups;}
    public By getSizes() {return sizes;}
    public By getSpecifications() {return specifications;}
}
