package homework_nr_7;

public class Programmer extends Employee {
    String programingLanguage;
    int yearsOfExperience;

    public Programmer(String name, String surname, String companyName, String programingLanguage, int yearsOfExperience) {
        super(name, surname, companyName);
        this.programingLanguage = programingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    void work() {
        System.out.println("Programmer is working");
    }
}
