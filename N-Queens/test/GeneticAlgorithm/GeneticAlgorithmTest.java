/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneticAlgorithm;

import java.util.ArrayList;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mansi
 */
public class GeneticAlgorithmTest {
    
    public GeneticAlgorithmTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of runGA method, of class GeneticAlgorithm.
     */
    @Test
    public void testRunGA() {
        System.out.println("runGA");
        RunGeneticNQueens tester = new RunGeneticNQueens();
            
        tester.test(8, 0.001, 1000);
        boolean expResult = true;
        boolean result = tester.ga.runGA();
        
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testRunGA1() {
        System.out.println("runGA");
        RunGeneticNQueens tester = new RunGeneticNQueens();
            
        tester.test(8, 0.001, 2000);
        boolean expResult = true;
        boolean result = tester.ga.runGA();
        
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testRunGA2() {
        System.out.println("runGA");
        RunGeneticNQueens tester = new RunGeneticNQueens();
            
        tester.test(8, 0.001, 3000);
        boolean expResult = true;
        boolean result = tester.ga.runGA();
        
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testRunGA3() {
        System.out.println("runGA");
        RunGeneticNQueens tester = new RunGeneticNQueens();
            
        tester.test(8, 0.001, 4000);
        boolean expResult = true;
        boolean result = tester.ga.runGA();
        
        assertEquals(expResult, result);
       
    }
    
    //Note the mutation's are randomly generated so in order to test this please uncomment the rand.setSeed() 
    //in GeneticAlgorithm.java 
    //random.setSeed(20) -- will always generate the same random values and is introduced just for testing the genetic
    //algorithm , since otherwise it always generates random population and chromosomes
     @Test
    public void testMutation() {
       
        RunGeneticNQueens tester = new RunGeneticNQueens();
            
        tester.test(8, 0.001, 1000);
        int expResult = 40;
        int result = tester.ga.getMutations();
        
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testMutation1() {
       
        RunGeneticNQueens tester = new RunGeneticNQueens();
            
        tester.test(8, 0.001, 2000);
        int expResult = 40;
        int result = tester.ga.getMutations();
        
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testMutation2() {
       
        RunGeneticNQueens tester = new RunGeneticNQueens();
            
        tester.test(8, 0.001, 3000);
        int expResult = 40;
        int result = tester.ga.getMutations();
        
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testChooseOffspring() {
       
        RunGeneticNQueens tester = new RunGeneticNQueens();
            
        tester.test(8, 0.001, 3000);
        int expResult = 678;
        int result = tester.ga.getChildCount();
        
        assertEquals(expResult, result);
       
    }
    /**
     * Test of printSolution method, of class GeneticAlgorithm.
     */
   
}
