/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmw12;
import java.util.Scanner;

/**
 *
 * @author Rodrigo Soria
 */
public class Hmw12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double money;
       double percentage = 0;
       double total = 0;
       double tax = 0;


       Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("   ");
            System.out.println("1. -> Tax 12%");
            System.out.println("2. -> Foreign Exchange Outflow");  
            System.out.println("0. -> Exit");
            System.out.println("   ");
            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

       case 1:
       Scanner read = new Scanner(System.in);
       
       System.out.println("Enter the price:");
       money = input.nextDouble();
 
       percentage = (12);
       tax = obtainIva(money, percentage);
       total = money + tax;
       
       
       System.out.println( " -------------- ");
       System.err.println(" Money: " + money);
       System.err.println(" Taxes: " + tax);
       System.err.println(" Total: " + total);
       
       break;
        
        case 2:
        System.out.println( " Amount of money ");
        money = input.nextDouble();
        if (money >= 5000){
        
        percentage = (5);
        tax = foreignExchangeoutflow (money,percentage, tax);
        total = money + tax;
        System.out.println("   ");
        System.out.println( " -------------- ");
        System.out.println("   ");
        System.err.println(" Money: " + money );
        System.err.println(" Tax " + tax);
        System.err.println(" Total: " + total);
        System.out.println("   ");
          System.out.println( " -------------- ");
        }else{
       System.out.println("   "); 
       System.out.println( " Don`t have to pay Taxes ");
       System.out.println("   ");  
        
        }
       
        break;
       
                
        case 3:
         System.out.println("---------------------");
         System.out.println("Good Bye");
         System.exit(0);
         break;
         default:
        System.out.println("Invalid option\n\n\n");
        break;

            }

        } while (option != 3);

 
    }
 
    public static double obtainIva(double value, double percentage) {
        return value * percentage / 100;
    }
    public static double foreignExchangeoutflow(double money, double percentage, double tax) {
        tax = money * percentage / 100 ;
        return tax;
        }
    }



