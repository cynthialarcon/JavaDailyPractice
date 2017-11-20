/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author cynbarajas
 */
public class person {
    
    //attributes of the class
    String name;
    String middleName;
    String lastName;
    
    //Methods of the class
    public void showName(){
        System.out.println ("Name: " + name);
        System.out.println ("Middle name : " + middleName);
        System.out.println ("Last name: " + lastName);
    }
}
