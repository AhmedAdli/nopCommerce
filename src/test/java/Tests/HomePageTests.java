package Tests;

import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTests {

    //Variables
    private SHAFT.GUI.WebDriver driver;
    private SHAFT.TestData.JSON testData;


    //Tests_Cases
    @Test
    public void openRegisterPage() {
        new HomePage(driver)
                .hoverToAccountIcon()
                .ClickOnRegisterBtn()
                .verifyRegisterPageOpened(testData.getTestData("registerUrl"));
    }


    //Configurations
    @BeforeClass
    public void setConfigurations() {
        testData = new SHAFT.TestData.JSON("homeTestData.json");
    }

    @BeforeMethod
    public void setDriver() {
        driver = new SHAFT.GUI.WebDriver();
        new HomePage(driver)
                .navigate();
    }

    @AfterMethod
    public void terminateDriver() {
        driver.quit();
    }


}
