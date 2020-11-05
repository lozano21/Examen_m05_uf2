/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_oriol_lozano;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author urii2
 */
@RunWith(Parameterized.class)
public class AvaluadorTest_Mitjana {
    
     private Avaluador instance;
    
    @Parameterized.Parameter(0)
    public Estudiant estudiant0;
    
    @Parameterized.Parameter(1)
    public double mitjana;
    
    @Parameterized.Parameters
    public static Collection<Object[]>data(){
        
        Object[][] data = new Object[][]{
            {new Estudiant("Oriol",5,5,5),5},
            {new Estudiant("Gerard",5,5,3),4.33},
            {new Estudiant("Alex",10,10,10),10},
            {new Estudiant("Estel",6,7,8),7},
            {new Estudiant("Leo",5,6,7),6},
            {new Estudiant("Oscar",8,9,4),7},
            {new Estudiant("Marti",5,7,6),6},
            {new Estudiant("Dani",5,6,10),7},
            {new Estudiant("Anna",5,9,5),6.33},
            {new Estudiant("Pep",4,7,6),5.66},
            {new Estudiant("Jordi",5,5,1),3.66},
            {new Estudiant("Sandra",8,9,4),7.0},
            {new Estudiant("Ana",4,5,6),5},
            {new Estudiant("Selena",6,6,6),6},
            {new Estudiant("Victor",5,5,5),5},
            
        };
        
        return Arrays.asList(data);
    }
    
    public AvaluadorTest_Mitjana() {
    }
    
     @BeforeClass
    public static void setUpClass() {
         System.out.println("Iniciando test...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finalizando test...");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
//     * Test of mitjanaSiSupera method, of class Avaluador.
//     */
//    @Test
//    public void testMitjanaSiSupera() throws Exception {
//        System.out.println("mitjanaSiSupera");
//        Estudiant estudiant = null;
//        Avaluador instance = new Avaluador();
//        double expResult = 0.0;
//        double result = instance.mitjanaSiSupera(estudiant);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of mitjana method, of class Avaluador.
//     */
    @Test
    public void testMitjana() throws Exception {
        instance = new Avaluador();
        assertEquals(mitjana, instance.mitjana(estudiant0),0.01);
        
    }

//    /**
//     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
//     */
//    @Test
//    public void testMillorEstudiantPerNotaMitjana() {
//        System.out.println("millorEstudiantPerNotaMitjana");
//        Estudiant[] estudiants = null;
//        Avaluador instance = new Avaluador();
//        Estudiant expResult = null;
//        Estudiant result = instance.millorEstudiantPerNotaMitjana(estudiants);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
