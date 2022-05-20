import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import selenium.model.InpostMainPage;
import selenium.model.Page;

import java.time.Duration;

public class Application extends Page {

    private String MAIN_PAGE_URL;

    public Application(WebDriver driver) {
        super(driver);
        this.MAIN_PAGE_URL = "https://inpost.pl/";
    }

    public InpostMainPage defaultPage() {
        driver.get(MAIN_PAGE_URL);
        return factory.create(InpostMainPage.class);
    }

    public void close() {
        driver.quit();
    }
}
