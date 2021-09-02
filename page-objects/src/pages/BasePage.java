package pages;

import lombok.extern.java.Log;
import org.openqa.selenium.support.PageFactory;

import static webdriver.LocalDriverManager.getDriver;

@Log
public class BasePage {

    private final int VISIBLE_TIMEOUT = 30;

    public BasePage() {
        PageFactory.initElements(getDriver(),this);
    }
}
