import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by Alex on 4/17/2017.
 */
public class Selenium3Test2 {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
        driver = new ChromeDriver(options);
    }

    @Test
    public void testSelenium3WithChrome() throws Exception {
        driver.get("http://stirileprotv.ro/");
        Assert.assertTrue("The title was not as expected! ",driver.getTitle().contains("Stiri de ultima ora"));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
