import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class RepositoriesTest extends BasicPage {
    public RepositoriesTest(WebDriver driver) {
        super(driver);
    }

    @Test
    public void validateRepositories() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.getLogo().isDisplayed());
        loginPage.successfullLogin("taniahrebeniuk@gmail.com", "taniahrebeniuk@gmail.com");
        //...
        List<String> expectedRepositoriedList = new ArrayList<>();
        expectedRepositoriedList.add("test2");
        expectedRepositoriedList.add("test1");
        expectedRepositoriedList.add("test");

        RepositoriesPage repositoriesPage = new RepositoriesPage(driver);
        Assert.assertEquals(expectedRepositoriedList, repositoriesPage.getRepositories());

    }

}
