/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author qwe
 */
public class HW18Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int Array[] = {80, 32, 19, 99, 62, 105};
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("-----------------------------------------------------------------");
        System.out.print("Linear Search  ---- ");
        System.out.print("  ");
        System.out.print("What number do you want to search: ");
        int num = Integer.parseInt(entrada.readLine());

        for (int i = 0; i < Array.length; i++) {
            if (num == Array[i]) {
                System.out.println("---------------------------------------------------------");
                System.out.println("The number is in the array and is in the position " + i);
                System.out.println("---------------------------------------------------------");
            }
        }
    }

}
