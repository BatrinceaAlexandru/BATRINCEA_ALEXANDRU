package homework_nr_8;

import java.lang.reflect.Array;
import java.util.*;

import static java.lang.String.valueOf;

public class Main {

    public static void main ( String[] args ) {
        ArrayList<String> StringList = new ArrayList<>();
        StringList.add( "MERCEDES" );
        StringList.add( "BMW" );
        StringList.add( "PEUGEOT" );
        StringList.add( "TOYOTA" );
        StringList.add( "SEAT" );
        StringList.add( "BMW" );
        StringList.add( "DACIA" );


        System.out.println( "The list of activities for today : " + getListOfActivities() );
        System.out.println( "The list of all unique elements is :" + showUniqueArguments( StringList ) );
        Dictionary();
    }

    public static String getListOfActivities () {
        ArrayList<String> listOfActivities = new ArrayList<>();
        listOfActivities.add( "Do my homework" );
        listOfActivities.add( "Clea the house" );
        listOfActivities.add( "Read a book" );
        listOfActivities.add( "Go outside for a walk" );

        return String.valueOf( listOfActivities );
    }

    public static String showUniqueArguments ( ArrayList<String> StringList ) {
        HashSet<String> Unique = new HashSet<>();
        Unique.addAll( StringList );
        return String.valueOf( Unique );
    }

    public static void Dictionary () {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put( "mere", "apple" );
        dictionary.put( "salut", "hello" );
        dictionary.put( "bun", "good" );
        dictionary.put( "drum", "road" );
        dictionary.put( "sora", "sister" );
        dictionary.put( "minge", "ball" );
        dictionary.put( "copac", "tree" );
        dictionary.put( "pat", "bad" );
        dictionary.put( "fulger", "lightning" );
        dictionary.put( "soare", "Sun" );
        System.out.println( dictionary );
        System.out.println( "Translation from RO into EN is :" + dictionary.get( "minge" ) );

    }

}
