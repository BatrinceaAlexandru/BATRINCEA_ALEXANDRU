package homework_nr_7;

public class Pensioned extends Person {


    int retireDate;
    int age;

    public Pensioned(String name, String surname, int retireDate, int age) {
        super(name, surname);
        this.name = name;
        this.surname = surname;
        this.retireDate = retireDate;
        this.age = age;
    }
}
