import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BasicTest {

    @DataProvider(name = "dataProvider")
    public Object[][] createData() {
        return new Object[][]{
                {"Alex", 15},
                {"Kate", 20},
        };
    }

    @Test(dataProvider = "dataProvider")
    public void verifyData(String n1, Integer n2) {
        System.out.println(n1 + " " + n2);
    }


    @Test
    public void LoginTest() {

        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.getLogo().isDisplayed());
        loginPage.successfullLogin("taniahrebeniuk@gmail.com", "taniahrebeniuk@gmail.com");
    }

}

