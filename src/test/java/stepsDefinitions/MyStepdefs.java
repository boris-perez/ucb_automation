package stepsDefinitions;

import actions.IsDisplayed;
import base.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import task.Google;
import ui.Search;

public class MyStepdefs {

    WebDriver driver = DriverManager.getDriver();

    @Given("^que el usuario esta en la pagina de google$")
    public void queElUsuarioEstaEnLaPaginaDeGoogle() {
    }

    @When("busca {}")
    public void buscaUCBTarija(String text) {
        Google.search(driver, text);
    }

    @Then("^encontro UCB en la web$")
    public void encontroUCBEnLaWeb() {
        Assert.assertTrue(IsDisplayed.element(driver, Search.imageSection));
    }
}
