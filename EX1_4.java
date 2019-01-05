//The Body-Mass Index formula is BMI = kg/m2, where kg is the weight in kilograms, and m is the height in meters. 
//Write a Java program that asks the user for their weight in pounds and their height in inches, 
//then converts those values to metric,
// and finally outputs their BMI
import java.util.Scanner;
public class BMI 
{
    public static void main ( String[] args){
    Scanner input = new Scanner(System.in);
    double weight;
    double height; 
    System.out.printf("Enter your weight in pounds: "); 
    weight = input.nextInt();  
    System.out.printf("Enter your height in inches: "); 
    height = input.nextInt(); 
    double weightKg = weight * 0.45;
    double heightM = height * 0.025;
    double finalbmi = weightKg/heightM;
    System.out.printf("Your BMI is: %f ",finalbmi); 
    }
} 
