package webelements.types;

import com.google.inject.ImplementedBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

@ImplementedBy(MyElementImpl.class)
public interface MyElement extends WebElement {

    List<MyElement> findAllElements(By by);

    MyElement find(By by);

    Boolean isVisible();
}
