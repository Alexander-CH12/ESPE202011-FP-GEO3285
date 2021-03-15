/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author qwe
 */
public class BasicOperation {
    
    // addition, substraction, division, multiplication
    public static float addTwoNumbers(float addend1, float addend2){
        float sum = 0;
        sum = addend1 + addend2;
        return sum;
    }
    
    public static float subtracTwoNumbers(float minuend, float substract){
        float subtractor = 0;
        subtractor = minuend + substract;
        return subtractor;
    }
    
    public static float multiplyTwoNumbers(float multiplying, float multiplier){
        float multiplication = 0;
        multiplication = multiplying * multiplier;
        return multiplication;
    }
    
    public static float divideTwoNumbers(float dividing, float dividier){
        float division = 0;
       division = dividing / dividier;
        return division;
    }
}
