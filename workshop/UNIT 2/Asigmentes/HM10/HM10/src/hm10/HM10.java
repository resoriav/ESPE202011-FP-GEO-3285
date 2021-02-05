/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hm10;
import java.util.Scanner;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
/**
 *
 * @author Rodrigo Soria
 */
@SupportedSourceVersion(SourceVersion.RELEASE_15)
public class HM10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
        int dividend; 
        int divisor = 0;
        float quotient;
        int Number = 0;
        int Number2 = 0;
        int table = 0;
        int stp = 0;
        int product = 0;
        
      
        System.out.println(">>>>>>>>>>> MADE BY RODRIGO SORIA <<<<<<<<<<< ");
 
    
      System.out.println("   ");    
    System.out.println(" DIVISION  ");    
    System.out.println("   ");    
    
    System.out.println("   Enter  Dividend   ");

        dividend=input.nextInt ();
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("    Enter the  Divisor   ");
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    divisor=input.nextInt ();
    quotient = divideTwoNumbers( divisor,dividend);
    System.out.println(" THE RESULT " + dividend + " and " + divisor + " is -> " + quotient); 

   
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");   
    System.out.println("  Enter a number to square it " );
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    Number=input.nextInt ();
    Number2 = foxtrot(Number);
    System.out.println("The Square of number is -> " + Number + " <- = -> " + Number2);
    
    
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="); 
    System.out.println("   Enter the First number  ");
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    Number=input.nextInt ();     
    Number2 = foxtrot(Number);
    System.out.println("Number : " + Number + " ^2-->" + Number2); 
   
    

    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");          
    System.out.println(" Enter the Second6 number");
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="); 
    Number=input.nextInt (); 
    Number2 =(Number);
    System.out.println(" Number = " + Number + " * " 
            + Number + " + 2 * " + Number + " + 1-> Number = " + Number2);
   
    
    
    
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println(" Enter number of table");
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="); 
    table=input.nextInt (); 
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("Enter the last number of the Multiplication Table ");
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="); 
    stp=input.nextInt ();
      
    
    
    for (int j = 1 ; j <= stp ; j ++){
    product = table * j;
    System.out.println(+ table + " * " + j + " = " + product);
    }
     
    System.out.println("   ");
    System.out.println("   ");
    System.out.println("     I HOPE YOU ENJOY IT     "); 
    System.out.println("   ");
    System.out.println("   ");
    System.out.println("   ");        
     System.out.println("    >> MADE BY RODRIGO SORIA <<      "); 
    System.out.println("       -=-=-=-=-=-=-=-=-=-=-=-=-     "); 
    
    }
    //function definition
    //return data type    name     parameter1   parameter2
    public static float divideTwoNumbers( int divisor, int dividend) {
        //body of the function
        float quotient = 0.0F;

        //             5        10   -> 0.5
        // float     int        int
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int foxtrot(int Number) {
        
        int Number2 = 0;
        Number2 = Number * Number;

        return Number2;
    }

    public static int quebec(int number) {
     
        int number2 = 0;
        number2 = number * number + 2 * number2 + 1;

        return number2;
    }
     public static int tablemulriplication() {   
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println(" MULTIPLICATION TABLE ");
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="); 
    
    int top=0;
    int product=0;
    int table=0;
    for (int j = 1 ; j <= top ; j ++){
    product = table * j;
    System.out.println( + table + " * " + j + " = " + product);
   
      
     } 
         return product;
}
}
