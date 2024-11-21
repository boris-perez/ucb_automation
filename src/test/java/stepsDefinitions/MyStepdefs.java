package stepsDefinitions;

import base.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import task.NavigateTo;
import ui.MainPage;

public class MyStepdefs {

    WebDriver driver = DriverManager.getDriver();

    @Given("the user is located in ClinicaSoft")
    public void theUserIsLocatedInClinicaSoft() {
    }

    @When("the user wants to navigate to {}")
    public void theUserWantsToNavigateToPage(String page) {
        NavigateTo.page(driver, MainPage.page(page));
    }
}
