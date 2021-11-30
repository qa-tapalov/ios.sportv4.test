package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class BasketPage extends BaseClass {

    private final By basket = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeOther/XCUIElementTypeButton[4]");
    private final By titleBasket = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Корзина\"]");
    private final By chooseCity = MobileBy.xpath("//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton");
    private final By cityName = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Москва\"]");
    private final By titleChooserCity = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Выбор города\"]");
    private final By searchBarOnChooserCity = MobileBy.xpath("//XCUIElementTypeSearchField[@name=\"Найти город\"]");
    private final By cityNameOnChooserCity = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Воронеж\"]\n");
    private final By btnToCatalog = MobileBy.xpath("//XCUIElementTypeButton[@name=\"Начать покупки\"]");
    private final By emptyBasketImage = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By emptyBasketText = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Вы пока не добавили товары\"]");

    //10681922
    //10542186 товар с финальной ценой
    private final By itemOnBasket = MobileBy.xpath("//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther");
    private final By imageItemOnBasket = MobileBy.id("//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeImage");
    private final By label1ItemOnBasket = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Новая коллекция\"]");
    private final By label2ItemOnBasket = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By label3ItemOnBasket = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[3]");
    private final By labelFinalPrice = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By bottomSheetLabel = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther");
    private final By bottomSheetLabelTitle = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Финальная цена\"]");
    private final By bottomSheetLabelDesc = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Стоимость товара окончательная. Скидки и бонусы при оплате не применяются. Данный товар не участвует в акциях.\"]");

    private final By titleItemOnBasket = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Кроссовки мужские GSD One\"]");
    private final By colorItemOnBasket = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Цвет: Серый\"]");
    private final By sizeItemOnBasket = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Размер: 39\"]");
    private final By priceItemOnBasket = MobileBy.xpath("(//XCUIElementTypeStaticText[@name=\"1 199 ₽\"])[1]");
    private final By oldPriceItemOnBasket = MobileBy.xpath("ru.sportmaster.app.v4:id/old_price_tv");
    private final By sumItemOnBasket = MobileBy.xpath("(//XCUIElementTypeStaticText[@name=\"1\"])[1]");

    private final By btnMain = MobileBy.xpath("//XCUIElementTypeButton[@name=\"Перейти к оформлению\"]");
    private final By btnFloat = MobileBy.xpath("//XCUIElementTypeButton[@name=\"К оформлению\"]");
    private final By blockFloat = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Sportmaster\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]");
    private final By blockFloatOldPrice = MobileBy.xpath("");
    private final By blockFloatPrice = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]");
    private final By authFromBasketBtn = MobileBy.xpath("//XCUIElementTypeButton[@name=\"Войти или зарегистрироваться\"]");
    private final By nextWithOutAuth = MobileBy.xpath("//XCUIElementTypeButton[@name=\"Продолжить без регистрации\"]");

    private final By creditConteiner = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[6]/XCUIElementTypeOther");
    private final By creditIcon = MobileBy.xpath("//XCUIElementTypeImage[@name=\"credit\"]");
    private final By creditTitle = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Оформить кредит\"]");
    private final By creditLable = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Доступно\"]");
    private final By creditDesc = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"От «Покупай со СберБанком»\"]");
    private final By creditDetailsIcon = MobileBy.xpath("");

    private final By motivationBanner= MobileBy.xpath("//XCUIElementTypeImage[@name=\"motivationBanner\"]");

    private final By promoCode = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Введите промокод\"]");

    private final By totalItemCount = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By totalBox = MobileBy.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther/XCUIElementTypeOther");

    //экран сопсоб получения
    private final By btnExpressDelivery = MobileBy.xpath("//XCUIElementTypeButton[@name=\"Экспресс-доставка\"]");
    private final By btnPickupInSingleStore = MobileBy.xpath("//XCUIElementTypeButton[@name=\"Забрать все в одном магазине\"]");
    private final By deliveryComment = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"В корзине присутствуют товары недоступные для экспресс-доставки\"]");

    public By getBasket() {
        return basket;
    }

    public By getTitleBasket() {
        return titleBasket;
    }

    public By getChooseCity() {
        return chooseCity;
    }

    public By getBtnToCatalog() {
        return btnToCatalog;
    }

    public By getCityName() {
        return cityName;
    }

    public By getCityNameOnChooserCity() {
        return cityNameOnChooserCity;
    }

    public By getEmptyBasketImage() {
        return emptyBasketImage;
    }

    public By getItemOnBasket() {
        return itemOnBasket;
    }

    public By getEmptyBasketText() {
        return emptyBasketText;
    }

    public By getImageItemOnBasket() {
        return imageItemOnBasket;
    }

    public By getLabel1ItemOnBasket() {
        return label1ItemOnBasket;
    }

    public By getAuthFromBasketBtn() {
        return authFromBasketBtn;
    }

    public By getLabel2ItemOnBasket() {
        return label2ItemOnBasket;
    }

    public By getBottomSheetLabel() {
        return bottomSheetLabel;
    }

    public By getBottomSheetLabelTitle() {
        return bottomSheetLabelTitle;
    }

    public By getLabel3ItemOnBasket() {
        return label3ItemOnBasket;
    }

    public By getBlockFloat() {
        return blockFloat;
    }

    public By getBlockFloatOldPrice() {
        return blockFloatOldPrice;
    }

    public By getBlockFloatPrice() {
        return blockFloatPrice;
    }


    public By getBottomSheetLabelDesc() {
        return bottomSheetLabelDesc;
    }

    public By getBtnFloat() {
        return btnFloat;
    }

    public By getBtnMain() {
        return btnMain;
    }

    public By getSearchBarOnChooserCity() {
        return searchBarOnChooserCity;
    }

    public By getColorItemOnBasket() {
        return colorItemOnBasket;
    }

    public By getNextWithOutAuth() {
        return nextWithOutAuth;
    }

    public By getOldPriceItemOnBasket() {
        return oldPriceItemOnBasket;
    }

    public By getPriceItemOnBasket() {
        return priceItemOnBasket;
    }

    public By getSizeItemOnBasket() {
        return sizeItemOnBasket;
    }

    public By getSumItemOnBasket() {
        return sumItemOnBasket;
    }

    public By getTitleChooserCity() {
        return titleChooserCity;
    }

    public By getTitleItemOnBasket() {
        return titleItemOnBasket;
    }

    public By getBtnExpressDelivery() {
        return btnExpressDelivery;
    }

    public By getBtnPickupInSingleStore() {
        return btnPickupInSingleStore;
    }

    public By getCreditConteiner() {
        return creditConteiner;
    }

    public By getCreditDesc() {
        return creditDesc;
    }

    public By getCreditDetailsIcon() {
        return creditDetailsIcon;
    }

    public By getCreditIcon() {
        return creditIcon;
    }

    public By getCreditLable() {
        return creditLable;
    }

    public By getCreditTitle() {
        return creditTitle;
    }

    public By getDeliveryComment() {
        return deliveryComment;
    }

    public By getLabelFinalPrice() {
        return labelFinalPrice;
    }

    public By getMotivationBanner() {
        return motivationBanner;
    }

    public By getPromoCode() {
        return promoCode;
    }

    public By getTotalBox() {
        return totalBox;
    }

    public By getTotalItemCount() {
        return totalItemCount;
    }

}