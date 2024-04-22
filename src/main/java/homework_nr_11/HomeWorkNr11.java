package homework_nr_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class HomeWorkNr11 {
    public static void main ( String[] args ) {

        List<Person> personList = getPeople();


        System.out.println( "The persons which name starts with letter A and is less than 5 characters " );
        List<Person> nameStartsWithLetterA = personList.stream()
                .filter( e -> e.name.startsWith( "A" ) )
                .limit( 5 )
                .toList();
        nameStartsWithLetterA.forEach( e -> System.out.println( e.name ) );

        System.out.println( "The persons which is male and younger than 30 years " );

        List<Person> isMaleUnder30 = personList.stream()
                .filter( e -> e.isMale )
                .filter( e -> e.age < 30 )
                .toList();
        isMaleUnder30.forEach( e -> System.out.println( e.name ) );

        System.out.println( "Firs person not male  under 30 years family starts with P " );

        Optional<Person> findFirstPersonNotMale = personList.stream()
                .filter( e -> e.age < 30 )
                .filter( e -> e.surname.startsWith( "P" ) )
                .filter( e -> !e.isMale )
                .findFirst();
        findFirstPersonNotMale.ifPresent( person -> System.out.println( person.name + " " + person.surname ) );
    }

    private static List<Person> getPeople () {
        Person p1 = new Person( "Alex", "Batrincea", 30, true );
        Person p2 = new Person( "Olga", "Timofei", 32, false );
        Person p3 = new Person( "Elena", "Cusnir", 40, false );
        Person p4 = new Person( "John", "Mereacre", 37, true );
        Person p5 = new Person( "Tom", "Ford", 29, true );
        Person p6 = new Person( "Mia", "Rusu", 21, false );
        Person p7 = new Person( "Ivan", "Cuznetov", 33, true );
        Person p8 = new Person( "Ana", "Petrov", 27, false );
        Person p9 = new Person( "Vadim", "Petrov", 25, true );
        Person p10 = new Person( "Don", "Carlione", 37, true );

        List<Person> personList = new ArrayList<>(
                Arrays.asList( p1, p2, p3, p4, p5, p6, p7, p8, p9, p10 )
        );

        return personList;
    }

}


