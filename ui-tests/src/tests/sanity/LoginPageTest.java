package tests.sanity;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.home.LoginPage;
import tests.BaseTest;

import java.time.Duration;

import static webdriver.LocalDriverManager.getDriver;

public class LoginPageTest extends BaseTest {

    @BeforeTest
    public void beforeTest(){
        // get some page
        getDriver().get("https://practicetestautomation.com/practice-test-login/");

        //make sure that page is initialized properly
        new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath(LoginPage.usernameInputXpath)));
    }

    @Test
    public void login_negative() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        Assert.assertFalse(loginPage.isErrorVisible());

        loginPage.performLogin("studnt", "12");

        Assert.assertTrue(loginPage.waitForError(), "Could not find expected error");
    }
}
