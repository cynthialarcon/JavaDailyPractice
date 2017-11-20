/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhilecicle;

/**
 *
 * @author cynbarajas
 */
public class DoWhileCicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 1;
        int limit = 21;
        do {
            System.out.println("counting : " + count);
            count ++;
        }
        while (count < limit);
    }
    
}
