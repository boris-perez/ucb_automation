package stepsDefinitions;

import base.DriverManager;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {

    private static WebDriver driver = DriverManager.getDriver();

    @BeforeAll
    public static void setUp() {

        driver.get("http://clinicasoft.xyz/");
        driver.manage().window().maximize();
    }

    @After
    public void captureScreenShot(Scenario scenario) {
        byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());

    }

    @AfterAll
    public static void tearDown() {
        DriverManager.quitDriver();
    }

}
