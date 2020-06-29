
package screensframework;

import java.net.URL;
import java.util.ResourceBundle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author eduardosanz
 */
public class RegistroControllerTest {
    
    public RegistroControllerTest() {
    }
        @Rule
    
        public final ExpectedException exception = ExpectedException.none();

    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        RegistroController instance = new RegistroController();
         exception.expect(NullPointerException.class);
        instance.initialize(url, rb);

    }

    /**
     * Test of setScreenParent method, of class RegistroController.
     */
    @Test
    public void testSetScreenParent() {
        System.out.println("setScreenParent");
        ScreensController pantallaPadre = null;
        RegistroController instance = new RegistroController();
        instance.setScreenParent(pantallaPadre);

    }
    
}
