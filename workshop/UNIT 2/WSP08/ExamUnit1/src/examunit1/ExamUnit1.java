/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examunit1;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Soria
 */
public class ExamUnit1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
        
        int multiplier = 1;
        int multiplicand = 0;
        int product;
        int stop = 12;

        product = 0;

        do {
            System.out.println("What Table do you want to study today?? ");
            System.out.println("0 (zero) to exit  --> ");

            Scanner input = new Scanner(System.in);
            multiplicand = input.nextInt();

            if (multiplicand != 0) {
                System.out.println(" The Table of ----> " + multiplicand + " <----");
                for (multiplier = 1; multiplier <= stop; multiplier++) {
                    product = multiplicand * multiplier;
                    System.out.println(multiplicand + " x " + multiplier + " = " + product);
                }
            }
            multiplier = 1;

        } while (multiplicand != 0);

        System.out.println("Come back soon");

    }

}

