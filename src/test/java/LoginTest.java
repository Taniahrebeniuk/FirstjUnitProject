import helper.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static helper.ColorPrinter.printColorMessage;

public class LoginTest extends BasicTest {

    protected Logger logger;
    @Test
    public void LoginTest() {
        Logger logger = LogManager.getLogger();
        printColorMessage("LoginTest is starting", logger, Level.INFO);
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        Assertions.assertTrue(loginPage.getLogo().isDisplayed());
        loginPage.successfullLogin("taniahrebeniuk@gmail.com", "taniahrebeniuk@gmail.com");
        printColorMessage("LoginTest has finished", logger, Level.INFO);
    }
}