import org.testng.Assert;
import org.testng.annotations.Test;

public class IssuesTabTest extends BasicTest {

    @Test
    public void GoToIssuesPage() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfullLogin("taniahrebeniuk@gmail.com", "taniahrebeniuk@gmail.com");
        MyProjectPage myProjectPage = new MyProjectPage(driver);
        myProjectPage.goToMyProjectPage();
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.goToIssueTab();
        issuesPage.clickOnNewIssueButton();
        Assert.assertTrue(issuesPage.isNewIssueFormDisplayed());
        issuesPage.enterTitleAndComment("Some title", "Some comment");
        issuesPage.submitNewIssue();
        issuesPage.isIssueWithTitleDisplayed("Some title");
    }
}