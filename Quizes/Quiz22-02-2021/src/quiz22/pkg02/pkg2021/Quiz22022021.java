/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz22.pkg02.pkg2021;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author qwe
 */
public class Quiz22022021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] CNE;
        String[] CANDIDATES = {"Andres Arauz", "Guillermo Lasso", "Yaku Perez", "Xavier Hervas"};
        float[] percentage = { 28.64F, 26F, 13F, 10F,};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of Candidates -> ");
        n = input.nextInt();
        
        CNE = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of Candidates " + (i + 1) + " -> ");
            CNE[i] = input.nextInt();
        }

        for (int Candidates : CNE) {
            System.out.println("Candidate of " + Arrays.toString(CANDIDATES));
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Candidates " + (i + 1) + " -> " + CNE[i]);
        }

        for (String Candidates : CANDIDATES) {
            System.out.println("Candidates name -> " + Candidates);
        }
        
        for (int i = 0; i < percentage.length ; i++) {
            System.out.println("percentage " + (i + 1) + " -> " + percentage[i]);
        }

    }

}
      
        

   