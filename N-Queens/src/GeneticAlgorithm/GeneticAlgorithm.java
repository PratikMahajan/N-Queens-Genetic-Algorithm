/*
 * References:
 * https://gist.github.com/aliva/5355681
 * https://github.com/hajix/N-Queen
 * and open the template in the editor.
 */
package GeneticAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
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
        
        public GeneticAlgorithm(int n, int max_epoch, double mutation_rate ) {
		MAX_LENGTH = n;
		START_SIZE = 40;
		MAX_EPOCHS = max_epoch;
		MATING_PROBABILITY = 0.7;
		MUTATION_RATE = mutation_rate;
		MIN_SELECT = 10; 
		MAX_SELECT = 30;
		OFFSPRING_PER_GENERATION = 20;
		MINIMUM_SHUFFLES = 8; 
		MAXIMUM_SHUFFLES = 20;  
		epoch = 0;
		populationSize = 0;
	}
        
        
    
        
    //----------------------------------------------------
    // Random Number Generation
    //----------------------------------------------------
        public int generateRandomNumber(int low, int high) {
   		return (int)Math.round((high - low) * rand.nextDouble() + low);
	}
        
        public int noRepeteRandom(int high, int reject){
            boolean stop = false;
            int random = 0;

            while(!stop) {
                    random = rand.nextInt(high);
                    if(random != reject){
                            stop = true;
                    }
            }
            return random; 
        }
        
        
    //----------------------------------------------------
    //Initialize queens in random position
    //----------------------------------------------------     
        
        public void initializeQueens() {
		int shuffles = 0;
		Chromosome chromo = null;
		int index = 0;

		for(int i = 0; i < START_SIZE; i++)  {
			chromo = new Chromosome(MAX_LENGTH);
			population.add(chromo);
			index = population.indexOf(chromo);

	
			shuffles = generateRandomNumber(MINIMUM_SHUFFLES, MAXIMUM_SHUFFLES);
			exchangeMutation(index, shuffles);
			population.get(index).computeConflict();
		}
	}
        
        public void exchangeMutation(int index, int exchanges) {
		int tmp = 0;
		int g1 = 0;
		int g2 = 0;
		Chromosome chromo = null;
		chromo = population.get(index);

		for(int i = 0; i < exchanges; i++) {
			g1 = generateRandomNumber(0, MAX_LENGTH - 1);
			g2 = noRepeteRandom(MAX_LENGTH - 1, g1);

			// Exchange genes.
			tmp = chromo.getGene(g1);
			chromo.setGene(g1, chromo.getGene(g2));
			chromo.setGene(g2, tmp);
		}
		mutations++;
	}
        
      //----------------------------------------------------
    // Get Fitness 
    //----------------------------------------------------
        
     
    public void getFitness() {
            // min 0% and max 100%
            int populationSize = population.size();
            Chromosome chromo = null;
            double best = 0;
            double worst = 0;

            worst = Collections.max(population).getConflicts();

            best = worst - Collections.min(population).getConflicts();

            for(int i = 0; i < populationSize; i++) {
                    chromo = population.get(i);
                    chromo.setFitness((worst - chromo.getConflicts()) * 100.0 / best);
            }   
    }

   
    //----------------------------------------------------
    // Roulette Selection
    // https://stackoverflow.com/questions/298301/roulette-wheel-selection-algorithm
    // https://stackoverflow.com/questions/177271/roulette-selection-in-genetic-algorithms
    //----------------------------------------------------
    //
    public void rouletteSelection() {
        int populationSize = population.size();
        int maximumToSelect = generateRandomNumber(MIN_SELECT, MAX_SELECT);
        double genTotal = 0.0;
        double selTotal = 0.0;
        double rouletteSpin = 0.0;
        Chromosome chromo = null;
        Chromosome otherChromo = null;
        boolean stop = false;
        int j = 0;
        
        for(int i = 0; i < populationSize; i++) {												//get total fitness
            chromo = population.get(i);
            genTotal += chromo.getFitness();
        }
        
        genTotal *= 0.01;															

        for(int i = 0; i < populationSize; i++) {
            chromo = population.get(i);
            chromo.setSelectionProb(chromo.getFitness() / genTotal);		//set selection probability. the more fit the better selection probability
        }
        
        for(int i = 0; i < maximumToSelect; i++) {										//selects parents
            rouletteSpin = generateRandomNumber(0, 99);
            j = 0;
            selTotal = 0;
            stop = false;
            while(!stop) {
                chromo = population.get(j);
                selTotal += chromo.getSelectionProb();
                if(selTotal >= rouletteSpin) {
					 if(j == 0) {
					    otherChromo = population.get(j);
					 } else if(j >= populationSize - 1) {
					     otherChromo = population.get(populationSize - 1);
					 } else {
					     otherChromo = population.get(j-1);
					 }
					otherChromo.setSelected(true);
					stop = true;
                } else {
                    j++;
                }
            }
        }
    }

      //----------------------------------------------------
    // Partially Mapped Crossover
    // https://github.com/DEAP/deap/blob/master/deap/tools/crossover.py
    // https://stackoverflow.com/questions/52350699/how-to-perform-partially-mapped-crossover-operator-pmx
    //----------------------------------------------------
    
    public void partiallyMappedCrossover(int chromA, int chromB, int child1, int child2) {
        int j = 0;
        int obj1 = 0;
        int obj2 = 0;
        int ind1 = 0;
        int ind2 = 0;
        Chromosome chromo1 = population.get(chromA);
        Chromosome chromo2 = population.get(chromB);
        Chromosome childChromo1 = population.get(child1);
        Chromosome childChromo2 = population.get(child2);
        int crossPoint1 = generateRandomNumber(0, MAX_LENGTH - 1);
        int crossPoint2 = noRepeteRandom(MAX_LENGTH - 1, crossPoint1);
        
        //gets the crosspoint from where to swap
        if(crossPoint2 < crossPoint1) {
            j = crossPoint1;
            crossPoint1 = crossPoint2;
            crossPoint2 = j;
        }

        // Copy Parent genes to offspring.
        for(int i = 0; i < MAX_LENGTH; i++) {
            childChromo1.setGene(i, chromo1.getGene(i));
            childChromo2.setGene(i, chromo2.getGene(i));
        }

        for(int i = crossPoint1; i <= crossPoint2; i++) {
            // Get the two items to swap.
            obj1 = chromo1.getGene(i);
            obj2 = chromo2.getGene(i);

            // Get the items//  positions in the offspring.
            for(j = 0; j < MAX_LENGTH; j++) {
                if(childChromo1.getGene(j) == obj1) {
                    ind1 = j;
                } else if (childChromo1.getGene(j) == obj2) {
                    ind2 = j;
                }
            } // j

            // Swap them.
            if(obj1 != obj2) {
                childChromo1.setGene(ind1, obj2);
                childChromo1.setGene(ind2, obj1);
            }

            // Get the items//  positions in the offspring.
            for(j = 0; j < MAX_LENGTH; j++) {
                if(childChromo2.getGene(j) == obj2) {
                    ind1 = j;
                } else if(childChromo2.getGene(j) == obj1) {
                    ind2 = j;
                }
            } 

            // Swap them.
            if(obj1 != obj2) {
                childChromo2.setGene(ind1, obj1);
                childChromo2.setGene(ind2, obj2);
            }

        } 
	}
    
    //----------------------------------------------------
    // Reset all flags in Selection 
    //----------------------------------------------------
    public void resetSelection(){
    }
    
    
    //-----------------------------------------
    //getters and setters
    //-----------------------------------------
        
        
        public int getNextMutation() {
            return nextMutation;
        }

        public void setNextMutation(int nextMutation) {
            this.nextMutation = nextMutation;
        }

        public ArrayList<Chromosome> getPopulation() {
            return population;
        }

        public void setPopulation(ArrayList<Chromosome> population) {
            this.population = population;
        }

        public ArrayList<Chromosome> getSolutions() {
            return solutions;
        }

        public void setSolutions(ArrayList<Chromosome> solutions) {
            this.solutions = solutions;
        }

        public Random getRand() {
            return rand;
        }

        public void setRand(Random rand) {
            this.rand = rand;
        }

        public int getChildCount() {
            return childCount;
        }

        public void setChildCount(int childCount) {
            this.childCount = childCount;
        }

        public int getMutations() {
            return mutations;
        }

        public void setMutations(int mutations) {
            this.mutations = mutations;
        }

        public int getEpoch() {
            return epoch;
        }

        public void setEpoch(int epoch) {
            this.epoch = epoch;
        }

        public int getPopulationSize() {
            return populationSize;
        }

        public void setPopulationSize(int populationSize) {
            this.populationSize = populationSize;
        }

        
        public double getMATING_PROBABILITY() {
        return MATING_PROBABILITY;
        }

        public void setMATING_PROBABILITY(double MATING_PROBABILITY) {
            this.MATING_PROBABILITY = MATING_PROBABILITY;
        }

        public double getMUTATION_RATE() {
            return MUTATION_RATE;
        }

        public void setMUTATION_RATE(double MUTATION_RATE) {
            this.MUTATION_RATE = MUTATION_RATE;
        }

        public int getMAX_LENGTH() {
            return MAX_LENGTH;
        }

        public void setMAX_LENGTH(int MAX_LENGTH) {
            this.MAX_LENGTH = MAX_LENGTH;
        }

        public int getSTART_SIZE() {
            return START_SIZE;
        }

        public void setSTART_SIZE(int START_SIZE) {
            this.START_SIZE = START_SIZE;
        }

        public int getMAX_EPOCHS() {
            return MAX_EPOCHS;
        }

        public void setMAX_EPOCHS(int MAX_EPOCHS) {
            this.MAX_EPOCHS = MAX_EPOCHS;
        }

        public int getMIN_SELECT() {
            return MIN_SELECT;
        }

        public void setMIN_SELECT(int MIN_SELECT) {
            this.MIN_SELECT = MIN_SELECT;
        }

        public int getMAX_SELECT() {
            return MAX_SELECT;
        }

        public void setMAX_SELECT(int MAX_SELECT) {
            this.MAX_SELECT = MAX_SELECT;
        }

        public int getOFFSPRING_PER_GENERATION() {
            return OFFSPRING_PER_GENERATION;
        }

        public void setOFFSPRING_PER_GENERATION(int OFFSPRING_PER_GENERATION) {
            this.OFFSPRING_PER_GENERATION = OFFSPRING_PER_GENERATION;
        }

        public int getMINIMUM_SHUFFLES() {
            return MINIMUM_SHUFFLES;
        }

        public void setMINIMUM_SHUFFLES(int MINIMUM_SHUFFLES) {
            this.MINIMUM_SHUFFLES = MINIMUM_SHUFFLES;
        }

        public int getMAXIMUM_SHUFFLES() {
            return MAXIMUM_SHUFFLES;
        }

        public void setMAXIMUM_SHUFFLES(int MAXIMUM_SHUFFLES) {
            this.MAXIMUM_SHUFFLES = MAXIMUM_SHUFFLES;
        }

  

    //-------------------------------------------------
    //-------------------------------------------------
        
        
        
        
        
}
