import helper.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Assertions;

import static helper.ColorPrinter.printColorMessage;

public class MyProjectNavigationTest extends BasicTest {

    @Test
    public void GoToMyProjectPage() {
        Logger logger = LogManager.getLogger();
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfullLogin("taniahrebeniuk@gmail.com", "taniahrebeniuk@gmail.com");
        MyProjectPage myProjectPage = new MyProjectPage(driver);
        printColorMessage("GoToMyProjectPage test is starting", logger, Level.INFO);
        myProjectPage.goToMyProjectPage();
        printColorMessage("GoToMyProjectPage test has finished", logger, Level.INFO);
    }
}