package ui;

import org.openqa.selenium.By;

public class TurnoPage {

    public static By turnoName = By.xpath("//input[@id='turno']");
    public static By turnosBody = By.xpath("//div[@class = 'container mt-4']//tbody");

    public static By select(String option) {
        return By.xpath(String.format("//button[text()='%s']", option));
    }
}



