package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webelements.types.MyElement;

public interface DriverInterface extends WebDriver {

    MyElement findElement(By locator, Class interfaceType);
}
