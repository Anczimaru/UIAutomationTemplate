package webdriver;

import lombok.extern.java.Log;
import org.openqa.selenium.WebDriver;

@Log
public class LocalDriverManager {

    private static ThreadLocal<DriverInterface> webDriver = new ThreadLocal<>();

    public static DriverInterface getDriver(){
        return webDriver.get();
    }

    public static void setWebDriver(DriverInterface driver){
        webDriver.set(driver);
    }

    public static void quitDriver(){
        WebDriver driver = LocalDriverManager.getDriver();
        try{
            if(driver !=null){
                driver.quit();
                System.out.println("## Driver quited");
            }
        } catch (Exception e){
            System.out.println("## Unable to quit driver");
        }
    }

}
