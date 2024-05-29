package homework_nr_13;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main ( String[] args ) throws InvalidAirPLaneException, InvalidRangeException {
        List<Airplane> airplane = new ArrayList<>() {
        };
        createAirplaneLBYL( airplane, "Boieng", "777", 2 );
        createAirplaneLBYL( airplane, "", "771", 2 );
        createAirplaneLBYL( airplane, "AirBus", null, 2 );
        createAirplaneEAFP( airplane, "Bombardier", "430", 2 );
        createAirplaneEAFP( airplane, "", "340", 2 );
        createAirplaneEAFP( airplane, "AirBus", "555", 3 );

        countDivisibleBy7Numbers( 50,20 );
        countDivisibleBy7Numbers( 35,80 );


    }

    public static void createAirplaneEAFP ( List<Airplane> inputAirplane, String manufacturer, String model, int nrOfEngines ) {

        try {
            inputAirplane.add( new Airplane( manufacturer, model, nrOfEngines ) );

            System.out.println( "Create a new airplane  with exception EAFP" + inputAirplane );
        } catch (InvalidAirPLaneException e) {
            System.out.println( "Failed to create a new airplane" );
            ;
        }
    }

    public static void createAirplaneLBYL ( List<Airplane> inputAirplane, String manufacturer, String model, int nrOfEngines ) throws InvalidAirPLaneException {
        if (manufacturer == "" || manufacturer == null) {
            System.out.println( "Failed to create a new airplane" );
            return;
        }
        if (model == "" || model == null) {
            System.out.println( "Failed to create a new airplane" );
            return;
        }
        if (nrOfEngines % 3 == 0) {
            System.out.println( "Failed to create a new airplane" );
        }

        inputAirplane.add( new Airplane( manufacturer, model, nrOfEngines ) );
        System.out.println( "Create a new airplane with exception LBYL" + inputAirplane);

    }

    public static void countDivisibleBy7Numbers ( int inferiorLimit, int superiorLimit ) throws InvalidRangeException {

        List<Integer> correctNumbers = new ArrayList<>();
        if (inferiorLimit > superiorLimit)
            throw new InvalidRangeException("Invalid range!");
        for (int i = inferiorLimit; i <= superiorLimit; i++) {
            if (i % 7 == 0)
                correctNumbers.add(i);
            }
        }
    }









