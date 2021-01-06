/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp02_controlstatement;

/**
 *
 * @author Rodrigo Soria
 */
import java.util.Scanner;
public class fp02_controlstatement{
    public static void main(String[] args){ 
    
  int n= 0;
  Scanner scanner = new Scanner(System.in);
  System.out.printf("Please enter a number ---> ");
  int number = scanner.nextInt(); 
        System.out.println("You entered--->" +number);
        if (number %2==0)
        {
            System.out.println("number " +number+ " even");
        }else {
            System.out.println("number " +number+ " odd");
        }

    }}