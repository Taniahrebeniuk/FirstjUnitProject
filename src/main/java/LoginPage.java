
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPage extends BasicPage {
    private WebElement logo = driver.findElement(By.className("header-logo"));

    private WebElement loginField = driver.findElement(By.id("login_field"));

    private WebElement passwordField = driver.findElement(By.id("password"));

    private WebElement loginButton = driver.findElement(By.xpath("//input[@value='Sign in']"));

    private By errorFieldLocator = By.xpath("//div[contains(text(), 'Incorrect username or password')]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogo() {
        return logo;
    }

    public MainPage successfullLogin(String login, String password) {
        Assert.assertTrue(passwordField.isDisplayed(), "Password field is visible");
        Assert.assertTrue(loginButton.isDisplayed(), "Login button is visible");
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();
        return new MainPage(driver);
    }

}