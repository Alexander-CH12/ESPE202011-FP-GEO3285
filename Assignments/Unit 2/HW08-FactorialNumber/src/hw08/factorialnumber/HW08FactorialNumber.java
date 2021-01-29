/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw08.factorialnumber;

import java.util.Scanner;

/**
 *
 * @author qwe
 */
public class HW08FactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
        int number;
        int factorial = 1;
        int stop=15;
        int i;
        
        if (factorial >=0 && factorial <=15) {
            
        }
        
        factorial=1;
        
        do{
            System.out.print("ENTER NUMBER ");
            
            Scanner input = new Scanner(System.in);
            number = input.nextInt();
            
            for (i = number; i > 0; i--) {
              factorial = factorial * i;
             
        }

        System.out.println("the factorial of the number" + number + " is "  +factorial);

        } while (number != 0);
        
        System.out.println("Good Bye");
    }
    
}