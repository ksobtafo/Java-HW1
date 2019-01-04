//Write a Java program that asks the user for the radius of a circle. The program will then display the area of the circle.
// Recall that the area of the circle is calculated with the formula: Area = πr2
//Create a constant (with keyword final) variable called PI, assign it a value 3.14, and use it in your calculations.

import java.util.Scanner;
public class AreaOfCircle
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int radius;
        System.out.printf (" Enter the radius of a circle: ");
        radius =input.nextInt();
         final double PI = 3.14;
        double area = (PI * Math.pow(radius,2));
        System.out.printf (" The area of the circle is  %f", area);
    }
}
