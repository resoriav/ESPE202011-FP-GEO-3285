/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperation;

/**
 *
 * @author Rodrigo Soria
 */
public class BasicOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Operations
        int sum;
        int addend1;
        int addend2;
        
        int minuend;
        int subtrahend;
        int difference;
        
        int product;
        int multiplicant;
        int multiplier;
        
        int divisor;
        int dividend;
        int quotient;
        
        int modulus;
                
        
          //Values             
        addend1= 5;
        addend2= 18;
        
        minuend = -23;
        subtrahend = -6;
        
        multiplicant = 27;
        multiplier = 11;
        
        divisor = 10;
        dividend = 5;
                
        
        
        sum = addend1 + addend2;
        System.out.println(" The adition of " + addend1 + " + " + addend2 +
                " Is equal to --> " + sum);
        
        
        ++sum;
        
        System.out.println("Sum is equal to --> " + sum);
        
        sum++;
        
        System.out.println(" Sum is equal to --> " + sum);
        System.out.println(" Adding one to sum " + (sum++));
        System.out.println(" Adding one to sum " + (++sum));
        
        System.out.println(" The Substraction of " + minuend + " - " + subtrahend 
                + " Is equal to " + (minuend - subtrahend) );
        
        difference = minuend - subtrahend;
        
        System.out.println(" Difference is equal to --> " + difference);
        
        
        product = multiplier* multiplicant;
        
        System.out.println(" The multiplication of " + multiplicant + " * " 
             + multiplier + " Is equal to --> " + product);
       
        quotient = divisor / dividend;
        
        System.out.println(" The division of " + divisor + " / " + dividend
              + " Is equal to --> " + quotient  );
        System.out.println(" Quoyient is Equal to --> " + quotient  );
        
       modulus = dividend % divisor;
        System.out.println(" The residue of the division " + divisor + "/" + 
                dividend + " Is equal to --> " + (dividend / divisor));
        System.out.println(" Rodrigo Soria");
        
     
       
        
    }
    
}
