import org.openqa.selenium.WebDriver;

public class MainPage extends BasicPage {

    private final static String TITLE = "MainPage";
    public MainPage(WebDriver driver) {
        super(driver, TITLE);
    }
}