//Design a class to support Date objects (day, month, year). 
//Your date class should be smart (e.g. I should not be able to create a date for the 31st of February).
// In addition to get/set functions, your class should be able to return today’s Date (static function), 
//calculate the difference (in days) between two date objects, 
//and create a new date n days in the future of the current date object.
import java.util.*;
public class DateTest {
    public static void main(String[] args) {
   

        public void setDay(int day)
        {
            Day = day;
        }
        public int GetDay()
        {
            while (Month <=12)
            {
                if(Month=1 & Day<=31)
                {
                  Return Day;  
                }
                if(Month=3 &Day<=31)
                {
                  Return Day;  
                }
                if(Month=5 &Day<=31)
                {
                  Return Day;  
                }
                if(Month=7 &Day<=31)
                {
                  Return Day;  
                }
                if(Month=8 &Day<=31)
                {
                  Return Day;  
                }
                if(Month=12 &Day<=31)
                {
                  Return Day;  
                }  
                if(Month= & Day<=28)
                {
                  Return Day;  
                }   
                if(Month=4 &Day<=30)
                {
                  Return Day;  
                }     
                if(Month=6 &Day<=30)
                {
                  Return Day;  
                }    
                 if(Month=9 &Day<=30)
                {
                  Return Day;  
                }
                if(Month=11 &Day<=30)
                {
                  Return Day;  
                }
            }            
        }
        public void SetMonth (int month) 
        {
            Month = month;
        }
        public int GetMonth()
        {
            return Month;
        }
        public void SetYear(int year)
        {
            Year = year;
        }
        public int GetYear()
        {
            return Year;
        }
        public void GetTheDate()
        {
    theDate today = Calendar.getInstance().getTime();
    System.out.println(today);
       }

       public int GetDifferenceBetweenDates()
       {
//the different between the days....
       }
     Date date1 = new Date();
     date1.Day = 15;
     date1.Month =06;
     date1.Year=2016

     System.out.println(date1.toString());
    }
}
