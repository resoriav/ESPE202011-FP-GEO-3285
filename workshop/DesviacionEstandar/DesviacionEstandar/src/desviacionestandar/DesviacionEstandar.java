/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desviacionestandar;

/**
 *
 * @author Rodrigo Soria
 */
import java.util.*;
public class DesviacionEstandar {

 
  float numbers;
  static double media;
  static double variance;
  static double deviation; 
  static int n;
 
    public static void main(String[] args) {
        // TODO code application logic here
    
  Scanner sc = new Scanner(System.in);
  System.out.println("Ingrese la cantidad de numeros a calcular");                                
  n = sc.nextInt();
  
  // values with array
  double numbers [] = new double[n];
    for (int i = 0; i <n;i++)
    {
   System.out.print("Ingrese el numero: ");
   numbers[i] = sc.nextDouble();
   
  }
    // media
    
  double add = 0;
  for (double i: numbers)
  {
      add = add +i;
  }
      media = add / n;
      System.out.println("La Media es:" + media);
      
      //variance
      
      double summation;
      for (int i=0; i<n; i++){
          summation = Math.pow(numbers[i]- media,2);
          variance = variance + summation; 
      }
  variance = variance / (n-1);
  
// deviation
  
  deviation = Math.sqrt(variance);
  double round = Math.rint(deviation*100)/100;
  System.out.println("La Desviacion Estandar es:" + round);
     }
  }
  



