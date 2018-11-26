//
//
//

package GeneticAlgorithm;

/**
 *
 * @author mahajan
 */
public class Chromosome {
    
    private int MAX_LENGTH;
    private int[] gene ;
    private double fitness;
    private int conflicts;
    private boolean selected;
    private double selectionProb;

    
    public Chromosome(int maxLen){
        MAX_LENGTH= maxLen;
        gene = new int[MAX_LENGTH];
        conflicts= 0;
        fitness = 0.0;
        selected= false;
        selectionProb= 0.0;
        initChromosome();
    }
    
    
    public void initChromosome(){
	for(int i = 0; i < MAX_LENGTH; i++){
            this.gene[i] = i;
            }
    }

//------------------------------------------------------
//    Getters and Setters 
//------------------------------------------------------
    
    public int[] getGene() {
        return gene;
    }

    public void setGene(int[] gene) {
        this.gene = gene;
    }

    public double getFitness() {
        return fitness;
    }

    public void setFitness(int fitness) {
        this.fitness = fitness;
    }

    public int getConflicts() {
        return conflicts;
    }

    public void setConflicts(int conflicts) {
        this.conflicts = conflicts;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public double getSelectionProb() {
        return selectionProb;
    }

    public void setSelectionProb(double selectionProb) {
        this.selectionProb = selectionProb;
    }
    
//------------------------------------------------------ 
//------------------------------------------------------
    
    
    
    
    
    
    
}
