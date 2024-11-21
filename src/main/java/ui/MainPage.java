package ui;

import org.openqa.selenium.By;

public class MainPage {

    public static By page(String pageName) {
        return By.xpath(String.format("//div[@class='menu-area']//a[.='%s']", pageName));
    }
}
