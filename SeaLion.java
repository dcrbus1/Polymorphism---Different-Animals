import java.util.ArrayList;

public class SeaLion extends Animals{
  private int flippers;

  // This constructor takes in the ArrayList legs and the varaible flippers.
  public SeaLion(ArrayList<Integer> legs, int flippers){
    super(legs);// Calls the super constructor.
   
    this.flippers = flippers; 
  }

   // Overrides the method numOfLegs
   public String numOfLegs(){
    String stringToReturn = "Sea lion: This animal has no legs but it has " + flippers + " flippers.";
    return stringToReturn;
  }  
}