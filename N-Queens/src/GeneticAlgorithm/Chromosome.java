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
    private int fitness;
    private int conflicts;
    private boolean selected;
    private double selectionProb;

    public int[] getGene() {
        return gene;
    }

    public void setGene(int[] gene) {
        this.gene = gene;
    }

    public int getFitness() {
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
    
    
    
    
    
}
