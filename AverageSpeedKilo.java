/*
Author: Stephen Jones
Purpose: Average speed in kilos per hour
Assignment: 1.12
*/
package introjavademoone;


public class AverageSpeedKilo {
    public static void main(String[] args){
        //Known variables
        double seconds = 35.0;
        double minutes = 40.0;
        double hours = 1.0;
        double miles = 24.0;

        //Convert miles to kilo
        double kilo = miles * 1.6;
        
        //convert time to hours
        double secondHours = seconds/3600;
        System.out.println(secondHours);
        double minuteHours = minutes/60;
                System.out.println(minuteHours);

        double hourHours = hours + minuteHours + secondHours;
                System.out.println(hourHours);

        
        //Calc kph
        
        double kPH = kilo/hourHours;
        System.out.println("KPH: " + kPH);
    }
}
