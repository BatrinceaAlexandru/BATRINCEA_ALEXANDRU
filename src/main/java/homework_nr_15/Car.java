package homework_nr_15;



import java.util.Comparator;


public class Car implements Comparable<Car> {

   private String name;
   private Integer yearMade;

    public Car ( String name, Integer yearMade ) {
        this.name = name;
        this.yearMade = yearMade;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public Integer getYearMade () {
        return yearMade;
    }

    public void setYearMade ( Integer yearMade ) {
        this.yearMade = yearMade;
    }

    @Override
    public int compareTo ( Car o ) {
        return Comparator.comparing( ( Car c ) -> c.name )
                .thenComparing( ( Car c ) -> c.yearMade )
                .compare( this, o );
    }

    @Override
    public String toString () {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearMade=" + yearMade +
                '}';
    }
}
