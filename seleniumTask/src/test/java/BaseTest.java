import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.model.InpostMainPage;

import java.io.File;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    Application app;
    InpostMainPage inpostMainPage;
    WebDriver driver;

    @SneakyThrows
    protected void createScreenshot(String marker){
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir")+"\screenshots\screenshot_"+marker+".png"));
    }

    @BeforeAll
    void beforeAll(){
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.app = new Application(driver);
        inpostMainPage = app.defaultPage();
        inpostMainPage.acceptCookies();
    }
    @AfterEach
    void quit(){
        app.close();
    }





}
