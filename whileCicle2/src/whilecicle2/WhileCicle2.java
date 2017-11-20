/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whilecicle2;

import java.util.Scanner;

/**
 *
 * @author cynbarajas
 */
public class WhileCicle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce a number to iterate");
        int maxElements;
        Scanner entryScanner = new Scanner (System.in); // object scanner to read data
        maxElements = entryScanner.nextInt(); //reading the value
        int count = 1; //Initialize counting 
        while (count < maxElements){
            System.out.println("Counting : " + count);
            count ++;
        }
        
    }
    
}
