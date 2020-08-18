/*
Author: Stephen Jones
Purpose: Population Projection
Assignment: 1.11
*/
package introjavademoone;


public class PopulationProjection {
    public static void main (String [] args){
        double currentPop = 312032486;
        
        //Calc number of births per year
        double secondBirth = (1.0 / 7);
        double minuteBirth = secondBirth * 60;
        double hourBirth = minuteBirth * 60;
        double dayBirth = hourBirth * 24;
        double yearBirth = dayBirth * 365;
        System.out.println(yearBirth);
        //Calc number of deaths per year
        double yearDeath = (1.0 / 13) * 60 * 60 * 24 * 365;
        //Calc number of immigrants per year
        double secondsInYear = 60 * 60 * 24 * 365;
        double yearImmigrant = (1.0 / 45) * secondsInYear;
        
        //Compute population each year
        int popChange = (int)yearBirth - (int)yearDeath + (int)yearImmigrant;
        
        int yearOne = (int)currentPop + popChange;
        System.out.println("Year One Pop: " + yearOne);
        
        int yearTwo = yearOne + popChange;
        System.out.println("Year Two Pop: " + yearTwo);
        
        int yearThree = yearTwo + popChange;
        System.out.println("Year Three Pop: " + yearThree);
        
        int yearFour = yearThree + popChange;
        System.out.println("Year Four Pop: " + yearFour);
        
        int yearFive = yearFour + popChange;
        System.out.println("Year Five Pop: " + yearFive);
        
    }
}
