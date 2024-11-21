package validaciones;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.TurnoPage;

public class TurnoValidarQue {
    public static boolean inputIsVisible(WebDriver driver) {
        return WaitUntilElement.isVisible(driver, TurnoPage.turnoName);
    }
}
