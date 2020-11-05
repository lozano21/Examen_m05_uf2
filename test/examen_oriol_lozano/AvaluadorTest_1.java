/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_oriol_lozano;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author urii2
 */
public class AvaluadorTest_1 {

    private Avaluador instance;
    private Estudiant instance2;

    public AvaluadorTest_1() {
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
        instance = new Avaluador();
        instance2 = new Estudiant("Oriol", 5, 5, 5);
    }

    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     */
    @Test
    public void testMitjanaSiSupera() throws Exception {
        assertEquals(5.0, instance.mitjanaSiSupera(new Estudiant("Oriol", 5, 5, 5)), 0.001);
        assertEquals(0, instance.mitjanaSiSupera(new Estudiant("Gerard", 10, 5, 4)), 0.001);
    }

    /**
     * Test of mitjana method, of class Avaluador.
     */
    @Test
    public void testMitjana() throws Exception {
        assertEquals(5.0, instance.mitjana(instance2), 0.001);
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    public void testMillorEstudiantPerNotaMitjana() {
        Estudiant[] MillorEstudiant = new Estudiant[2];
        MillorEstudiant[0] = new Estudiant("Oriol", 5, 5, 5);
        MillorEstudiant[1] = new Estudiant("Gerard", 10, 5, 4);
        
        assertEquals(MillorEstudiant[1], instance.millorEstudiantPerNotaMitjana(MillorEstudiant));
        
    }

}
