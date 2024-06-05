package tests;

import lombok.extern.java.Log;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import webdriver.DriverInterface;
import webdriver.LocalDriverFactory;
import webdriver.LocalDriverManager;

import java.util.concurrent.TimeUnit;

@Log
@Listeners
public class BaseTest {

    @BeforeTest
    public void startBrowser(ITestContext iTestContext) throws Exception {
        try {
            System.out.println("## Creating driver");
            DriverInterface driver = LocalDriverFactory.createChromeInstance();
            System.out.println("## Created driver");
            LocalDriverManager.setWebDriver(driver);
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }catch (Exception exception){
            System.out.println("## Failed to prepare setup due to: "+exception.getMessage());
            throw exception;
        }
    }

    @AfterTest
    public void stopBrowser(ITestContext iTestContext){
        LocalDriverManager.quitDriver();
    }
}
