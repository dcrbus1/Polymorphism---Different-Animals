import java.util.ArrayList;

public class Flamingo extends Animals{

  // This constructor takes in the ArrayList legs.
  public Flamingo(ArrayList<Integer> legs){
    super(legs); // Calls the super constructor. 
  }

  // Overrides the method numOfLegs.
  public String numOfLegs(){
    String stringToReturn = "Flamingo: This animal has " + legs + " legs";
    return stringToReturn;
  }    
}