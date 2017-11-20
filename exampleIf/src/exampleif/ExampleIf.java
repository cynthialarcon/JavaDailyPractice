/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleif;

/**
 *
 * @author cynbarajas
 */
public class ExampleIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 40;
        
        if (x==10){
            System.out.print("X = 10");
        } else if (x == 20){
            System.out.print("X = 20");
        } else if (x == 30){
            System.out.print("X = 30");
        } else {
            System.out.print("X is neither 10, nor 20, nor 30");
        }
    }
    
}
