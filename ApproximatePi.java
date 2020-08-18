/*
Author: Stephen Jones
Purpose: Approximate Pi
Assignment: 1.7
*/
package introjavademoone;


public class ApproximatePi {
    public static void main (String [] args){
        
        double appPiOne = 0.0; 
        double appPiTwo = 0.0;
        double appPiThree = 0.0;
        
        boolean tab = true;
        
        for (int i = 1; i < 12; i += 2){
            if(tab){
                appPiOne += (4 * (1.0/i));
                tab = false;
            }else{
                appPiOne -= (4 * (1.0/i));
                tab = true;
            }
        }
        tab = true;
        for (int i = 1; i < 14; i += 2){
            if(tab){
                appPiTwo += (4 * (1.0/i));
                tab = false;
            }else{
                appPiTwo -= (4 * (1.0/i));
                tab = true;
            }
        }
        tab = true;
        for (int i = 1; i < 100000; i += 2){
            if(tab){
                appPiThree += (4 * (1.0/i));
                tab = false;
            }else{
                appPiThree -= (4 * (1.0/i));
                tab = true;
            }
        }
        
        System.out.println(appPiOne + "\n" + appPiTwo + "\n" + appPiThree);
        
        
    }


}
