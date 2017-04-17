import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Alex on 4/17/2017.
 */
public class Selenium3Test1 {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void testSeleniumLatest1() throws Exception {
        driver.get("http://stirileprotv.ro/");
        Assert.assertTrue("The title was not as expected! ",driver.getTitle().contains("Stiri de ultima ora"));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
