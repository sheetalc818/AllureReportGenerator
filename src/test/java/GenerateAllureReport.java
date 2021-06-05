import org.testng.annotations.Test;

/**
 * Links to refer - https://www.swtestacademy.com/allure-report-testng/
 * add Allure command-line interpreter from https://www.npmjs.com/package/allure-commandline in your system
 * and add it's path globally - C:\Users\dell\AppData\Roaming\npm\node_modules\allure-commandline\bin
 * run project as - Edit configuration- select Maven - in command enter "clean test"
 * Once success then open cmd in current project and type - allure serve allure-results
 */
public class GenerateAllureReport extends BaseTest {

    @Test(priority=0, description="Login to application with valid credentials")
    public void loginTest() {
        driver.get("https://www.facebook.com");
    }
}
