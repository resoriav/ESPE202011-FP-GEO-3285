/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.util.Scanner;
/**
 *
 * @author Rodrigo Soria
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    
   
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        

        do {
            System.out.println(" 1. Factorial ");
            System.out.println(" 0. Exit ");
            
            System.out.println(" Enter menu option---> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int factorial =1, n, i=1;
                    for (; ;){
                    System.out.println(" Enter a number ");
                    n= input.nextInt ();
                    if (n>=0 && n<=15)
                    break;
                    }
                    for (i=1;i<=n;i++){
                    factorial=factorial*i;
                    }
                    System.out.println(" THE FACTORIAL IS " +factorial);
                    break;
                    
                case 0:
                 System.out.println(" See you Later ");  
                 System.exit(0);
                 break;
                default:
                System.out.println("Incorrect Option ");
                break;
            }
            } while (option != 3);
    }    
    }
    
                