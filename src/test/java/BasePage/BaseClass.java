package BasePage;

import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    public static WebDriverWait wait;

    public static IOSDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "14.8");
        capabilities.setCapability("deviceName", "iPhone 8 plus");
        capabilities.setCapability("udid", "0620518dec780882c15469155fdf2899d984dd07");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("app","/Users/testerkingbird/Downloads/cm4.ipa");
//       capabilities.setCapability("bundleId","ru.sportmaster.app");
//        capabilities.setCapability("resetOnSessionStartOnly","true");
        capabilities.setCapability("fullReset","true");
        driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);

        wait = new WebDriverWait(driver,15);

        System.out.println("Приложение запущено");
        System.out.println();

    }


        @After
        public void tearDown()  {
            driver.quit();
            System.out.println();
            System.out.println("Приложение закрыто");
        }










}
