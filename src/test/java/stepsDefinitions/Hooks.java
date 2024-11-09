package stepsDefinitions;

import base.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void setUp() {
        WebDriver driver = DriverManager.getDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        Assert.assertEquals("Google", title);
    }

    @After
    public void quit() {
        DriverManager.quitDriver();
    }
}
