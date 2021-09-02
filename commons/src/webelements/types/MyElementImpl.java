package webelements.types;

import org.openqa.selenium.*;

import java.util.List;
import java.util.stream.Collectors;

public class MyElementImpl implements MyElement{

    final WebElement element;

    public MyElementImpl(final WebElement element){
        this.element = element;
    }

    @Override
    public List<MyElement> findAllElements(By by) {
        return element.findElements(by).stream()
                    .map(element -> (MyElement) element)
                    .collect(Collectors.toList());
    }

    @Override
    public MyElement find(By by) {
        return new MyElementImpl(element.findElement(by));
    }

    @Override
    public Boolean isVisible() {
        return null;
    }

    @Override
    public void click() {
        element.click();
    }

    @Override
    public void submit() {
        element.submit();
    }

    @Override
    public void sendKeys(CharSequence... charSequences) {
        element.sendKeys(charSequences);
    }

    @Override
    public void clear() {
        element.clear();
    }

    @Override
    public String getTagName() {
        return null;
    }

    @Override
    public String getAttribute(String s) {
        return null;
    }

    @Override
    public boolean isSelected() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }

    @Override
    public Point getLocation() {
        return null;
    }

    @Override
    public Dimension getSize() {
        return null;
    }

    @Override
    public Rectangle getRect() {
        return null;
    }

    @Override
    public String getCssValue(String s) {
        return null;
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return null;
    }
}
