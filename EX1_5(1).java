//Design a class to manage employees at a company. An Employee has a unique ID, a name, a hire date, their current position at the company, and who they report to.
// Give the UML for your class.
 public class Employee {
    String Name;
    String HireDate;
    String PositionAtCompany;
    String ReportTo; 
    int ID; 
    public String toString() {
        return Name+" was hired on "+HireDate  + ". He is a " + PositionAtCompany + " who reports to " + ReportTo  + " with an ID number of " + ID;
    }

  //PT -- Need some get and set functions so that code can use this object (other than toString()).
  //  -4
 }
    
