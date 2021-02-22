/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctionquiz;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Soria
 */
public class CorrectionQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int totalOfStudents = 0;
        String[] students;
        float[] gradesAverages;

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Please Enter the amount of Students you want to record -> ");
        totalOfStudents = scanner.nextInt();

        students = new String[totalOfStudents];
        gradesAverages = new float[totalOfStudents];

        for (int i = 0; i < totalOfStudents; i++) {
            scanner.nextLine();
            System.out.print(" Please Enter the name of Student # " + i + " -> ");
            students[i] = scanner.nextLine();
            System.out.print(" Please enter " + students[i] + " grade average ->");
            gradesAverages[i] = scanner.nextFloat();
        }

        System.out.println(" Student    ->  \t     grade average ");

        for (int i = 0; i < totalOfStudents; i++) {
            System.out.println(students[i] + " ->  \t " + gradesAverages[i]);
        }

    }

}