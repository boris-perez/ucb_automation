package stepsDefinitions;

import base.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import task.TurnoTask;
import validaciones.TurnoValidarQue;

public class TurnoStepdefs {

    WebDriver driver = DriverManager.getDriver();

    @Given("el usuario esta en la pagina de turno")
    public void elUsuarioEstaEnLaPaginaDeTurno() {
        driver.get("http://clinicasoft.xyz/turno");
    }

    @When("el usuario selecciona el boton de {}")
    public void creaUnNuevoTurno(String option) {
        TurnoTask.newTurno(driver, option);
    }

    @Then("el turno se ha creado correctamente")
    public void elTurnoSeHaCreadoCorrectamente() {


    }

    @And("ingresa el nombre del turno {}")
    public void ingresaElNombreDelTurnoMañana(String turno) {
        TurnoTask.enterName(driver, turno);
    }

    @Then("el input para introducir el nombre esta visible")
    public void elInputParaIntroducirElNombreEstaVisible() {
        Assert.assertTrue(TurnoValidarQue.inputIsVisible(driver));
    }
}
