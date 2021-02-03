/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10.functions;

import java.util.Scanner;

/**
 *
 * @author qwe
 */
public class HW10Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("=================================================");
        System.out.println("=                WELCOME USER                   =");
        System.out.println("=================================================");
        
        Scanner input = new Scanner(System.in);
        
        int dividend;
        int divisor;
        float quotient;
        int Digit1 = 0;
        int Digit2 = 0;
        int top = 12;
        int product = 0;
        int table = 0;

        //call to divideTwoNumbers() function
        System.out.println("Enter the number of dividend-->");
        dividend = input.nextInt();
        
        System.out.println("Enter the number of divisor-->");
        divisor = input.nextInt();
        
        quotient = divideTwoNumbers(dividend, divisor);

        System.out.println(" Quotient of " + dividend + " and " + divisor + " is -> " + quotient); //0.5 or ?

        System.out.println("=================================================");
        
        System.out.println("Enter the number to raise -->");
        Digit1 = input.nextInt();
        
        Digit2 = f(Digit1);
        System.out.println("Digit2 value: " + Digit1 + " ^2-->" + Digit2);

        System.out.println("enter the number to raise -->");
        Digit1 = input.nextInt();
        
        Digit2 = f(Digit1);
        System.out.println("Digit2 value: " + Digit1 + " ^2-->" + Digit2);
        
        System.out.println("=================================================");

        System.out.println("Enter the number of Digit1 -->");
        Digit1 = input.nextInt();
        
        Digit2 = f(Digit1);
        System.out.println("The square of " + Digit1 + " is equal to -> " + Digit2);

        System.out.println("=================================================");
        
        System.out.println("Enter the number of Digit1 -->");
        Digit1 = input.nextInt();
        
        Digit2 = g(Digit1);
        System.out.println("Digit2 value: Digit2 = " + Digit1 + " * " + Digit1 + " + 2 * " + Digit1 + " + 1--> Digit2 = " + Digit2);

        System.out.println("=================================================");
        
        System.out.println("Enter the number of table-->");
        table = input.nextInt();
        
        for (int a = 1; a <= top; a++) {
            product = table * a;
            
            System.out.println(+ table + " * " + a + " = " + product);
        }
        System.out.println("=================================================");
        System.out.println("=               See you soon user               =");
        System.out.println("=================================================");
    }

    //function definition
    //return data type    name     parameter1   parameter2
    public static float divideTwoNumbers(int dividend, int divisor) {
        //body of the function
        float quotient = 0.0F;

        //             5        10   -> 0.5
        // float     int        int
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int f(int Digit1) {

        int Digit2 = 0;
        Digit2 = Digit1 * Digit1;

        return Digit2;
    }

    public static int g(int Digit1) {

        int Digit2 = 0;
        Digit2 = Digit1 * Digit1 + 2 * Digit1 + 1;

        return Digit2;
    }

    public static int tablemulriplication() {
        System.out.println("=================================================");
        
        System.out.println("The multiplication tables: ");

        int top = 0;
        int product = 0;
        int table = 0;

        for (int a = 1; a <= top; a++) {
            product = table * a;
            System.out.println(+ table + " * " + a + " = " + product);

        }
        return +product;
    }
}
