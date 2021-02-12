/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13;
import java.util.Scanner;
/**
 *
 * @author Rodrigo Soria
 */
public class WS13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
  Scanner input = new Scanner(System.in);
  int option=0;
  do{
   System.out.println();
   System.out.println();
   System.out.println(" ======== Option Menu ========= ");
   System.out.println(" ___________________________________ ");
   System.out.println(" ======== 1. Circule       ========= ");
   System.out.println(" ======== 2. Pentagon     ========= ");
   System.out.println(" ======== 3. Diamond         ========= ");
   System.out.println(" ======== 4. Trapeze      ========= ");
   System.out.println(" ======== 5. Velocity     ========= ");
   System.out.println(" ======== 6. Distance      ========= ");
   System.out.println(" ======== 0.  Exit          ========= ");
   System.out.println(" ___________________________________ ");         
   System.out.println("   ");
            
   System.out.println("Enter your menu option --> ");
            


  option = input.nextInt();
  switch (option){
        
      case 1:
          System.out.println(" Enter the Radio  " + "m");
         int radio = input.nextInt();
           System.out.println("  AREA OF CIRCULE IS :" + calculateCirculearea(radio)+ " m^2");
          break;
     
        case 2:
         System.out.println(" Enter the Perimeter ");
         int perimeter = input.nextInt();
         System.out.println(" Enter the Apothem ");
         int Apothem= input.nextInt();
         System.out.println(" AREA OF PENTAGON IS :"+calculatePentagonarea(perimeter,Apothem)+ " m^2 " );
        break;
        case 3:
         System.out.println("Enter the Major Diagonal");
         int Diagonal_Ma=input.nextInt();
         System.out.println("Enter the Minor Diagonal");
         int Diagonal_Mi=input.nextInt();
         System.out.println(" AREA OF DIAMOND IS :"+calculateDiamondarea(Diagonal_Ma,Diagonal_Mi)+ " m^2 ");
        break;
        
        case 4:
         System.out.println(" Enter the Major Base ");
         int base_ma=input.nextInt();
         System.out.println(" Enter the Minor Base ");
         int base_mi=input.nextInt();
         System.out.println("Enter the Height");
         int height=input.nextInt();
         System.out.println(" "
                 + "AREA OF TRAPEZE :"+calculateTrapezearea(base_ma,base_mi,height)+ " m^2 ");
         break;
         
         case 5:
         int v = 0;
         System.out.println(" Enter the Distance "+ "KM");
         int d=input.nextInt();
         System.out.println(" Enter the time "+ "H");
         int t=input.nextInt();
        
         System.out.println(" "
                 + " Velocity :"+calculateDistance (v, d ,t)+ " km/h ");
         v=d/t;
         break;

        case 6:
         int dis = 0;
         System.out.println(" Enter the Velocity "+ "km/h");
         int velocity=input.nextInt();
         System.out.println(" Enter the time "+ "H");
         int time=input.nextInt();
        
         System.out.println(" "
                 + " Distance :"+calculateVelocity (velocity, dis ,time)+ " km/h ");
         break;

         
        case 7:
         System.out.println("---------------------");
         System.out.println("Good Bye");
         System.exit(0);
         break;
         default:
        System.out.println("Invalid option\n\n\n");
        break;
  }
 
  }while(option!=7);
 }
 static double calculateCirculearea(int r){
  double PI=3.1416;
  return  PI * Math.pow(r,2);
 }
    static int calculatePentagonarea(int p, int a){
     return (p*a) / 2;
    }
    static int calculateDiamondarea(int D,int d){
         return (D*d)/2 ;
    }
   static int calculateTrapezearea (int B , int b , int h){
  
   return ((B+b)/2)*h;
  }
static int calculateDistance (int v , int d , int t){
  
   return (v =(d)/(t));
  }
  static int calculateVelocity (int velocity , int dis , int time){
  
   return (dis =(velocity)*(time));
  }
}
  



