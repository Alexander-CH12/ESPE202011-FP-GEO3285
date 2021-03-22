/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearching;

import java.util.Arrays;

/**
 *
 * @author qwe
 */
public class BinarySearching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ages[]={105, 65, 90, 100, 40, 12};
        int position, search=100;
 
        position=Arrays.binarySearch(ages, search);
        System.out.println("Unordered array. Found in the index: "+position);
 
        Arrays.sort(ages);

        position=Arrays.binarySearch(ages, search);
        System.out.println("Ordered array. Found in the index: "+position);
    }
}
