/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmw11;
import java.util.Scanner;
/**
 *
 * @author Rodrigo Soria
 */
public class HMW11 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
 
          Scanner sc = new Scanner(System.in);
          
          System.out.println(">>>>>>>>>>> MADE BY RODRIGO SORIA :D <<<<<<<<<<< ");
          System.out.println("   ");
          System.out.println("   ");
          System.out.print("Enter the quanity of numbers to display in the series: ");
          int limit = sc.nextInt();
          sc.close();
 
          for(int i = 0; i<limit; i++){
               System.out.print(ExhibitFibonacciNumber(i) + ", ");
          }
    System.out.println("   ");
    System.out.println( " ================================ ");
    System.out.println("   ");
    System.out.println("     I HOPE YOU ENJOY IT     "); 
    System.out.println("   ");
    System.out.println("   ");
    System.out.println("   ");        
    System.out.println("    >> MADE BY RODRIGO SORIA <<      "); 
    System.out.println("       -=-=-=-=-=-=-=-=-=-=-=-=-     "); 
     }
 
     private static int ExhibitFibonacciNumber(int number){
          if(number == 0 || number == 1)
               return number;
          else
               return ExhibitFibonacciNumber(number-1) + ExhibitFibonacciNumber(number-2);
     } 
}