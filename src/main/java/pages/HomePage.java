package pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HomePage {

    // Locators
    private final By accountMenu_btn = By.className("user-actions-ico");
    private final By register_btn = By.linkText("Register");


    // Variables
    private final SHAFT.GUI.WebDriver driver;
    private final String url = System.getProperty("baseUrl");


    // Constructor
    public HomePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }


    // Actions
    @Step
    public HomePage navigate() {
        driver.browser().navigateToURL(url);
        return this;
    }

    @Step
    public HomePage hoverToAccountIcon() {
        driver.element().hover(accountMenu_btn);
        return this;
    }

    @Step
    public HomePage ClickOnRegisterBtn() {
        driver.element().click(register_btn);
        return this;
    }

    // Validations
    @Step
    public HomePage verifyRegisterPageOpened(String registerUrl) {
        driver.browser().verifyThat().url().isEqualTo(registerUrl);
        return this;
    }

}
