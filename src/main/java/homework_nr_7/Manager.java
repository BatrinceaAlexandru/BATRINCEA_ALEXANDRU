package homework_nr_7;

public class Manager extends Employee {
    int teamSize;
    String teamName;

    @Override
    void work() {

        System.out.println("Manager is working");

    }

    public Manager(String name, String surname, String companyName, int teamSize, String teamName) {
        super(name, surname, companyName);
        this.teamSize = teamSize;
        this.teamName = teamName;
    }
}
