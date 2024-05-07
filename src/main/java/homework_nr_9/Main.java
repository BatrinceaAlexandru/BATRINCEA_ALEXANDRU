package homework_nr_9;

public class Main {
    public static void main ( String[] args ) {
        Elephant elephant1 = new Elephant( "Bob" );

        elephant1.animalType();
        elephant1.animalEnvironment();
        elephant1.animalDimension();
        int legs = Animal.legs;

        System.out.println( "This animal has " + legs + " legs" );


        BigAnimals elephant = new BigAnimals( "Elephant", "Male", 50, false, "Swim", "Black" );

        elephant.animalCharacteristics();
        elephant.printSomething();
    }
}
