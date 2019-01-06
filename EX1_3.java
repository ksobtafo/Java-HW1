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
    
    string word = ""; 
    int num2 =0;
    while (num>0)
    {
        int digit = num % 10;
        if (digit==0)
        {
            word += "0";
        }
        else if (digit ==1)
        {
            word += "1";
        }
        else if (digit ==2)
        {
            word += "2";
        }
        else if (digit ==3)
        {
            word += "3";
        }
        else if (digit ==4)
        {
            word += "4";
        }
        else if (digit ==5)
        {
            word += "5";
        }
        else if (digit ==6)
        {
            word += "6";
        }
        else if (digit ==7)
        {
            word += "7";
        }
        else if (digit ==8)
        {
            word += "8";
        }
        else if (digit ==9)
        {
            word += "9";
        }
    }
    //if the fist character of the string is a letter than convert it into an interger
    if (Character.isDigit(word.charAt(0))==true)
    {
    //convert sting to interger
    for (int i; i<num2.lengh(); i++)
        {
            num2 = num2*10 + num2.charAt(i)-'0';
        }
    }
    else 
    {
    System.out.printf(" You did not input a number!  "); 
    }
}
