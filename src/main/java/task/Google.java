package task;

import actions.Click;
import actions.Enter;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.Search;

public class Google {
    public static void search(WebDriver driver, String text){
        Enter.text(driver, Search.searchInput, text);
        WaitUntilElement.isClickable(driver, Search.searchButton);
        Click.on(driver, Search.searchButton);
    }
}
