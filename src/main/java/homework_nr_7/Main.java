package homework_nr_7;

public class Main {

    public static void main(String[] args) {

        Pensioned newPensioned = new Pensioned("Alexei", "Covaleov", 15, 65);
        Manager newManager1 = new Manager("Oleg", "Vasiliev", "IBM", 5, "Management");
        Programmer newProgramer = new Programmer("Aliona", "Babin", "ITC", "Java", 5);
        Manager newManager2 = new Manager("Alisa", "Bogata", "IBM", 5, "Management");

        newManager1.work();
        newManager2.work();
        newProgramer.work();

        System.out.println("---------------------------------------");

        Person[] personArray = new Person[]{
                newManager1, newProgramer, newPensioned, newManager2
        };

        for (int index = 0; index != personArray.length; index++) {
            if (personArray[index] instanceof Manager tempObject) {
                System.out.println("These persons are managers:" + tempObject.name + " " + tempObject.surname);
                newManager1.work();

            }


        }
    }
}
