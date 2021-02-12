/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13.task;

import java.util.Scanner;

/**
 *
 * @author qwe
 */
public class WS13Task {

    /**
     * @param args the command line arguments
     */
    static int areatrapeze(int majorBase, int minorBase, int height) {

        return ((majorBase + minorBase) / 2) * height;
    }

    static double areaCircle(int radius) {
        double PI = 3.1416;
        return PI * Math.pow(radius, 2);
    }

    static int areatriangle(int base, int height) {
        return (base * height) / 2;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println();
            System.out.println();
            System.out.println(" _______________________________________________  ");
            System.out.println("  FIGURES TO CALCULATE THE AREA  ");
            System.out.println(" _______________________________________________  ");
            System.out.println("      1. Trapeze        ");
            System.out.println("      2. Circle         ");
            System.out.println("      1. Triangle       ");
            System.out.println(" _______________________________________________  ");
            System.out.println(" Enter an option ");
            System.out.println(" _______________________________________________  ");
            opcion = teclado.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Please enter the major base");
                    int majorBase = teclado.nextInt();
                    System.out.println("Please enter the minor base");
                    int minorBase = teclado.nextInt();
                    System.out.println("Please enter height");
                    int height = teclado.nextInt();
                    System.out.println(" The area of trapeze is  :" + areatrapeze(majorBase, minorBase, height));
                    break;
                case 2:
                    System.out.println("Please enter the radius ");
                    int radius = teclado.nextInt();
                    System.out.println(" The area of circle is :" + areaCircle(radius));
                    break;

                case 3:
                    System.out.println(" Please enter the base ");
                    int base = teclado.nextInt();
                    System.out.println(" Please enter the height ");
                    height = teclado.nextInt();

                    System.out.println(" The area of triangle is :" + areatriangle(base, height));
                    break;

            }

        } while (opcion != 4);
    }

}
