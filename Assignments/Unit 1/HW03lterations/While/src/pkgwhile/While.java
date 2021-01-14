/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;

/**
 *
 * @author qwe
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        i = 0;
        
        System.out.println("====This is a while loop from 1 to 14 ====");
        
        while (i < 14) {
            System.out.println("i -->" + ( i + 1));
            //i += 1;
            i++;
            //i=i+1;    
        }
    }
}
