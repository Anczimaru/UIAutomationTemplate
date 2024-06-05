package webdriver;

import org.openqa.selenium.chrome.ChromeOptions;

public class LocalDriverFactory {

    public static DriverInterface createChromeInstance() throws Exception {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")){
            System.setProperty("webdriver.chrome.driver", "../chromedriver.exe");
        }
        else if (os.contains("osx")){
            throw new Exception("NOT IMPLEMENTED");
            //Operating system is Apple OSX based
        }
        else if (os.contains("nix") || os.contains("aix") || os.contains("nux")){
            //Operating system is based on Linux/Unix/*AIX
            throw new Exception("NOT IMPLEMENTED");
        }
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        return new MyChromeDriverImpl(options);
    }
}
