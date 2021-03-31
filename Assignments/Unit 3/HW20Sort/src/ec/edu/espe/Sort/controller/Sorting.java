/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Sort.controller;

/**
 *
 * @author qwe
 */
public class Sorting {

    public String[] sortByBubbleSort(String[] constellations) {
        int n = constellations.length;

        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int (constellations[j] > constellations[j + 1]) {
                    //swap
                    temp = constellations[j];
                    constellations[j] = constellations[j + 1];
                    constellations[j + 1] = temp;
                }
                System.out.print("sorting --> ");

            }
            System.out.println("");
        }
        return constellations;
    }

    public String[] SortByBubbleSort(String[] constellations) {
        //CODE TO SORT

        return constellations;
    }

}
