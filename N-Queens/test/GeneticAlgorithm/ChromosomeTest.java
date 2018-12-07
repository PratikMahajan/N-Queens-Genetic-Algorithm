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
public class ChromosomeTest {
    
    public ChromosomeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of initChromosome method, of class Chromosome.
     */
    @Test
    public void testInitChromosome() {
        System.out.println("initChromosome");
        Chromosome instance = null;
        instance.initChromosome();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMAX_LENGTH method, of class Chromosome.
     */
    @Test
    public void testGetMAX_LENGTH() {
        System.out.println("getMAX_LENGTH");
        Chromosome instance = null;
        int expResult = 0;
        int result = instance.getMAX_LENGTH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMAX_LENGTH method, of class Chromosome.
     */
    @Test
    public void testSetMAX_LENGTH() {
        System.out.println("setMAX_LENGTH");
        int MAX_LENGTH = 0;
        Chromosome instance = null;
        instance.setMAX_LENGTH(MAX_LENGTH);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGene method, of class Chromosome.
     */
    @Test
    public void testGetGene_0args() {
        System.out.println("getGene");
        Chromosome instance = null;
        int[] expResult = null;
        int[] result = instance.getGene();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGene method, of class Chromosome.
     */
    @Test
    public void testGetGene_int() {
        System.out.println("getGene");
        int index = 0;
        Chromosome instance = null;
        int expResult = 0;
        int result = instance.getGene(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGene method, of class Chromosome.
     */
    @Test
    public void testSetGene_intArr() {
        System.out.println("setGene");
        int[] gene = null;
        Chromosome instance = null;
        instance.setGene(gene);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGene method, of class Chromosome.
     */
    @Test
    public void testSetGene_int_int() {
        System.out.println("setGene");
        int index = 0;
        int position = 0;
        Chromosome instance = null;
        instance.setGene(index, position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFitness method, of class Chromosome.
     */
    @Test
    public void testGetFitness() {
        System.out.println("getFitness");
        Chromosome instance = null;
        double expResult = 0.0;
        double result = instance.getFitness();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFitness method, of class Chromosome.
     */
    @Test
    public void testSetFitness() {
        System.out.println("setFitness");
        double fitness = 0.0;
        Chromosome instance = null;
        instance.setFitness(fitness);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConflicts method, of class Chromosome.
     */
    @Test
    public void testGetConflicts() {
        System.out.println("getConflicts");
        Chromosome instance = null;
        int expResult = 0;
        int result = instance.getConflicts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConflicts method, of class Chromosome.
     */
    @Test
    public void testSetConflicts() {
        System.out.println("setConflicts");
        int conflicts = 0;
        Chromosome instance = null;
        instance.setConflicts(conflicts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSelected method, of class Chromosome.
     */
    @Test
    public void testIsSelected() {
        System.out.println("isSelected");
        Chromosome instance = null;
        boolean expResult = false;
        boolean result = instance.isSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelected method, of class Chromosome.
     */
    @Test
    public void testSetSelected() {
        System.out.println("setSelected");
        boolean selected = false;
        Chromosome instance = null;
        instance.setSelected(selected);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectionProb method, of class Chromosome.
     */
    @Test
    public void testGetSelectionProb() {
        System.out.println("getSelectionProb");
        Chromosome instance = null;
        double expResult = 0.0;
        double result = instance.getSelectionProb();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectionProb method, of class Chromosome.
     */
    @Test
    public void testSetSelectionProb() {
        System.out.println("setSelectionProb");
        double selectionProb = 0.0;
        Chromosome instance = null;
        instance.setSelectionProb(selectionProb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of emptyBoard method, of class Chromosome.
     */
    @Test
    public void testEmptyBoard() {
        System.out.println("emptyBoard");
        String[][] board = null;
        Chromosome instance = null;
        instance.emptyBoard(board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of markQueens method, of class Chromosome.
     */
    @Test
    public void testMarkQueens() {
        System.out.println("markQueens");
        String[][] board = null;
        Chromosome instance = null;
        instance.markQueens(board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of computeConflict method, of class Chromosome.
     */
    @Test
    public void testComputeConflict() {
        System.out.println("computeConflict");
        Chromosome instance = null;
        instance.computeConflict();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Chromosome.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Chromosome chromo = null;
        Chromosome instance = null;
        int expResult = 0;
        int result = instance.compareTo(chromo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
