/*
Author: Stephen Jones
Purpose: Area and Perimeter of a Circle
Assignment: 1.8
*/
package introjavademoone;

public class AreaPerimeterCircle {
    public static void main (String [] args){
        double radius = 5.5;
        double area = radius * radius * Math.PI;
        double perimeter = 2 * radius * Math.PI;
        
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
