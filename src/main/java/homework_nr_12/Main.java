package homework_nr_12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main ( String[] args ) {

        Months[] monthsOfTheYear = Months.values();

        for (Months month : monthsOfTheYear) {

            System.out.println( "List of months of the year are:" + month );
        }
        FuelTypes check1 = FuelTypes.DIESEL_55;
        FuelTypes check2 = FuelTypes.ELECTRIC;
        FuelTypes check3 = FuelTypes.PETROL_95;
        FuelTypes check4 = FuelTypes.PETROL_100;

        System.out.println( "Fuel " + check1.name() + " is liquid:" + check1.isLiquidfuel() );
        System.out.println( "Fuel " + check2.name() + " is liquid:" + check2.isLiquidfuel() );
        System.out.println( "Fuel " + check3.name() + " is liquid:" + check3.isLiquidfuel() );
        System.out.println( "Fuel " + check4.name() + " is liquid:" + check4.isLiquidfuel() );

        int x = 10;
        checkNumberPrintResult( x, CheckInteger.CHECK_IF_ODD );
        checkNumberPrintResult( x, CheckInteger.CHECK_IF_EVEN );
        checkNumberPrintResult( x, CheckInteger.CHECK_IF_POSITIVE );
        checkNumberPrintResult( x, CheckInteger.CHECK_IF_NEGATIVE );


    }

    public static void checkNumberPrintResult ( int x, CheckInteger check ) {
        System.out.println( "The result of testing number for " + check + " is: " + check.getCheck().test( x ) );
    }
}

