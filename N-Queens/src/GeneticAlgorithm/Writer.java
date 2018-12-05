/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneticAlgorithm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author mahajan
 */
public class Writer {
    private ArrayList<String> list;
	
	public Writer() {
		list = new ArrayList<String>();
	}

	public void add(String line) {
		list.add(line);
	}
	
	public void add(Chromosome c) {
		int n = c.getMAX_LENGTH();
		String board[][] = new String[n][n];

		clearBoard(board, n);

		for(int x = 0; x < n; x++) {
			board[x][c.getGene(x)] = "*";
		}

		printBoard(board, n);
	}
	
	public void clearBoard(String[][] board, int n) {
		// Clear the board.
		for(int x = 0; x < n; x++) {
			for(int y = 0; y < n; y++) {
				board[x][y] = "";
			}
		}
	}
	
	public void printBoard(String[][] board, int n) {
		// Display the board.
		for(int y = 0; y < n; y++) {
			String temp = "";
			for(int x = 0; x < n; x++) {
				if(board[x][y] == "*") {
					temp += "* ";
				} else {
					temp += ". ";
				}
			}
			list.add(temp);
		}
	}
	

	public void writeFile(String filename) {
		try{
        	FileWriter fw = new FileWriter(filename);
			BufferedWriter bw = new BufferedWriter(fw);
		
			for(int i = 0; i < list.size(); i++) {
				bw.write(list.get(i));
				bw.newLine();
				bw.flush();
			}

			bw.close();
        } catch (IOException e) {
        	System.out.println("output failed");
        }
		
	}
}
