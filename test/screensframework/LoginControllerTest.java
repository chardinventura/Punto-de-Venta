/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class LoginControllerTest {
    

    public LoginControllerTest() {
    }
    
    @Rule
    
        public final ExpectedException exception = ExpectedException.none();

    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        LoginController instance = new LoginController();
        instance.initialize(url, rb);
    }

    /**
     * Test of setScreenParent method, of class LoginController.
     */
    @Test
    public void testSetScreenParent() {
        System.out.println("setScreenParent");
        ScreensController pantallaPadre = null;
        LoginController instance = new LoginController();
        instance.setScreenParent(pantallaPadre);
    }
    
}
