import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  //Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

public class Person {
  //System.out.print("Welcome to Party Planner.");
  //System.out.println("This party is intended to be a mixer for HR professionals to mingle and share best practices, the party will arrange attendees at 10 rount tables, each seating 10 people, with no more than one person from each company. There is a max of 100 guests from up too 16 different companies.");
  private String lastName = "";
  private String firstName = "";
  private int company;
  private int guestNumber;
  private int tableNum;
  public Person(int company, String lastName, String firstName, int guestNumber) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.company = company;
    this.guestNumber = guestNumber;
    
  }
  public void setTable(int tableNum){
    this.tableNum = tableNum;
  }
 

 
  
}