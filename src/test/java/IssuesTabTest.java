import helper.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static helper.ColorPrinter.printColorMessage;
import static org.junit.jupiter.api.Assertions.*;

public class IssuesTabTest extends BasicTest {
 protected Logger logger;
    @Test
    public void GoToIssuesPage() {
        Logger logger = LogManager.getLogger();
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfullLogin("taniahrebeniuk@gmail.com", "taniahrebeniuk@gmail.com");
        MyProjectPage myProjectPage = new MyProjectPage(driver);
        myProjectPage.goToMyProjectPage();
        IssuesPage issuesPage = new IssuesPage(driver);
        printColorMessage("Go to Issue page test is starting", logger, Level.INFO);
        issuesPage.goToIssueTab();
        printColorMessage("Click on new issue button test is started", logger, Level.INFO);
        issuesPage.clickOnNewIssueButton();
        Assertions.assertTrue(issuesPage.isNewIssueFormDisplayed());
        issuesPage.enterTitleAndComment("Some title", "Some comment");
        printColorMessage("Tittle and comment are created", logger, Level.INFO);
        issuesPage.submitNewIssue();
        issuesPage.isIssueWithTitleDisplayed("Some title");
        printColorMessage("New issue is successfully submitted and tittle is present", logger, Level.INFO);
    }
}