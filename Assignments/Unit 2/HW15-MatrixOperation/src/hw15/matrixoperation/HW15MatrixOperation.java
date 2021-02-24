/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15.matrixoperation;

import java.util.Scanner;

/**
 *
 * @author qwe
 */
public class HW15MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int TableA[][] = new int[3][3];
        int TableB[][] = new int[3][3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers in Matrix A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Row " + (i + 1) + " Column " + (j + 1) + " = ");
                TableA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("------------------------------------------");

        System.out.println("Enter the numbers in Matrix B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Row " + (i + 1) + " Column " + (j + 1) + " = ");
                TableB[i][j] = scanner.nextInt();
            }
        }

        System.out.println("These are the matrices entered:");

        System.out.println("");
        System.out.println("MATRIX A");
        System.out.println("-----------");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(TableA[i][j] + " ");

                if (j == 2) {
                    System.out.println("");
                }

            }
        }
        System.out.println("MATRIX B");
        System.out.println("-----------");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(TableB[i][j] + " ");

                if (j == 2) {
                    System.out.println("");
                }

            }
        }

        System.out.println("the subtraction matrix is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((TableA[i][j] - TableB[i][j]) < 10) {
                    System.out.print(TableA[i][j] - TableB[i][j] + "  ");
                } else {
                    System.out.print(TableA[i][j] - TableB[i][j] + " ");
                }
                if (j == 2) {
                    System.out.println("");
                }

            }
        }
    }

}
