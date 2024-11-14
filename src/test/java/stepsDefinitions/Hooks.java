package stepsDefinitions;

import base.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver = DriverManager.getDriver();

    @Before
    public void setUp() {

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        Assert.assertEquals("Google", title);
    }

    @After
    public void tearDown(Scenario scenario) {
        byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
        DriverManager.quitDriver();
    }

}
