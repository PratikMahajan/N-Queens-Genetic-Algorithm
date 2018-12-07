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
    
    //Note the mutation's are randomly generated so in order to test this please uncomment the rand.setSeed() 
    //in GeneticAlgorithm.java 
     @Test
    public void testMutation() {
       
        RunGeneticNQueens tester = new RunGeneticNQueens();
            
        tester.test(8, 0.001, 1000);
        int expResult = 40;
        int result = tester.ga.getMutations();
        
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testChooseOffspring() {
       
        RunGeneticNQueens tester = new RunGeneticNQueens();
            
        tester.test(8, 0.001, 1000);
        int expResult = 678;
        int result = tester.ga.getChildCount();
        
        assertEquals(expResult, result);
       
    }
    /**
     * Test of printSolution method, of class GeneticAlgorithm.
     */
//    @Test
//    public void testPrintSolution() {
//        System.out.println("printSolution");
//        Chromosome solution = null;
//        GeneticAlgorithm instance = null;
//        instance.printSolution(solution);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of generateRandomNumber method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGenerateRandomNumber() {
//        System.out.println("generateRandomNumber");
//        int low = 0;
//        int high = 0;
//        GeneticAlgorithm instance = null;
//        int expResult = 0;
//        int result = instance.generateRandomNumber(low, high);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of noRepeteRandom method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testNoRepeteRandom() {
//        System.out.println("noRepeteRandom");
//        int high = 0;
//        int reject = 0;
//        GeneticAlgorithm instance = null;
//        int expResult = 0;
//        int result = instance.noRepeteRandom(high, reject);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of initializeQueens method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testInitializeQueens() {
//        System.out.println("initializeQueens");
//        GeneticAlgorithm instance = null;
//        instance.initializeQueens();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of exchangeMutation method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testExchangeMutation() {
//        System.out.println("exchangeMutation");
//        int index = 0;
//        int exchanges = 0;
//        GeneticAlgorithm instance = null;
//        instance.exchangeMutation(index, exchanges);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFitness method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetFitness() {
//        System.out.println("getFitness");
//        GeneticAlgorithm instance = null;
//        instance.getFitness();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of rouletteSelection method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testRouletteSelection() {
//        System.out.println("rouletteSelection");
//        GeneticAlgorithm instance = null;
//        instance.rouletteSelection();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of chooseParent method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testChooseParent_0args() {
//        System.out.println("chooseParent");
//        GeneticAlgorithm instance = null;
//        int expResult = 0;
//        int result = instance.chooseParent();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of chooseParent method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testChooseParent_int() {
//        System.out.println("chooseParent");
//        int parentA = 0;
//        GeneticAlgorithm instance = null;
//        int expResult = 0;
//        int result = instance.chooseParent(parentA);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of mate method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testMate() {
//        System.out.println("mate");
//        GeneticAlgorithm instance = null;
//        instance.mate();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of partiallyMappedCrossover method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testPartiallyMappedCrossover() {
//        System.out.println("partiallyMappedCrossover");
//        int chromA = 0;
//        int chromB = 0;
//        int child1 = 0;
//        int child2 = 0;
//        GeneticAlgorithm instance = null;
//        instance.partiallyMappedCrossover(chromA, chromB, child1, child2);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of resetSelection method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testResetSelection() {
//        System.out.println("resetSelection");
//        GeneticAlgorithm instance = null;
//        instance.resetSelection();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getNextMutation method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetNextMutation() {
//        System.out.println("getNextMutation");
//        GeneticAlgorithm instance = null;
//        int expResult = 0;
//        int result = instance.getNextMutation();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setNextMutation method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testSetNextMutation() {
//        System.out.println("setNextMutation");
//        int nextMutation = 0;
//        GeneticAlgorithm instance = null;
//        instance.setNextMutation(nextMutation);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPopulation method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetPopulation() {
//        System.out.println("getPopulation");
//        GeneticAlgorithm instance = null;
//        ArrayList<Chromosome> expResult = null;
//        ArrayList<Chromosome> result = instance.getPopulation();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPopulation method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testSetPopulation() {
//        System.out.println("setPopulation");
//        ArrayList<Chromosome> population = null;
//        GeneticAlgorithm instance = null;
//        instance.setPopulation(population);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getSolutions method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetSolutions() {
//        System.out.println("getSolutions");
//        GeneticAlgorithm instance = null;
//        ArrayList<Chromosome> expResult = null;
//        ArrayList<Chromosome> result = instance.getSolutions();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setSolutions method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testSetSolutions() {
//        System.out.println("setSolutions");
//        ArrayList<Chromosome> solutions = null;
//        GeneticAlgorithm instance = null;
//        instance.setSolutions(solutions);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getRand method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetRand() {
//        System.out.println("getRand");
//        GeneticAlgorithm instance = null;
//        Random expResult = null;
//        Random result = instance.getRand();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setRand method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testSetRand() {
//        System.out.println("setRand");
//        Random rand = null;
//        GeneticAlgorithm instance = null;
//        instance.setRand(rand);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getChildCount method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetChildCount() {
//        System.out.println("getChildCount");
//        GeneticAlgorithm instance = null;
//        int expResult = 0;
//        int result = instance.getChildCount();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setChildCount method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testSetChildCount() {
//        System.out.println("setChildCount");
//        int childCount = 0;
//        GeneticAlgorithm instance = null;
//        instance.setChildCount(childCount);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMutations method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetMutations() {
//        System.out.println("getMutations");
//        GeneticAlgorithm instance = null;
//        int expResult = 0;
//        int result = instance.getMutations();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMutations method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testSetMutations() {
//        System.out.println("setMutations");
//        int mutations = 0;
//        GeneticAlgorithm instance = null;
//        instance.setMutations(mutations);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEpoch method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetEpoch() {
//        System.out.println("getEpoch");
//        GeneticAlgorithm instance = null;
//        int expResult = 0;
//        int result = instance.getEpoch();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setEpoch method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testSetEpoch() {
//        System.out.println("setEpoch");
//        int epoch = 0;
//        GeneticAlgorithm instance = null;
//        instance.setEpoch(epoch);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPopulationSize method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetPopulationSize() {
//        System.out.println("getPopulationSize");
//        GeneticAlgorithm instance = null;
//        int expResult = 0;
//        int result = instance.getPopulationSize();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPopulationSize method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testSetPopulationSize() {
//        System.out.println("setPopulationSize");
//        int populationSize = 0;
//        GeneticAlgorithm instance = null;
//        instance.setPopulationSize(populationSize);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMATING_PROBABILITY method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetMATING_PROBABILITY() {
//        System.out.println("getMATING_PROBABILITY");
//        GeneticAlgorithm instance = null;
//        double expResult = 0.0;
//        double result = instance.getMATING_PROBABILITY();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMATING_PROBABILITY method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testSetMATING_PROBABILITY() {
//        System.out.println("setMATING_PROBABILITY");
//        double MATING_PROBABILITY = 0.0;
//        GeneticAlgorithm instance = null;
//        instance.setMATING_PROBABILITY(MATING_PROBABILITY);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMUTATION_RATE method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetMUTATION_RATE() {
//        System.out.println("getMUTATION_RATE");
//        GeneticAlgorithm instance = null;
//        double expResult = 0.0;
//        double result = instance.getMUTATION_RATE();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMUTATION_RATE method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testSetMUTATION_RATE() {
//        System.out.println("setMUTATION_RATE");
//        double MUTATION_RATE = 0.0;
//        GeneticAlgorithm instance = null;
//        instance.setMUTATION_RATE(MUTATION_RATE);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMAX_LENGTH method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetMAX_LENGTH() {
//        System.out.println("getMAX_LENGTH");
//        GeneticAlgorithm instance = null;
//        int expResult = 0;
//        int result = instance.getMAX_LENGTH();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMAX_LENGTH method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testSetMAX_LENGTH() {
//        System.out.println("setMAX_LENGTH");
//        int MAX_LENGTH = 0;
//        GeneticAlgorithm instance = null;
//        instance.setMAX_LENGTH(MAX_LENGTH);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getSTART_SIZE method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetSTART_SIZE() {
//        System.out.println("getSTART_SIZE");
//        GeneticAlgorithm instance = null;
//        int expResult = 0;
//        int result = instance.getSTART_SIZE();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setSTART_SIZE method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testSetSTART_SIZE() {
//        System.out.println("setSTART_SIZE");
//        int START_SIZE = 0;
//        GeneticAlgorithm instance = null;
//        instance.setSTART_SIZE(START_SIZE);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMAX_EPOCHS method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetMAX_EPOCHS() {
//        System.out.println("getMAX_EPOCHS");
//        GeneticAlgorithm instance = null;
//        int expResult = 0;
//        int result = instance.getMAX_EPOCHS();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMAX_EPOCHS method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testSetMAX_EPOCHS() {
//        System.out.println("setMAX_EPOCHS");
//        int MAX_EPOCHS = 0;
//        GeneticAlgorithm instance = null;
//        instance.setMAX_EPOCHS(MAX_EPOCHS);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMIN_SELECT method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetMIN_SELECT() {
//        System.out.println("getMIN_SELECT");
//        GeneticAlgorithm instance = null;
//        int expResult = 0;
//        int result = instance.getMIN_SELECT();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMIN_SELECT method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testSetMIN_SELECT() {
//        System.out.println("setMIN_SELECT");
//        int MIN_SELECT = 0;
//        GeneticAlgorithm instance = null;
//        instance.setMIN_SELECT(MIN_SELECT);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMAX_SELECT method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetMAX_SELECT() {
//        System.out.println("getMAX_SELECT");
//        GeneticAlgorithm instance = null;
//        int expResult = 0;
//        int result = instance.getMAX_SELECT();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMAX_SELECT method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testSetMAX_SELECT() {
//        System.out.println("setMAX_SELECT");
//        int MAX_SELECT = 0;
//        GeneticAlgorithm instance = null;
//        instance.setMAX_SELECT(MAX_SELECT);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getOFFSPRING_PER_GENERATION method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetOFFSPRING_PER_GENERATION() {
//        System.out.println("getOFFSPRING_PER_GENERATION");
//        GeneticAlgorithm instance = null;
//        int expResult = 0;
//        int result = instance.getOFFSPRING_PER_GENERATION();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setOFFSPRING_PER_GENERATION method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testSetOFFSPRING_PER_GENERATION() {
//        System.out.println("setOFFSPRING_PER_GENERATION");
//        int OFFSPRING_PER_GENERATION = 0;
//        GeneticAlgorithm instance = null;
//        instance.setOFFSPRING_PER_GENERATION(OFFSPRING_PER_GENERATION);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMINIMUM_SHUFFLES method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetMINIMUM_SHUFFLES() {
//        System.out.println("getMINIMUM_SHUFFLES");
//        GeneticAlgorithm instance = null;
//        int expResult = 0;
//        int result = instance.getMINIMUM_SHUFFLES();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMINIMUM_SHUFFLES method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testSetMINIMUM_SHUFFLES() {
//        System.out.println("setMINIMUM_SHUFFLES");
//        int MINIMUM_SHUFFLES = 0;
//        GeneticAlgorithm instance = null;
//        instance.setMINIMUM_SHUFFLES(MINIMUM_SHUFFLES);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMAXIMUM_SHUFFLES method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testGetMAXIMUM_SHUFFLES() {
//        System.out.println("getMAXIMUM_SHUFFLES");
//        GeneticAlgorithm instance = null;
//        int expResult = 0;
//        int result = instance.getMAXIMUM_SHUFFLES();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMAXIMUM_SHUFFLES method, of class GeneticAlgorithm.
//     */
//    @Test
//    public void testSetMAXIMUM_SHUFFLES() {
//        System.out.println("setMAXIMUM_SHUFFLES");
//        int MAXIMUM_SHUFFLES = 0;
//        GeneticAlgorithm instance = null;
//        instance.setMAXIMUM_SHUFFLES(MAXIMUM_SHUFFLES);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
