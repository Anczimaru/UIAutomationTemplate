package webdriver;

import org.openqa.selenium.chrome.ChromeOptions;

public class LocalDriverFactory {

    public static DriverInterface createChromeInstance(){
        System.setProperty("webdriver.chrome.driver", "../chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        return new MyChromeDriverImpl(options);
    }
}
