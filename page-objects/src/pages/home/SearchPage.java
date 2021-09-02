package pages.home;

import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import webelements.types.MyInput;

public class SearchPage extends BasePage {

    @Getter
    @FindBy(xpath = searchInputXpath)
    private MyInput searchInput;
    private final String searchInputXpath = "//input[@title='Szukaj']";
}
