package Pages;

import core.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class CartItemPage extends BaseClass {

    private final By imageItem = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeImage");
    private final By backBtn = MobileBy.xpath("//XCUIElementTypeButton[@name=\"back\"]");
    private final By favoriteEmpty = MobileBy.xpath("//XCUIElementTypeButton[@name=\"favoriteEmpty\"]");
    private final By compareEmpty = MobileBy.xpath("//XCUIElementTypeButton[@name=\"compareEmpty\"]");
    private final By share = MobileBy.xpath("//XCUIElementTypeButton[@name=\"share\"]");
    private final By label = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By iconBrand = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeImage");
    private final By iconReview = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By colors = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView");
    private final By sizeGroups = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther");
    private final By sizes = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeCollectionView");
    private final By size1 = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]");
    private final By addBasketMain = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[5]/XCUIElementTypeOther");
    private final By defaultPickup = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Для отображения наличия, выберите размер\"]");
    private final By pickup = MobileBy.xpath("//XCUIElementTypeImage[@name=\"arrowRight\"]");
    private final By addBasketFloat = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By btnAddBasketFloat = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"В корзину\"]");
    private final By priceAddBasketFloat = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]");
    private final By description = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Описание\"]");
    private final By specifications = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Характеристики\"]");
    private final By reviewBox = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Отзывы покупателей\"]");
    private final By questionsBox = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Вопросы о товаре\"]");

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