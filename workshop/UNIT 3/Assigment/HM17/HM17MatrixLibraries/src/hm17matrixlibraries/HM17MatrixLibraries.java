/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hm17matrixlibraries;

import java.util.Scanner;
import ec.edu.espe.matrix.MatrixOperation;
/**
 *
 * @author Rodrigo Soria
 */
public class HM17MatrixLibraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan;
        int matrix1[][], matrix2[][], sum[][], sub[][], mult[][], dive[][];
        int row, column;

        scan = new Scanner(System.in);

        System.out.println("Matrix Addition");

        System.out.println("\nEnter number of rows & columns");
        row = Integer.parseInt(scan.nextLine());
        column = Integer.parseInt(scan.nextLine());

        matrix1 = new int[row][column];
        matrix2 = new int[row][column];
        sum = new int[row][column];

        System.out.println("Enter the data for first matrix :");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                matrix1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter the data for second matrix :");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                matrix2[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nThe First Matrix is :");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print("\t" + matrix1[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n\nThe Second Matrix is :");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print("\t" + matrix2[i][j]);
            }
            System.out.println();
        }

        addMatrix(row, column, sum, matrix1, matrix2);

        System.out.println("\n\nThe Sum is :");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print("\t" + sum[i][j]);
            }
            System.out.println();

        }
         System.out.println("Matrix Substract");

        sub = new int[row][column];

        substractMatrix(row, column, sub, matrix1, matrix2);

        System.out.println("\n\n The Substract is :");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print("\t" + sub[i][j]);
            }
            System.out.println();

        }
         System.out.println("Matrix Multiplication ");
        mult = new int[row][column];

        multiplicateMatrix(row, column, mult, matrix1, matrix2);

        System.out.println("\n\n The Multiplication  is :");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print("\t" + mult[i][j]);
            }
            System.out.println();

        }
         System.out.println("Matrix Division");

        dive = new int[row][column];

        divideMatrix(row, column, dive, matrix1, matrix2);

        System.out.println("\n\n The Division is :");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print("\t" + dive[i][j]);
            }
            System.out.println();

        }
    }
 
}


