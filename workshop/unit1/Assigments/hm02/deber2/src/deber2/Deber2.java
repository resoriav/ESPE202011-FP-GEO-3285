/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber2;

/**
 *
 * @author Rodrigo Soria
 */

public class Deber2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
        for (char x='Z'; x >= 'A'; x--) {
        for (char y=x; y >= 'A'; y--) { 
            System.out.print(y);
        }
        System.out.println();
        }
        }   
        }
    }