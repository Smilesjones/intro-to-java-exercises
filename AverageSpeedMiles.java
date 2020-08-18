/*
Author: Stephen Jones
Purpose: Average speed in miles per hour
Assignment: 1.10
*/
package introjavademoone;

public class AverageSpeedMiles {
    public static void main (String [] args){
        //Convert Kilo to Miles
        double kilometers = 14;
        double miles = kilometers / 1.6;
        
        //Convert time to hours
        double seconds = 30;
        double minutes = 45;
        double hours = seconds/3600 + minutes/60;
        
        //Calc miles per hour
        double mPH = miles/hours;
        
        System.out.println("MPH: " + mPH);
    }
}
