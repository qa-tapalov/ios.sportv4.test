package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;

import java.util.HashMap;
import java.util.List;

public class InitialClass extends BaseClass {

   public CatalogPage cPage = new CatalogPage();
    public SearchBar sBar = new SearchBar();
    public AuthorizationPage authPage = new AuthorizationPage();
    public BasketPage basketPage = new BasketPage();
    public ListingPage lPage = new ListingPage();
    public CartItemPage cartPage = new CartItemPage();
    public OnboardPage onboardPage = new OnboardPage();
    public void clickOnElement(By element){

        wait.until(ExpectedConditions.presenceOfElementLocated(element));

        driver.findElement(element).click();

        System.out.println("Click on element: " + element);
    }

    //checking for the presence of an elementa
    public void checkElementOnPage(By element){
        try{
            BaseClass.wait.until(ExpectedConditions.presenceOfElementLocated(element));
            BaseClass.driver.findElement(element);
            System.out.println("Элемент присутствует: " + element);

        }
        catch (Exception e){

            System.out.println("Элемент отсутствует: " + element);


        }

    }
//    public void checkElementOnPageWithText(String keys){
//        BaseClass.wait.until(ExpectedConditions.presenceOfElementLocated(keys));
//        BaseClass.driver.findElement(keys);
//    }

    public void openListing(String keys) throws InterruptedException {
        clickOnElement(cPage.getCatalog());
        clickOnElement(cPage.getSearchBar());
        driver.findElement(cPage.getSearchBar()).sendKeys(keys);
        Thread.sleep(1500);
        clickOnElement(sBar.getSearchBtn());


    }

    public void addItemOnBasket(String id, int x) throws InterruptedException {
        openListing(id);
        //1 означает, что для данного товара присутствует выбор размера
        //2 означает что для данного товара нет выбора размера
        //3 добавляет в корзину с КТ
        if (x == 1) {
            clickOnElement(lPage.getBasketBtn());
            chooseAvailableSize();
            clickOnElement(lPage.getAddBasketBtn());
            clickOnElement(basketPage.getBasket());

        }
        else if(x==2){
            clickOnElement(lPage.getBasketBtn());
        }
        else if(x==3){
            clickOnElement(lPage.getImageItem());
            scrollByCoord(50,1000,50,500,1);
            chooseAvailableSizeOnCart();
            clickOnElement(cartPage.getAddBasketMain());
            clickOnElement(basketPage.getBasket());


        }
    }

    public void chooseAvailableSize(){
        final By[] size = {
                lPage.getSizeElement1(),
                lPage.getSizeElement2(),
                lPage.getSizeElement3(),
                lPage.getSizeElement4(),
                lPage.getSizeElement5(),
        };

        for (By by : size) {
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            clickOnElement(by);
            if (driver.findElement(by).isEnabled()) {

                break;
            }
        }

    }

    @Step
    public void chooseAvailableSizeOnCart(){
        final By[] size = {
                cartPage.getSizeItem1(),
                cartPage.getSizeItem2(),
                cartPage.getSizeItem3(),
                cartPage.getSizeItem4(),
                cartPage.getSizeItem5(),

        };

        for (By by : size) {
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            clickOnElement(by);
            if (driver.findElement(by).isEnabled()) {

                break;
            }
        }

    }


    public void sendKeys(By element, String keys){
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
        driver.findElement(element).sendKeys(keys);

    }


    public void tapByCoordinates (int x,  int y) {
        TouchAction action = new TouchAction(driver);

        action
                .tap(point(x,y))
                .waitAction(waitOptions(ofMillis(250))).perform();
    }

    //Horizontal Swipe by percentages
    public void horizontalSwipeByPercentage (double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);
        TouchAction action = new TouchAction(driver);

        action
                .press(point(startPoint, anchor))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endPoint, anchor))
                .release().perform();
    }
    //Vertical Swipe by percentages
    public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);
        TouchAction action = new TouchAction(driver);

        action
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }

    //Scroll by coordinates
    public void scrollByCoord( int x1, int y1, int x2, int y2, int j) throws InterruptedException {
        TouchAction action = new TouchAction(driver);

        Thread.sleep(2500);
        for (int i = 0; i < j; i++) {
            action.press(PointOption.point(x1, y1))
                    .waitAction(waitOptions(ofMillis(1000)))
                    .moveTo(PointOption.point(x2, y2))
                    .release()
                    .perform();
        }
    }

    public void isElementDisplayed(By element){
        try{
            driver.findElement(element).isDisplayed();
            System.out.println("Элемент найден" + element);

        }catch(Exception e){
            System.out.println("Элемент скрыт" + element);
        }
    }




    public void scrollToMobileElement(String elementName, String direction) {

        final int maximumScrolls = 5;

        for (int i = 0; i < maximumScrolls; i++) {
            try {
                if (findElementsByPredicateString("label CONTAINS \"" + elementName + "\"").size() > 0)
                    // PredicateString & label is the locator strategy that I used. It can be changed to others as needed for your app.
                    break;
            } catch (Exception e) {
                e.printStackTrace();
            }
            scroll(direction);
            System.out.println("Scroll to element: " + elementName);
        }
    }
    private void scroll(String direction) {
        final HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", direction);
        driver.executeScript("mobile:scroll", scrollObject);
    }

    public List<MobileElement> findElementsByPredicateString(String predicateString) {
        return driver.findElements(MobileBy.iOSNsPredicateString(predicateString));
    }

    //Assert element
    public void assertElementByText(By element, String keys){
        MobileElement compare = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(element));
        if (compare.getText().equals(keys)){
            System.out.println("Надпись соответствует: " + compare.getText());
        }
        else {
            System.out.println("Надпись не соответствует: " + compare.getText());

        }

    }



}
