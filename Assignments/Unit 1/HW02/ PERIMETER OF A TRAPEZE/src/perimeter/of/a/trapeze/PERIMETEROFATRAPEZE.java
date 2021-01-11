/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimeter.of.a.trapeze;

/**
 *
 * @author qwe
 */
public class PERIMETEROFATRAPEZE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float perimeter;
        float side1;
        float side2;
        float side3;
        float side4;
        
        side1 = 46.19f;
        side2 = 27.14f;
        side3 = 91.63f;
        side4 = 10.51f;
        
        // operation
        perimeter = side1 + side2 + side3 + side4;
        
        System.out.println("The perimeter of a trapeze is " + side1 + "+" + side2 + "+" + side3 + "+" + side4 + " is equal to --> " +  perimeter);
    }
    
}
