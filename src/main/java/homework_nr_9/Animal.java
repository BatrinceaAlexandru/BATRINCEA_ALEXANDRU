package homework_nr_9;

public interface Animal {

    boolean DOMESTIC = true;
    int legs = 4;
    String Environment = "South Africa";

    void animalEnvironment ();

    void animalDimension ();

    default void animalType () {
        System.out.println( "This is an animal from Africa " );
    }

    ;

    static void categoryAnimal () {
        System.out.println( "This animal is mammal  " );
    }
}
