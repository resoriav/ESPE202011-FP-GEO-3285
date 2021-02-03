/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamnUnit1;
 import java.util.Scanner;
/**
 *
 * @author Rodrigo Soria
 */
public class ExamnUnit1 {

    /**
     * @param args the command line arguments
     */
   
   public static void 
          printMultiplicationTable(int number){
      for(int i=1; i<=12; i++)
        System.out.println(number+
           " * "+i+" = "+ number * i);
   }

   public static void main(String[] args) {

      // declare a variable 
      int number = 0;

      
      // read the entered number
      Scanner scan = new Scanner(System.in);

      // read input 
      System.out.print("Enter the number of table::");
      number = scan.nextInt();

      // display multiplication table
      System.out.println("Multiplication"+
              " table of "+number+" is :: ");
      printMultiplicationTable(number);

      // close Scanner class object
      scan.close();
   }
}
       

