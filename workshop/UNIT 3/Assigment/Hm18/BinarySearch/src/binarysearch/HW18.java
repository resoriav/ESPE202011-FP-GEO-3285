/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author Rodrigo Soria
 */
public class HW18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] gradesOver10 = {1, 5, 8, 9, 6, 2, 4};
        int grade = 1;
        System.out.println(" ** Rodrigo Soria **");
        System.out.println("");
        System.out.println("Binary Search");
        System.out.println(":)");
        binarySearch(gradesOver10, grade);

        int[] a1 = {18, 22, 33, 50, 68, 72};
        int key = 22;
        System.out.println("");
        System.out.println("Linear Search");
        System.out.println(":)");
        System.out.println("Your age integer is in index " + linearSearch(a1, key) + " of the array ");
        System.out.println("");
        System.out.println(" -- See you soon --");

    }

    public static void binarySearch(int[] parameterOne, int parameterTwo) {
        int index = -1;
        int lowEnd = 0;
        int highEnd = parameterOne.length - 1;
        while (highEnd >= lowEnd) {
            int middle = (lowEnd + highEnd) / 2;

            if (parameterOne[middle] == parameterTwo) {
                index = middle;
                break;
            } else if (parameterOne[middle] < parameterTwo) {

                lowEnd = middle + 1;
            } else if (parameterOne[middle] > parameterTwo) {

                highEnd = middle - 1;
            }
        }
        if (index == -1) {
            System.out.println("Your grade integer does not exist in the array");
        } else {
            System.out.println("Your grade integer is in index " + index + " of the array");
        }
    }

    public static int linearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
