/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws07menus;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Soria
 */
public class WS07menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Addition");
            System.out.println("2. -> Subtraction");
            System.out.println("3. -> Multiplication");
            System.out.println("4. -> Division");
            System.out.println("5. ->  Square Root");
            System.out.println("6. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int addend1;
                    int addend2;
                    int sum;
                    System.out.println("enter addend 1 -> ");
                    addend1 = input.nextInt();
                    System.out.println("enter addend 2 -> ");
                    addend2 = input.nextInt();
                    sum = addend1 + addend2;
                    System.out.println(" the sum is --> " + sum);
                    break;
                    
                case 2:
                    int minuend;
                    int subtrahend;
                    int difference;
                    System.out.println("The  difference is");
                    System.out.println("enter minuend -> ");
                    minuend = input.nextInt();
                    System.out.println("enter subtrahend -> ");
                    subtrahend = input.nextInt();
                     difference = minuend - subtrahend;
                    System.out.println(" the difference --> " + difference);
                    break;
                case 3:
                    int product;
                    int multiplicant;
                    int multiplier;
                    System.out.println("The multiplcation is");
                    System.out.println("enter multiplier -> ");
                    product = input.nextInt();
                    System.out.println("enter multiplicant -> ");
                    multiplicant = input.nextInt();
                     multiplier = product * multiplicant;
                    System.out.println(" product --> " + multiplier);
                    break;
                case 4:
                    int divisor;
                    int dividend;
                    int quotient;
                    System.out.println("The division is");
                    System.out.println("enter divisor -> ");
                    divisor = input.nextInt();
                    System.out.println("enter dividend -> ");
                    dividend = input.nextInt();
                     quotient = divisor / dividend;
                    System.out.println(" quotient --> " + quotient);
                    break;
                    
                
                    case 5:
                    int num = 16;
                     System.out.println("enter a number -> ");
                    num = input.nextInt();
                  
                     double resultado = Math.sqrt(num);
                    System.out.println(" Square Root of " + num + " is " + resultado);
                    break;
                
                    case 6:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

}