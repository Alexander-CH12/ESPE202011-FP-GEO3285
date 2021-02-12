/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13.task2;

import java.util.Scanner;

/**
 *
 * @author qwe
 */
public class WS13Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        String exit = "";
        while (!exit.equalsIgnoreCase("salir")) {
            System.out.println("   ");
            System.out.println("************* MENU **********");
            System.out.println("1. Displacement Formula");
            System.out.println("2. Launch Top");
            System.out.println("3. Harmonic Movement");
            System.out.println("Exit");
            System.out.println("*****************************");
            exit = lector.nextLine();
 
            if (exit.equals("1")) {
                System.out.println(" ");
                System.out.println("Displacement Formula");
                System.out.println("Formula: x = vo*t + 1/2 a * t^2 ");
                System.out.println("Enter vo");
                double vo = lector.nextDouble();
                System.out.println("Enter t");
                double t = lector.nextDouble();
                System.out.println("Enter a");
                double a = lector.nextDouble();
                double Outcome = ((vo * t) + (a / 2) * (t * t));
                System.out.println(" ");
                System.out.println("****************** ANSWER ********************");
                System.out.println("x = " + vo + "*" + t + " + 1/2 *" + a + " * " + t + "^2");
                System.out.println("x = " + Outcome);
                System.out.println("************************************************");
 
            } else if (exit.equals("2")) {
                System.out.println("Formula Up");
                System.out.println("Formula: Vf = Vo - g*t");
                System.out.println("Enter Vo");
                double Vo = lector.nextDouble();
                System.out.println("Enter g");
                double g = lector.nextDouble();
                System.out.println("Enter t");
                double t = lector.nextDouble();
                double Outcome = (Vo - g * t);
                System.out.println(" ");
                System.out.println("****************** ANSWER ********************");
                System.out.println("Vf = " + Vo + "-" + g + "*" + t);
                System.out.println("Vf = " + Outcome);
                System.out.println("************************************************");
            } else if (exit.equals("3")) {
                System.out.println("Harmonic Formula");
                System.out.println("Formula: T = 2pi * square root of 1/g");
            }
        }
        System.out.println("End of program");
    }
 
}
