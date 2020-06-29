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
public class ProductoControllerTest {
    
    public ProductoControllerTest() {
    }
    
    @Rule
    
        public final ExpectedException exception = ExpectedException.none();

    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        ProductoController instance = new ProductoController();
         exception.expect(NullPointerException.class);
        instance.initialize(url, rb);
    }


    @Test
    public void testCargarDatosTabla() {
        
        System.out.println("cargarDatosTabla");
        ProductoController instance = new ProductoController();
        exception.expect(NullPointerException.class);
        instance.cargarDatosTabla();
   
    }

    @Test
    public void testCargarProductosText() {
        System.out.println("cargarProductosText");
        String valor = "";
        ProductoController instance = new ProductoController();
        instance.cargarProductosText(valor);

    }
    
}
