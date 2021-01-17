/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04menus;

import java.util.Scanner;
import static javax.swing.Spring.height;

/**
 *
 * @author qwe
 */
public class HW04Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculate the Areas =======");
            System.out.println("1. -> Rectangle");
            System.out.println("2. -> Triangle");
            System.out.println("3. -> Square");
            System.out.println("4. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int length3;
                    int width;
                    int area3;
                    System.out.println("enter length--");
                    length3 = input.nextInt();
                    System.out.println("enter width--");
                    width = input.nextInt();
                    area3 = (length3*width);
                    System.out.println("The area of rectangle is-->" + area3 );
                    break;
                case 2:
                    int heigth;
                    int base;
                    int area4;
                    System.out.println("enter base -> ");
                    base = input.nextInt();
                    System.out.println("enter height -> ");
                    height = input.nextInt();
                    area4= base + height;
                    System.out.println(" the sum is --> " + area4 );
                    break;
                case 3:
                    int area;
                    int side1;
                    int side2;
                    int side3;
                    int side4;
                    System.out.println("enter side1 ->  ");
                    side1 = input.nextInt();
                    System.out.println("enter side2 ->  ");
                    side2 = input.nextInt();
                    System.out.println("enter side3 ->  ");
                    side3 = input.nextInt();
                    System.out.println("enter side4 ->  ");
                    side4 = input.nextInt();
                    area= side1 + side2 + side3 + side4;
                    System.out.println(" the sum is --> " + area );
                    break;
                case 4:
                    System.out.println("Bye Bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

}
