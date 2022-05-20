package selenium.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageFactory {
    private WebDriver driver;
    public PageFactory(WebDriver driver){
        this.driver = driver;
    }
    public <T extends Page> T create(Class<T> classToProxy ){
        return org.openqa.selenium.support.PageFactory.initElements(driver, classToProxy);
    }
}
