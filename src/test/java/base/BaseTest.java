package base;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    protected WebDriver driver = new ChromeDriver();

    @Before
    public void setUp() {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        Assert.assertEquals("Google", title);
    }

    @After
    public void quit() {
        driver.quit();
    }
}
