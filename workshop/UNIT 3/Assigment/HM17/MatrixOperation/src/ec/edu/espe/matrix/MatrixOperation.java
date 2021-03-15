/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.matrix;


/**
 *
 * @author Rodrigo Soria
 */

class MainClass {
	
    private static void addMatrix(int row, int column, int[][] sum, int[][] matrix1, int[][] matrix2) {
        for(int i=0; i<row; i++) {
            
            for(int j=0; j<column; j++) {
                
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }
     private static void substractMatrix(int row, int column, int[][] sub, int[][] matrix1, int[][] matrix2) {
        for(int i=0; i<row; i++) {
            
            for(int j=0; j<column; j++) {
                
                sub[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
    }
 private static void multiplicateMatrix(int row, int column, int[][] mult, int[][] matrix1, int[][] matrix2) {
        for(int i=0; i<row; i++) {
            
            for(int j=0; j<column; j++) {
                
                mult[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
    }
 private static void divideMatrix(int row, int column, int[][] dive, int[][] matrix1, int[][] matrix2) {
        for(int i=0; i<row; i++) {
            
            for(int j=0; j<column; j++) {
                
                dive[i][j] = matrix1[i][j] / matrix2[i][j];
            }
        }
    }
}