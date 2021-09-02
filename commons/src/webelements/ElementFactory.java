package webelements;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import java.lang.reflect.InvocationTargetException;

import static webdriver.LocalDriverManager.getDriver;

public class ElementFactory extends PageFactory {

    public static <T> T initElements(Class<T> pageClassToProxy){
        try{
            T page = pageClassToProxy.getConstructor().newInstance();
            PageFactory.initElements(getDriver(), page);
            return page;
        } catch (InstantiationException | InvocationTargetException |
                NoSuchMethodException | IllegalAccessException e){
            throw new RuntimeException(e);
        }
    }
}
