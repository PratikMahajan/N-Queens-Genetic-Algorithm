//
//
//

package GeneticAlgorithm;

/**
 *
 * @author mahajan
 */
public class Chromosome implements Comparable<Chromosome>{
    
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
    
    public int getGene(int index) {
	return gene[index];
    }

    public void setGene(int[] gene) {
        this.gene = gene;
    }
    
    public void setGene(int index, int position) {
        this.gene[index] = position;
    }

    public double getFitness() {
        return fitness;
    }

    public void setFitness(double fitness) {
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
//    Clear Board into Empty array
//------------------------------------------------------   
    
    public void emptyBoard(String[][] board){
        
        board= new String[MAX_LENGTH][MAX_LENGTH];
        
    }
    

//------------------------------------------------------ 
//    Plot Queens on the board
//------------------------------------------------------  
    
    public void markQueens(String[][] board){
        for(int i =0; i< MAX_LENGTH; i++){
            board[i][gene[i]]="*";
        }
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
        int conflict=0;
        
        emptyBoard(board);
        markQueens(board);
        
        // Check every queen if there is conflict with another queen
        // j is the directions for searching diagonally if any queen is in path 
        for(int i=0; i< MAX_LENGTH; i++){
            row =i;
            column= gene[i];
            
            for(int j=0; j<4; j++){
                
                temp_row= row;
                temp_column= column;
                stop= false; //Stopping condition at the end of the board
                
                while(!stop){
                    temp_row+=diag_x[j];
                    temp_column+=diag_y[j];
                    
                    if((temp_row < 0 || temp_row >= MAX_LENGTH) || (temp_column < 0 || temp_column >= MAX_LENGTH)){
                        stop= true;
                        // Board out of bounds, stop this iteration
                    }
                    else{
                        if ( board[temp_row][temp_column].equals("*")){
                            conflict+=1;
                            // Another queen in path, thus invalid, causing conflict
                        }
                    } 
                }  
            }  
        }
       
        this.conflicts= conflict;
    }
    
  
    
    public int compareTo(Chromosome chromo) {
		return this.conflicts - chromo.getConflicts();
	}
    
    
    
    
}
