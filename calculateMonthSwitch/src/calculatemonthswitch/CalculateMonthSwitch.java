/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatemonthswitch;

/**
 *
 * @author cynbarajas
 */
public class CalculateMonthSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int month = 4;
        String season;
        
        String hi = "Hello World";
        
        switch (month){
            case 1: case 2: case 12:
                season = "Winter";
                break;
            case 3: case 4: case 5:
                season = "Spring";
                break;
            case 6: case 7: case 8:
                season = "Summer";
                break;
            case 9: case 10: case 11:
                season = "Autumn";
                break;
            default:
            season = "Incorrect month";
        }
        System.out.println ("The season of the month " + month + " is: " + season);
    }
    
}
