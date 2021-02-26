/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmw16;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Soria
 */
public class HMW16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   float[][] z;
        float[][] w;
        float[][] q;
        float[][] x;
        int n = 0;
        int m = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the matrix dimensions");
        System.out.print("\n m -->");
        m = input.nextInt();

        System.out.print("\n n -->");
        n = input.nextInt();

        z = new float[m][n];
        w = new float[m][n];
        x = new float[m][n];

        q = new float[n][m];

        System.out.println("---Enter the elements of the matrix---");

        z = readMatrixElements(m, n, "Z", input);
        w = readMatrixElements(m, n, "W", input);

        for (int tab = 0; tab <= m / 2; tab++) {
            System.out.print("\t");
        }
        System.out.println(" ---- Z ---- ");

        prettyPrintMatrix(m, n, z);
        System.out.print("");

               System.out.println(" ---- W ---- ");
        
        prettyPrintMatrix(m, n, w);
        System.out.println("");

        System.out.println("-- The Product of matrices is --");

             System.out.print(" ---- X ---- ");
        x = multiplyingTwoMatrices(m, n, z, w);
        prettyPrintMatrix(m, n, x);
    }

    public static float[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        float[][] matrix;
        matrix = new float[m][n];
        for (int i = 0; i < m; i++) {
            System.out.print("--ROW Numbers--" + (i + 1) + "--");
            for (int j = 0; j < n; j++) {
                System.out.print(matrixName + " [ " + (i + 1) + " ] [ " + (j + 1) + " ] --> ");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
    }

    public static float[][] multiplyingTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] c;
        c = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }
        return c;
    }

    public static void prettyPrintMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("\t");
                    } else if (i == m - 1) {
                        System.out.print("\t");
                    } else {
                        System.out.print("\t");
                    }

                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.print("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.print("\t");
                    } else if (i == m - 1) {
                        System.out.print("\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
        }
        System.out.println("");
    }

    
    } 
