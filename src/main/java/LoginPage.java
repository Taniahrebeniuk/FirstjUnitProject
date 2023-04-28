import helper.Level;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static helper.ColorPrinter.printColorMessage;

public class LoginPage extends BasicPage {

    private final static String TITLE = "LoginPage";
    private WebElement logo = driver.findElement(By.className("header-logo"));

    private WebElement loginField = driver.findElement(By.id("login_field"));

    private WebElement passwordField = driver.findElement(By.id("password"));

    private WebElement loginButton = driver.findElement(By.xpath("//input[@value='Sign in']"));

    private By errorFieldLocator = By.xpath("//div[contains(text(), 'Incorrect username or password')]");

    public LoginPage(WebDriver driver) {
        super(driver, TITLE);
    }


    public WebElement getLogo() {
        return logo;
    }

    public MainPage successfullLogin(String login, String password) {
        Assertions.assertTrue(passwordField.isDisplayed(), "Password field is visible");
        Assertions.assertTrue(loginButton.isDisplayed(), "Login button is visible");
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();
        printColorMessage("Successful authorization", log, Level.INFO);
        return new MainPage(driver);
    }
}