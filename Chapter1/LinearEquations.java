/*
Author: Stephen Jones
Purpose: Solve 2 X 2 linear equation
Assignment: 1.13
*/
package introjavademoone;


public class LinearEquations {
    public static void main (String [] args){
        //variables
        double valueArray [] = {3.4, 50.2, 2.1, .55, 44.5, 5.9};
        //                       a     b    c     d    e    f
        //                       0     1     2    3    4    5
            
        //Cramer's equations
        double x = ((44.5 * .55)-(50.2 * 5.9))/((3.4 * .55)-(50.2 * 2.1));
        double y = ((valueArray[0] * valueArray[5])-(valueArray[4] * valueArray[2]))/
            ((valueArray[0] * valueArray[3])-(valueArray[1] * valueArray[2]));
    
        System.out.println("x = " + x + "\ny = " + y);
}    
}
