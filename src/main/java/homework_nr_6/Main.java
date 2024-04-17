package homework_nr_6;

public class Main {

    public static void main(String[] args) {
Employee datesOfEmploee = new Employee("Olga",35,"Financial");
        System.out.println("Employee details :" + datesOfEmploee.getName()+" " + datesOfEmploee.getAge()+ " " + datesOfEmploee.getDepartment());
datesOfEmploee.setName("Alexandru");
datesOfEmploee.setAge(39);
datesOfEmploee.setDepartment("Acountant");
        System.out.println("Employee details :" + datesOfEmploee.getName() + "  "+ datesOfEmploee.getDepartment() + "  " + datesOfEmploee.getAge());


       Invoice Invoice = new Invoice("Bosh","Wash Machine",1,500);
       Invoice.getAmount();

       Date dataClass = new Date();
       dataClass.setDay(32);
       dataClass.setMonth(12);
       dataClass.setYear(1984);
       dataClass.displayDate();


    }
}
