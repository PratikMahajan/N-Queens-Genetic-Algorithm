/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneticAlgorithm;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author mahajan
 */
public class GeneticAlgorithm {
    
    
 	private double MATING_PROBABILITY;    
	private double MUTATION_RATE;   
        
	private int MAX_LENGTH;                 // Length of chess board
	private int START_SIZE;			// Population 
	private int MAX_EPOCHS;                 // Test Cycle Number
    
	private int MIN_SELECT;                 // Minimum Parents
	private int MAX_SELECT;                 // Maximum Parents
	private int OFFSPRING_PER_GENERATION;   // < Max_select
	private int MINIMUM_SHUFFLES;           
	private int MAXIMUM_SHUFFLES;

	private int nextMutation;               
	private ArrayList<Chromosome> population;
	private ArrayList<Chromosome> solutions;
	private Random rand;
	private int childCount;
	private int mutations;
	private int epoch;
	private int populationSize;
    
        
        
        public GeneticAlgorithm(int n, int start_size, int max_epoch, double mating_prob, double mutation_rate ) {
		MAX_LENGTH = n;
		START_SIZE = start_size;
		MAX_EPOCHS = max_epoch;
		MATING_PROBABILITY = mating_prob;
		MUTATION_RATE = mutation_rate;
		MIN_SELECT = 10; 
		MAX_SELECT = 30;
		OFFSPRING_PER_GENERATION = 20;
		MINIMUM_SHUFFLES = 8; 
		MAXIMUM_SHUFFLES = 20;  
		epoch = 0;
		populationSize = 0;
	}
    
        
        
        
        
        
        
        
        
        
}
