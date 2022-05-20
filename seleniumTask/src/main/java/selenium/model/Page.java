package selenium.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
    protected WebDriver driver;
    protected PageFactory factory;

    public Page(WebDriver driver) {
        this.driver = driver;
        factory = new PageFactory(driver);
    }

}
