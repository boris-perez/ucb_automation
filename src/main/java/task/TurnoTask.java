package task;

import actions.Click;
import actions.Enter;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.TurnoPage;

public class TurnoTask {
    public static void newTurno(WebDriver driver, String option) {
        WaitUntilElement.isClickable(driver, TurnoPage.select(option));
        WaitUntilElement.isVisible(driver, TurnoPage.turnosBody);
        Click.on(driver, TurnoPage.select(option));
    }

    public static void enterName(WebDriver driver, String turnoName) {
        Enter.text(driver, TurnoPage.turnoName, turnoName);
    }
}
