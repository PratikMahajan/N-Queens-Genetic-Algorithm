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
public class WriterTest {
    
    public WriterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of add method, of class Writer.
     */
    @Test
    public void testAdd_String() {
        System.out.println("add");
        String line = "";
        Writer instance = new Writer();
        instance.add(line);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Writer.
     */
    @Test
    public void testAdd_Chromosome() {
        System.out.println("add");
        Chromosome c = null;
        Writer instance = new Writer();
        instance.add(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearBoard method, of class Writer.
     */
    @Test
    public void testClearBoard() {
        System.out.println("clearBoard");
        String[][] board = null;
        int n = 0;
        Writer instance = new Writer();
        instance.clearBoard(board, n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printBoard method, of class Writer.
     */
    @Test
    public void testPrintBoard() {
        System.out.println("printBoard");
        String[][] board = null;
        int n = 0;
        Writer instance = new Writer();
        instance.printBoard(board, n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeFile method, of class Writer.
     */
    @Test
    public void testWriteFile() {
        System.out.println("writeFile");
        String filename = "";
        Writer instance = new Writer();
        instance.writeFile(filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
