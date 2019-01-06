public class EmployeeTest

{

void  DisplayName()
{
 System.out.printf(name);
}
void  DisplayHireDate()
{
System.out.printf(HireDate);
}
void  DisplayPositionAtCompany()
{
System.out.printf(PositionAtCompany);
}
void  DisplayReportTo()
{
System.out.printf(ReportTo);
}
void DisplayID()
{
    System.out.printf(ID);
}

}

import java.util.Scanner;
public static void main (String[] args) {
Scanner reader = new Scanner(System.in);
System.out.println("What is your name?");
name = reader.nextInt();
System.out.println("What is your Hire Date");
HireDate = reader.nextInt();
System.out.println("What is your Position at this company");
PositionAtCompany = reader.nextInt();
System.out.println("Who do you report to?");
ReportTo = reader.nextInt();
System.out.println("What is your ID?");
ID = reader.nextInt();


}
