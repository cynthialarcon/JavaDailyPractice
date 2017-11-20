/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatemonth;

/**
 *
 * @author cynbarajas
 */
public class CalculateMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int month = 6;
        String season;
        
        if (month ==1 || month == 2 || month ==12){
            season = "winter";
        } else if (month ==3 || month== 4 || month ==5){
            season = "spring";
        } else if (month ==6 || month== 7 || month ==8){
            season = "summer";
        } else if (month ==9 || month== 10 || month ==11){
            season = "autumn";
        } else {
            season = "Incorrect number";
        }
        System.out.println("The season for the month " + month + " is: " + season);
    }
    
}
