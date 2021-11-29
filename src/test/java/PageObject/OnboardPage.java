package PageObject;

import BasePage.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class OnboardPage extends BaseClass {
    private final By closeBtn = MobileBy.xpath("//XCUIElementTypeButton[@name=\"СloseWhite\"]");
    private final By forwardBtn = MobileBy.xpath("//XCUIElementTypeButton[@name=\"NextButton\"]");
//    private final By slideTitle = MobileBy.id("ru.sportmaster.app.v4:id/slideTitleTextView");
//    private final By slideHint = MobileBy.id("ru.sportmaster.app.v4:id/slideHintTextView");
//    private final By navSlider = MobileBy.id("ru.sportmaster.app.v4:id/onboardingTabsLayout");
//    private final By loginBtn = MobileBy.id("ru.sportmaster.app.v4:id/loginButton");


    public By getCloseBtn() {
        return closeBtn;
    }

    public By getForwardBtn() {
        return forwardBtn;
    }

}
