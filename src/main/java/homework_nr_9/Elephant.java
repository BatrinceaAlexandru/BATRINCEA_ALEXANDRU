package homework_nr_9;

public class Elephant implements Animal {

    String animalName;

    @Override
    public void animalEnvironment () {

    }

    @Override
    public void animalDimension () {

    }

    @Override
    public void animalType () {
        Animal.super.animalType();
    }

    public Elephant ( String animalName ) {
        this.animalName = animalName;


    }
}
