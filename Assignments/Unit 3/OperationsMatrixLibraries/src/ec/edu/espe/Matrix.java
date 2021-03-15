/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe;

/**
 *
 * @author qwe
 */
public class Matrix {

    public static void sumMatrix(int[][] TableA, int[][] TableB) {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((TableA[i][j] + TableB[i][j]) < 10) {
                    System.out.print(TableA[i][j] + TableB[i][j] + "  ");
                } else {
                    System.out.print(TableA[i][j] + TableB[i][j] + " ");
                }
                if (j == 2) {
                    System.out.println("");
                }

            }
        }
    }

    public static void subtractionMatrix(int[][] TableA, int[][] TableB) {
        
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

    public static void multiplyingMatrix(int mul, int[][] TableA, int[][] TableB) {
        
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < 3; j++) {
                    mul += TableA[i][j] * TableB[j][k];
                }

                System.out.print(mul + "  ");
                mul = 0;
                //Para presentar mejor la matriz en consola
                if (k == 2) {
                    System.out.println("");
                }
            }

        }
    }
}


