package task;

import actions.Click;
import actions.MouseOver;
import actions.WaitUntilElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui.MainPage;

public class NavigateTo {
    public static void page(WebDriver driver, By page) {
        WaitUntilElement.sleep();
        WaitUntilElement.visible(driver, page);
        MouseOver.on(driver, page);
        Click.on(driver, page);
    }
}
