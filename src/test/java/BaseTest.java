import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest
{
    static WebDriver driver;
    @BeforeMethod(description="Setup ChromeDriver")
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions option= new ChromeOptions();
        option.addArguments("--disable-notifications");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
    }

    @AfterMethod(description="Closing and apllication")
    public void quit()
    {
        driver.close();
        Reporter.log("====Browser Session Ends====", true);
    }
}
