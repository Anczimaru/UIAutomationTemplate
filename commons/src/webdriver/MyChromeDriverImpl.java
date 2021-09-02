package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import webelements.types.MyElement;
import webelements.types.MyElementImpl;
import webelements.types.MyInput;
import webelements.types.MyInputImpl;

import static webdriver.LocalDriverManager.getDriver;

public class MyChromeDriverImpl extends ChromeDriver implements DriverInterface {

    public MyChromeDriverImpl(ChromeOptions chromeOptions){
        super(ChromeDriverService.createDefaultService(), chromeOptions);
    }

    @Override
    public MyElement findElement(By locator, Class interfaceType) {
        if (interfaceType.equals(MyInput.class)) {
            return new MyInputImpl(getDriver().findElement(locator));
        } else {
            return new MyElementImpl(getDriver().findElement(locator));
        }
    }
}
