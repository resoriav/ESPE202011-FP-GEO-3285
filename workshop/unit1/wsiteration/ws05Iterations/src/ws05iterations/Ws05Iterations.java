/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws05iterations;

/**
 *
 * @author Rodrigo Soria
 */
public class Ws05Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   int i;
        i = 0;

        System.out.println("==== This is a while loop from 1 to 45 ====");

        while (i < 45) {
            System.out.println("i -> " + (i + 1));
            //i += 1;
            i++;
            //i = i + 1;
        }

        System.out.println("first 45 even numbers");
        i = 2;
        while (i <= 45) {
            System.out.println(i + " -> is even");
            i += 2;
        }

        System.out.println("First 45 odd numbers");
        
        int stop;
        stop =45;
        for(int j=1 ; j < stop ; j+=2){
            System.out.println("odd number -> " + j);
        }
        
        System.out.println("Multiplication Tables : 45");
        int top=12;
        int product=0;
        int table = 45;
        for (int j = 1 ; j <= top ; j++){
            product = table * j;
            System.out.println(" 45 * " + j + " = " + product);
        }
    }
}
