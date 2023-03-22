import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    
    // Creates an ArrayList legs to pass as argument to the instance of Animals.
    ArrayList<Integer> legs = new ArrayList<>();
    // Adds the integer 2 to the ArrayList legs.
    legs.add(2);
    
    // Overrides animals with a new Animals which is Flamingo (for the variable animals, the dynamic type is Flamingo and the static type is Animals).
    Animals animals = new Flamingo(legs);
    System.out.println(animals.numOfLegs());
    
    // Overrides animals with a new Animals which is SeaLion (for the variable animals, the dynamic type is SeaLion and the static type is Animals).
    animals = new SeaLion(legs,2);
    System.out.println(animals.numOfLegs());
  }
}