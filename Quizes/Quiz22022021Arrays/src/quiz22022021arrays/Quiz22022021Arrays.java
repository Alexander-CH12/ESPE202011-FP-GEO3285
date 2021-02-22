/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz22022021arrays;

import java.util.Scanner;

/**
 *
 * @author qwe
 */
public class Quiz22022021Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int CNE = 0;
        String[] Candidates;
        float[] percentage;

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the number of candidates you want to register -> ");
        CNE = scanner.nextInt();

        Candidates = new String[CNE];
        percentage = new float[CNE];

        for (int i = 0; i < CNE; i++) {
            scanner.nextLine();
            System.out.print(" Please enter the candidate's name # " + i + " -> ");
            Candidates[i] = scanner.nextLine();
            System.out.print(" Please enter " + Candidates[i] + " percentage ->");
            percentage[i] = scanner.nextFloat();
        }

        System.out.println(" Candidate    ->  \t     percentage ");

        for (int i = 0; i < CNE; i++) {
            System.out.println(Candidates[i] + " ->  \t " + percentage[i]);
        }

    }

}
