/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg02.pkg22.pkg2021;
import java.util.Scanner;
/**
 *
 * @author Rodrigo Soria
 */
public class Quiz02222021 {

    /**
     * @param args the command line arguments
     */
   static String[] names = new String[5];
	static double[][] grades = new double[5][3];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Register Student #" + (i+1));
			System.out.print("Name: ");
			names[i] = scanner.nextLine();
			System.out.print("Grade 1: ");
			grades[i][0] = Double.parseDouble(scanner.nextLine());
			System.out.print("Grade 2: ");
			grades[i][1] = Double.parseDouble(scanner.nextLine());
			grades[i][2] = (((((grades[i][0]+grades[i][1])/2)+0.5))*2)/2;
			System.out.println("Average: " + grades[i][2]);
			System.out.println("Student saved  \n");
		}
        }
}
