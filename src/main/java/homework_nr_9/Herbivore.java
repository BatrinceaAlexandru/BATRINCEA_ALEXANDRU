package homework_nr_9;

public abstract class Herbivore {

    String animalType;
    String animalSize;
    int ageLeave;
    boolean pet;

    abstract void printSomething ();

    public void animalCharacteristics () {
        System.out.println( "This is " + this.animalType + " they a " + this.animalSize + " and leave approximately " + this.ageLeave + " years " );
    }

    public Herbivore ( String animalType, String animalSize, int ageLeave, boolean pet ) {
        this.animalType = animalType;
        this.animalSize = animalSize;
        this.ageLeave = ageLeave;
        this.pet = pet;
    }
}
