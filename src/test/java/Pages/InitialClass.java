package Pages;

import core.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;

import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.List;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class InitialClass extends BaseClass {

   public CatalogPage cPage = new CatalogPage();
    public SearchBar sBar = new SearchBar();
    public AuthorizationPage authPage = new AuthorizationPage();
    public BasketPage bPage = new BasketPage();
    public ListingPage lPage = new ListingPage();
    public CartItemPage cartPage = new CartItemPage();

    public void clickOnElement(By element){

        wait.until(ExpectedConditions.presenceOfElementLocated(element));

        driver.findElement(element).click();

        System.out.println("Click on element" + element);
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


    public void openListing(String keys) throws InterruptedException {
        clickOnElement(cPage.getCatalog());
        clickOnElement(cPage.getSearchBar());
        sendKeys(cPage.getSearchBar(), keys);
        clickOnElement(sBar.getSearchBtn());

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


}