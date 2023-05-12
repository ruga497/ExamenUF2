/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package examenm5final;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ruben
 */
public class SumaIT {
    
    public SumaIT() {
    }
     

    @Test
    public void testSumar() {
        Suma s = new Suma(2, 3);
        assertEquals(5, s.sumar());
        s = new Suma(10, -5);
        assertEquals(5, s.sumar());
    }
    
    @Test
    public void testGetNum1() {
        Suma s = new Suma(2, 3);
        assertEquals(2, s.getNum1());
        s = new Suma(-10, 5);
        assertEquals(-10, s.getNum1());
    }
    
    @Test
    public void testSumaValorAbsolut() {
        Suma s = new Suma(2, 3);
        assertEquals(5, s.sumaValorAbsolut());
        s = new Suma(-10, 5);
        assertEquals(15, s.sumaValorAbsolut());
    }
}

    

