package selenium.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class InpostMainPage extends Page{

    @FindBy(xpath = "//input[@placeholder = 'Wpisz numer przesyłki']")
    WebElement SEARCH_BOX;
    @FindBy(xpath = "//span[text() = 'Znajdź']//parent::button")
    WebElement FIND_BUTTON;
    @FindBy(xpath = "//button[@id = 'onetrust-accept-btn-handler']")
    WebElement COOKIE_BUTTON;

    public InpostMainPage(WebDriver driver) {
        super(driver);
    }


    public InpostSearchedPage searchForPackage(String number){
        SEARCH_BOX.sendKeys(number);
        FIND_BUTTON.click();
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10));
        return factory.create(InpostSearchedPage.class);
    }

    public InpostMainPage acceptCookies(){
        COOKIE_BUTTON.click();
        return this;
    }


}
