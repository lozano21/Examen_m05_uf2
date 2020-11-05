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
public class AvaluadorTest_MillorEstudiant {
    
    private Avaluador instance;
    
    @Parameterized.Parameter(0)
    public Estudiant estudiant0;
    
    @Parameterized.Parameter(1)
     public Estudiant estudiant1;
    
    @Parameterized.Parameter(2)
    public Estudiant ElMillor;
    
    @Parameterized.Parameters
    public static Collection<Object[]>data(){
        
        Object[][] data = new Object[][]{
            {
                new Estudiant("Oriol",5,5,5),
                new Estudiant("Gerard",5,5,3),
                new Estudiant("Oriol",5,5,5)
            },
            {
                new Estudiant("Oriol",5,5,5),
                new Estudiant("Daniel",0,0,0),
                new Estudiant("Oriol",5,5,5)
            },
            {
                new Estudiant("Oriol",5,5,5),
                new Estudiant("Victor",1,2,3),
                new Estudiant("Oriol",5,5,5)
            },
            {
                new Estudiant("Oriol",5,5,5),
                new Estudiant("Carlos",4,5,3),
                new Estudiant("Oriol",5,5,5)
            },
            {
                new Estudiant("Oriol",5,5,5),
                new Estudiant("Anna",1,4,3),
                new Estudiant("Oriol",5,5,5)
            },
            {
                new Estudiant("Oriol",5,5,5),
                new Estudiant("Gerard",6,0,0),
                new Estudiant("Oriol",5,5,5)
            },
            {
                new Estudiant("Oriol",5,5,5),
                new Estudiant("Gerard",5,5,1),
                new Estudiant("Oriol",5,5,5)
            },
            {
                new Estudiant("Oriol",5,5,5),
                new Estudiant("Pep",6,5,3),
                new Estudiant("Oriol",5,5,5)
            },
            {
                new Estudiant("Oriol",5,5,5),
                new Estudiant("Dani",1,5,3),
                new Estudiant("Oriol",5,5,5)
            },
            {
                new Estudiant("Oriol",5,5,5),
                new Estudiant("Raul",2,5,3),
                new Estudiant("Oriol",5,5,5)
            },
            {
                new Estudiant("Oriol",5,5,5),
                new Estudiant("Gerard",5,5,3),
                new Estudiant("Oriol",5,5,5)
            },
            {
                new Estudiant("Oriol",5,5,5),
                new Estudiant("Victor",1,5,3),
                new Estudiant("Oriol",5,5,5)
            },
            {
                new Estudiant("Oriol",5,5,5),
                new Estudiant("Pep",0,2,3),
                new Estudiant("Oriol",5,5,5)
            },
            {
                new Estudiant("Oriol",5,5,5),
                new Estudiant("Selena",0,5,3),
                new Estudiant("Oriol",5,5,5)
            },
            {
                new Estudiant("Oriol",5,5,5),
                new Estudiant("Leo",3,5,3),
                new Estudiant("Oriol",5,5,5)
            },
            
        };
        
        return Arrays.asList(data);
    }
    public AvaluadorTest_MillorEstudiant() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

//    /**
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
//    @Test
//    public void testMitjana() throws Exception {
//        System.out.println("mitjana");
//        Estudiant estudiant = null;
//        Avaluador instance = new Avaluador();
//        double expResult = 0.0;
//        double result = instance.mitjana(estudiant);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    public void testMillorEstudiantPerNotaMitjana() {
        instance = new Avaluador();
        Estudiant[] Millor = new Estudiant[2];
        Millor[0] = estudiant0;
        Millor[1] = estudiant1;
        
        assertEquals(ElMillor, instance.millorEstudiantPerNotaMitjana(Millor));
        
    }
    
}
