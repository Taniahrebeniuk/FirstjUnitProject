import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class DataProviderTest extends BasicTest {


    @DataProvider(name = "dataProvider")
    public Object[][] getSearchTerms() {
        return new Object[][]{
                {"java"},
                {"testng"},
                {"dataprovider"}
        };
    }

    @Test(dataProvider = "dataProvider")
    public void testSearch(String searchTerm) {
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys(searchTerm);
            searchBox.submit();
            List<WebElement> searchResults = driver.findElements(By.cssSelector(".repo-list-item"));
            Assert.assertTrue(searchResults.size() > 0);
    }
}