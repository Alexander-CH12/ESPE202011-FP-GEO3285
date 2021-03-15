/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21.funtions;

import java.util.Scanner;

/**
 *
 * @author qwe
 */
public class WS21Funtions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int wats;
        int hours;
        int days;
        int multiply;

        int Volts;
        int Amps;

        Scanner input = new Scanner(System.in);
        
        System.out.println("======================");
        
        System.out.println("AUTHOR: MARCO CHICAISA");
        
        System.out.println("======================");

        System.out.println("======================================================");

        System.out.println("Calculate the monthly consumption of the refrigerator");

        System.out.println("======================================================");

        System.out.println("Enter the wats");
        System.out.println("Wats -->");
        wats = input.nextInt();

        System.out.println("Enter the hours");
        System.out.println("Hours -->");
        hours = input.nextInt();

        System.out.println("Enter the days");
        System.out.println("Days -->");
        days = input.nextInt();

        System.out.println("========================================================================");

        System.out.println("The monthly consumption of the refrigerator is " + (wats * hours * days));

        System.out.println("========================================================================");

        System.out.println("=================================================");

        System.out.println("Calculate the average power of the refrigerator");

        System.out.println("=================================================");

        System.out.println("Enter the Volts");
        System.out.println("Volts -->");
        Volts = input.nextInt();

        System.out.println("Enter the Amps");
        System.out.println("Amps -->");
        Amps = input.nextInt();

        System.out.println("=========================================================================");

        System.out.println("The average power of the refrigerator is " + (Volts * Amps) + " watts ");

        System.out.println("==========================================================================");

    }

}
