import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  //Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Person> guests = new ArrayList<Person>();
try {
      File myObj = new File("partyguests.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
         System.out.println(data);
        String[] arr = data.split(",");
        guests.add(new Person(Integer.parseInt(arr[0]), arr[1], arr[2],Integer.parseInt(arr[3])));
         
        }
      myReader.close();
      } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  
  //Pointer -> 1
  //Everyfrom from company 1
  // 1-5
  //place
  //pointer++
  //place



  
}