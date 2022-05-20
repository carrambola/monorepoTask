package selenium.model;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class InpostSearchedPage extends Page{
    @FindBy(xpath = "//div[@class = 'single--status--block -active']//child::p[@class = 'paragraph--component -big -secondary']")
    private WebElement STATUS_CHECK;

    public InpostSearchedPage(WebDriver driver) {
        super(driver);
    }

    public String getStatusName(){
        return STATUS_CHECK.getText();
    }
}
