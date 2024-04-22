package homework_nr_9;

public class BigAnimals extends Herbivore {

    String swim;
    String color;

    @Override
    void printSomething () {
        System.out.println( "Beautiful animal " );
    }

    public BigAnimals ( String animalType, String animalSize, int ageLeave, boolean pet, String swim, String color ) {
        super( animalType, animalSize, ageLeave, pet );
        this.swim = swim;
        this.color = color;
    }
}
