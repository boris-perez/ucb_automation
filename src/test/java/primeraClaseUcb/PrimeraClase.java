package primeraClaseUcb;

import actions.Click;
import actions.Enter;
import actions.IsDisplayed;
import actions.WaitUntilElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.Search;

public class PrimeraClase {


    @Test
    public void googleTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        Assert.assertEquals("Google", title);
        Enter.text(driver, Search.searchInput, "UCB tarija");
        WaitUntilElement.isClickable(driver, Search.searchButton);
        Click.on(driver, Search.searchButton);
        Assert.assertTrue(IsDisplayed.element(driver, Search.imageSection));
        driver.quit();
    }
}
