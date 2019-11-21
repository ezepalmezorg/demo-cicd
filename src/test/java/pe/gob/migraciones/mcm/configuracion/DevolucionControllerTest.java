package pe.gob.migraciones.mcm.configuracion;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;
import pe.gob.migraciones.mcm.configuracion.controller.DevolucionController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevolucionControllerTest {

    @Autowired
    private DevolucionController helloController;

    @Test
    public void contextLoads() {
        Assert.assertEquals("Hello World from DZONE", helloController.home());
    }
}
