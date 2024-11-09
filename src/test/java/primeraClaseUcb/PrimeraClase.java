package primeraClaseUcb;

import actions.IsDisplayed;
import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import task.Google;
import ui.Search;

public class PrimeraClase extends BaseTest {

    @Test
    public void googleTest() {
        Google.search(driver, "UCB tarija");
        Assert.assertTrue(IsDisplayed.element(driver, Search.imageSection));
    }

    @Test
    public void googleTestLosTiempos() {
        Google.search(driver, "Los Tiempos");

    }
}
