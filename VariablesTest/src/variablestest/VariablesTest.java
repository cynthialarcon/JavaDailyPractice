/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablestest;

/**
 *
 * @author cynbarajas
 */
public class VariablesTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bool1;
        bool1 = true;
        
        boolean bool2 = false;
        System.out.println("Value bool1: " + bool1);
        System.out.println("Value bool2: " + bool2);
        System.out.println("");
        
        byte b1= 10;
        byte b2= 0xa;
        System.out.println("Value byte1: " + b1);
        System.out.println("Value byte2: " + b2);
        System.out.println("");
        
        short s1 = 2;
        System.out.println("Value s1: " + s1);
        System.out.println("");
        
        char ch1 = 65, ch2 = 'A';
        System.out.println("Value char1: " + ch1);
        System.out.println("Value char2: " + ch2);
        System.out.println("");
        
        int decimal = 100;
        int octal = 0144; //octal starts with 0
        int hexa = 0x64;  //hexa starts with 0x
        System.out.println("Value decimal: " + decimal);
        System.out.println("Value octal: " + octal);
        System.out.println("Value hexa: " + hexa);
        System.out.println("");
        
        long long1 = 10, long2 = 20L;
        System.out.println("Value long1: " + long1);
        System.out.println("Value long2: " + long2);
        System.out.println("");
        
        float f1 = 15, f2= 22.3F;
        System.out.println("Value float1: " + f1); // result 15.0
        System.out.println("Value float2: " + f2); 
        System.out.println("");
        
        double d1= 11.0, d2 = 30.15D;
        System.out.println("Value d1: " + d1);
        System.out.println("Value d2: " + d2);
        System.out.println("");
    }
    
}
