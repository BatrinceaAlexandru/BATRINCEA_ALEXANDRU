package homework_nr_7;

public abstract class Employee extends Person {
    String companyName;

    abstract void work();


    public Employee(String name, String surname, String companyName) {
        super(name, surname);
        this.companyName = companyName;
    }
}
