package homework_nr_16;

public class Person {
    private String name;
    private Integer age;
    private Double note;

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public Integer getAge () {
        return age;
    }

    public void setAge ( Integer age ) {
        this.age = age;
    }

    public Double getNote () {
        return note;
    }

    public void setNote ( Double note ) {
        this.note = note;
    }

    public Person ( String name, Integer age, Double note ) {
        this.name = name;
        this.age = age;
        this.note = note;
    }

    @Override
    public String toString () {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", note=" + note +
                '}';
    }
}





