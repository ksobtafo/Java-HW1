//Write a Java program that asks the user for a number between 10 and 100, then outputs that many numbers and whether they are even or odd

import java.util.Scanner; //need this to prompt the user to output number
public class OddEven 
{
    public static void main ( String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    System.out.printf(" write a number between 10 and 100: \n"); 
    num = input.nextInt();  // let user output number

    if (num >=10 && num<=100)
    {
        for(int i =0; i<= num; i++)
        {
            double random = Math.random() * 49 + 1; //generates random numbers from 1-50
            System.out.printf("%f is a randomly generated number \n", random);
            if ( random%2==0 )
            {
                System.out.printf("and %f is even \n",random);
            }
        }
    }
    else 
         {
        //PT -- better to loop here, and give the user another try, rather than quit the program.
        System.out.printf("this number is not between 10 and 100 /n");
         }
    }
}
