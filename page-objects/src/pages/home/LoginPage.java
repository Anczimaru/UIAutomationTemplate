package pages.home;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;

import static webdriver.LocalDriverManager.getDriver;

public class LoginPage
        extends BasePage {

    @Getter
    @FindBy(xpath = usernameInputXpath)
    private WebElement usernameInput;
    public static final String usernameInputXpath = "//input[@id='username']";

    @Getter
    @FindBy(xpath = passwordInputXpath)
    private WebElement passwordInput;
    public static final String passwordInputXpath = "//input[@id='password']";

    @Getter
    @FindBy(xpath = signInButtonXpath)
    private WebElement signInButton;
    public static final String signInButtonXpath = "//button[@id='submit']";

    @Getter
    @FindBy(xpath = errorMessageXpath)
    private WebElement errorMessage;
    public static final String errorMessageXpath = "//div[contains(text(), 'Your username is invalid!')]";

    public void performLogin(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickSubmit();
    }

    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickSubmit() {
        signInButton.click();
    }

    public boolean waitForError() {
        try {
            new WebDriverWait(getDriver(), Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(errorMessage));
        } catch (Exception e) {/*ignore */}
        return isErrorVisible();
    }

    public boolean isErrorVisible() {
        return errorMessage.isDisplayed();
    }
}
