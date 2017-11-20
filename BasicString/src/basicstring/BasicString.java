/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicstring;

/**
 *
 * @author cynbarajas
 */
public class BasicString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Cynthia";
        String surname = "Alarcon";
        
        System.out.println("Concatenacion:" + name + surname);
        System.out.println("Nueva linea: \n" + name + " " + surname);// new line
        System.out.println("Tabulador: \t" + name + " " + surname);// space
        System.out.println("Retorno de carro: \r" + name + " " + surname);// prints just name and surname
        System.out.println("Comilla simple: \'" + name + " " + surname + "\'");
        System.out.println("Comilla doble:\"" + name + " " + surname + "\"");
    }
    
}
