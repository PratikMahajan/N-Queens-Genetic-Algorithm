/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneticAlgorithm;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mansi
 */
public class RunGeneticNQueensTest {
    
    public RunGeneticNQueensTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of test method, of class RunGeneticNQueens.
     */
    @Test
    public void testTest() {
        System.out.println("test");
        int maxLength = 0;
        double mutationRate = 0.0;
        int maxEpoch = 0;
        RunGeneticNQueens instance = new RunGeneticNQueens();
        instance.test(maxLength, mutationRate, maxEpoch);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logParameters method, of class RunGeneticNQueens.
     */
    @Test
    public void testLogParameters() {
        System.out.println("logParameters");
        RunGeneticNQueens instance = new RunGeneticNQueens();
        instance.logParameters();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printRuntimes method, of class RunGeneticNQueens.
     */
    @Test
    public void testPrintRuntimes() {
        System.out.println("printRuntimes");
        RunGeneticNQueens instance = new RunGeneticNQueens();
        instance.printRuntimes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class RunGeneticNQueens.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RunGeneticNQueens.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
