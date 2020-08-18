/*
Author: Stephen Jones
Purpose: Summation of a series
Assignment: 1.6
*/
package introjavademoone;

/**
 *
 * @author stephenjones
 */
public class SummationOfASeries {
    public static void main (String [] args){
        int summation = 0;
        
        for(int i = 1; i < 10; i++){
            summation += i;
        }
        
        System.out.println(summation);
    }
}
