/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws10;

/**
 *
 * @author Rodrigo Soria
 */
public class WS10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int divd = 5;
        int divr = 10;
        float quotient = 0;
        int x = 0;
        int y = 0;
        
        quotient = divideTwoNumbers(divd, divr);

        System.out.println("Quotient of 5 and 10 is -> " + quotient); //0.5 or ?

        y = f(3);
        System.out.println("3^2 -> " + y);

        y = f(-3);
        System.out.println("-3^2 -> " + y); //9
        
        x = -1;
        y = f(x);
        System.out.println("the square of -> " + x + " <- is equal to -> " + y);

    }

    
    public static float divideTwoNumbers(int dividend, int divisor) {
        
        float quotient = 0.0F;

       
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int f(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y = 0;

        y = x * x + 2 * x + 1;

        return y;
    }

}