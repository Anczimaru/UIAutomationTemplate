package webelements.types;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.Keys.BACK_SPACE;
import static org.openqa.selenium.Keys.ENTER;

public class MyInputImpl extends MyElementImpl implements MyInput {

    public MyInputImpl(WebElement element) {
        super(element);
    }

    @Override
    public void type(String text) {
        element.sendKeys(text);
    }

    @Override
    public void typeAndEnter(String text) {
        element.sendKeys(text);
        element.sendKeys(ENTER);
    }

    @Override
    public MyInput removeText() {
        while (!element.getAttribute("value").equals("")) {
            element.sendKeys(BACK_SPACE);
        }
        return this;
    }

    @Override
    public String typeRandomText() {
        return RandomStringUtils.randomAlphabetic(15);
    }
}
