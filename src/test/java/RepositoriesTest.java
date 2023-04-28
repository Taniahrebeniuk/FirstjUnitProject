import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class RepositoriesTest extends BasicTest {

    protected Logger logger;

    @Test
    public void validateRepositories() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        Assertions.assertTrue(loginPage.getLogo().isDisplayed());
        loginPage.successfullLogin("taniahrebeniuk@gmail.com", "taniahrebeniuk@gmail.com");
        //...
        List<String> expectedRepositoriedList = new ArrayList<>();
        expectedRepositoriedList.add("test2");
        expectedRepositoriedList.add("test1");
        expectedRepositoriedList.add("test");

        RepositoriesPage repositoriesPage = new RepositoriesPage(driver);
        Assertions.assertEquals(expectedRepositoriedList, repositoriesPage.getRepositories());
    }

}