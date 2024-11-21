package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
    public static void on(WebDriver webDriver, By locator){
        WebElement element = webDriver.findElement(locator);
        Actions action = new Actions(webDriver);
        action.moveToElement(element);
    }
}
