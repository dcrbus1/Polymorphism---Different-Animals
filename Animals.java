import java.util.ArrayList;

public class Animals{
  ArrayList<Integer> legs; // Declare array list legs.

  // Constructor takes in the ArrayList legs.
  public Animals(ArrayList<Integer> legs){
    this.legs = legs; // initialises variable legs.
  }

  // Returns the string with the number of legs. 
  public String numOfLegs(){
    String stringToReturn = "This animal has legs";
    for(Integer i : legs){
      stringToReturn += i+",";
    }
    return stringToReturn;
  }  
}