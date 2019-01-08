//Design a class to support Date objects (day, month, year). 
//Your date class should be smart (e.g. I should not be able to create a date for the 31st of February).
// In addition to get/set functions, your class should be able to return today’s Date (static function), 
//calculate the difference (in days) between two date objects, 
//and create a new date n days in the future of the current date object.
public class Date {
    int Day;
    int Month;
    int Year;
    
    public string toString() {
        return "the date is " + Day + Month + Year ;
}
