//Write a Java program that asks the user for a number.
// Store that input into a string. If the input starts with a number, convert the string into an integer. 
//If not, tell the user that they did not input a number. Note: write your own algorithm to convert from string to int. Do not use the Java library function.
import java.util.Scanner;
public class StringOrInt 
{
     public static void main ( String[] args) {
     System.out.printf(" choose a number: "); 
     Scanner input = new Scanner(System.in); 
     int num;
    num = input.nextInt();
    //store input into a string
    String word=input.nextLine();
    //int num2 =0;
    //if the fist character of the string is a letter than convert it into an interger
    if (Character.isDigit(word.charAt(0))==true)
    {
    //convert sting to interger
    for (int i; i<num.lengh(); i++)
        {
            num = num*10 + num.charAt(i)-'0';
        }
    }
    else 
    {
    System.out.printf(" You did not input a number!  "); 
    }
}
}
