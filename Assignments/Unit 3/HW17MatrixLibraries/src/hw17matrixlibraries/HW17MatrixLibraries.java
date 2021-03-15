/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw17matrixlibraries;

import ec.edu.espe.Matrix;
import java.util.Scanner;

/**
 *
 * @author qwe
 */
public class HW17MatrixLibraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int TableA[][] = new int[3][3];
        int TableB[][] = new int[3][3];
        int mul = 0;

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

        System.out.println("the sum matrix is: ");
        Matrix.sumMatrix(TableA, TableB);

        System.out.println("the subtraction matrix is: ");
        Matrix.subtractionMatrix(TableA, TableB);
        
        System.out.println("the matrix resulting from multiplying both matrices is: ");
        Matrix.multiplyingMatrix(mul, TableA, TableB);

    }

}
