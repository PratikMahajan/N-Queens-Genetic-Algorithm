/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneticAlgorithm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author mahajan
 */
public class RunGeneticNQueens {
    
    Writer logWriter;
    GeneticAlgorithm ga;
    int MAX_RUN;
    int MAX_LENGTH;
    long[] runtimes;


    public RunGeneticNQueens() {
            logWriter = new Writer();
            MAX_RUN = 50;
            runtimes = new long[MAX_RUN];
    }


    public void test(int maxLength, double mutationRate, int maxEpoch) {
            MAX_LENGTH = maxLength;
            ga = new GeneticAlgorithm(MAX_LENGTH, maxEpoch, mutationRate);
            long testStart = System.nanoTime();
            String filepath = "GA-N"+MAX_LENGTH+"-"+mutationRate+"-"+maxEpoch+".txt";
            long startTime = 0;
    long endTime = 0;
    long totalTime = 0;
    int fail = 0;
    int success = 0;

            logParameters();

    for(int i = 0; i < MAX_RUN; ) {									
            startTime = System.nanoTime();
            if(ga.runGA()) {
                    endTime = System.nanoTime();
                    totalTime = endTime - startTime;

                    System.out.println("Done");
                    System.out.println("run "+(i+1));
            System.out.println("time in nanoseconds: "+totalTime);
            System.out.println("Success!");

            runtimes[i] = totalTime;
            i++;
            success++;


            logWriter.add((String)("Run: "+i));
            logWriter.add((String)("Runtime in nanoseconds: "+totalTime));
            logWriter.add((String)("Found at epoch: "+ga.getEpoch()));
            logWriter.add((String)("Population size: "+ga.getPopulationSize()));
            logWriter.add("");

            for(Chromosome c: ga.getSolutions()) {							
                                    logWriter.add(c);
                                    logWriter.add("");
                    }
            } else {														
                    fail++;
                    System.out.println("Fail!");
            }

            if(fail >= 100) {
                    System.out.println("Change Parametres");
                    break;
            }
            startTime = 0;												
            endTime = 0;
            totalTime = 0;
    }

    System.out.println("Success: " +success);
    System.out.println("failures: "+fail);
    logWriter.add("Runtime summary");
    logWriter.add("");

            for(int x = 0; x < runtimes.length; x++){					
                    logWriter.add(Long.toString(runtimes[x]));
            }

            long testEnd = System.nanoTime();
            logWriter.add(Long.toString(testStart));
            logWriter.add(Long.toString(testEnd));
            logWriter.add(Long.toString(testEnd - testStart));


    logWriter.writeFile(filepath);
    printRuntimes();
    }


    public void logParameters() {
    logWriter.add("Genetic Algorithm");
    logWriter.add("Parameters");
    logWriter.add((String)("MAX_LENGTH/N: "+MAX_LENGTH));
    logWriter.add((String)("STARTING_POPULATION: "+ga.getSTART_SIZE()));
    logWriter.add((String)("MAX_EPOCHS: "+ga.getMAX_EPOCHS()));
    logWriter.add((String)("MATING_PROBABILITY: "+ga.getMATING_PROBABILITY()));
    logWriter.add((String)("MUTATION_RATE: "+ga.getMUTATION_RATE()));
    logWriter.add((String)("MIN_SELECTED_PARENTS: "+ga.getMIN_SELECT()));
    logWriter.add((String)("MAX_SELECTED_PARENTS: "+ga.getMAX_SELECT()));
    logWriter.add((String)("OFFSPRING_PER_GENERATION: "+ga.getOFFSPRING_PER_GENERATION()));
    logWriter.add((String)("MINIMUM_SHUFFLES: "+ga.getMINIMUM_SHUFFLES()));
    logWriter.add((String)("MAXIMUM_SHUFFLES: "+ga.getMAXIMUM_SHUFFLES()));
    logWriter.add("");
    }


    
    public void printRuntimes() {
            for(long x: runtimes){
                    System.out.println("run with time "+x+" nanoseconds");
            }	
    }

    public static void main(String args[]) {
            RunGeneticNQueens tester = new RunGeneticNQueens();

            tester.test(8, 0.001, 1000);


    }

    
    
}
