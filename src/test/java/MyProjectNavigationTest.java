import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MyProjectNavigationTest extends BasicTest {

    @Test
    public void testGoToMyProjectPage() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfullLogin("taniahrebeniuk@gmail.com", "taniahrebeniuk@gmail.com");
        MyProjectPage myProjectPage = new MyProjectPage(driver);
        myProjectPage.goToMyProjectPage();
    }
}