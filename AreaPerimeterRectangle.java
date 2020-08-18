/*
Author: Stephen Jones
Purpose: Area and Perimeter of a Rectangle
Assignment: 1.9
*/
package introjavademoone;

public class AreaPerimeterRectangle {
    public static void main (String [] args){
        double height = 7.9;
        double width = 4.5;
        double area = width * height;
        double perimeter = (2 * width) + (2 * height);
        
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
