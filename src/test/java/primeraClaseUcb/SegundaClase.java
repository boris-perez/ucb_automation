package primeraClaseUcb;

import base.BaseTest;
import org.junit.Test;
import task.Google;

public class SegundaClase extends BaseTest {


    @Test
    public void googleTestBOA() {
        Google.search(driver, "BOA");
    }


}
