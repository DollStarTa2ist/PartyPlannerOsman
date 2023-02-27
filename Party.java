import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  //Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;


public class Party {


    ArrayList<Person> guests = new ArrayList<Person>(); 
  
  public void throwParty(){
   
try {
      File myObj = new File("partyguests.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
         //System.out.println(data);
        String[] arr = data.split(",");
        guests.add(new Person(Integer.parseInt(arr[0]), (arr[2] +" " + arr[1]),  Integer.parseInt(arr[3]) ));
         
        }
      myReader.close();
      } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    Person[][] table = new Person[10][10];
    boolean check = true;
    boolean placed = false;
    for(int i=0; i < guests.size(); i++){ //person loop
     check = true;
     int counter = 0;
     for(int t=0; t < 10; t++){ // table loop
       for(int p = 0; p < 10; p++){ //chair loop
         //if(table[t][p]!=null && guests.get(i).getCompany()==table[t][p].getCompany()){
          // check = false;
         //}
      
       if(check == true && table[t][table[t].length-1] == null){
         //add person to table
         for(int k = 0; k<guests.size();k++){//loop through table
           if(table[t][p] == null && counter < guests.size()){
             
             table[t][p] = guests.get(counter);
             counter += 1;
             placed = true;
           }
         }
       } 
       }
     }
      
  }//close p for loop
    for (int i = 0; i<10; i++){
      System.out.println("Table " +(i+1));
      //print loops 
      for(int j = 0; j<10; j++){
        System.out.println(table[i][j]);
      }
    }
    
    
  }

}
