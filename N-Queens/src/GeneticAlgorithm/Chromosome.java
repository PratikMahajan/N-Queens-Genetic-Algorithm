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
    
    
//------------------------------------------------------
//    Initializing Chromosome
//------------------------------------------------------
    
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
//    Compute conflict to calculate fitness
//------------------------------------------------------
    
    
    public void computeConflict(){
        String [][]board = new String[MAX_LENGTH][MAX_LENGTH]; //Initializing the board
        int row=0;
        int column= 0;
        int temp_row=0;
        int temp_column=0;
        
        //arrays to check diagonals
        int []diag_x = new int[]{-1,1,-1,1};
        int []diag_y = new int[]{-1,1,1,-1};
        
        
        boolean stop= false;
        int conflicts=0;
        
        
        
        
        
    }
    
    
//------------------------------------------------------ 
//    Clear Board into Empty array
//------------------------------------------------------   
    public void emptyBoard(String[][] board){
        
        board= new String[MAX_LENGTH][MAX_LENGTH];
        
    }
    

//------------------------------------------------------ 
//    Plot Queens on the board
//------------------------------------------------------  
    
    public void getQueens(String[][] board){
        for(int i =0; i< MAX_LENGTH; i++){
            board[i][gene[i]]="*";
        }
    }
    
    
}
