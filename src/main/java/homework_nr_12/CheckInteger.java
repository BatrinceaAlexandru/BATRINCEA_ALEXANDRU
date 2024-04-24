package homework_nr_12;

import java.util.function.Predicate;

public enum CheckInteger {

    CHECK_IF_ODD( ( x ) -> (Integer) (x % 2) != 0 ),
    CHECK_IF_EVEN( ( x ) -> (Integer) (x % 2) == 0 ),
    CHECK_IF_POSITIVE( ( x ) -> (Integer) (x) > 0 ),
    CHECK_IF_NEGATIVE( ( x ) -> (Integer) (x) < 0 );

    private final Predicate<Integer> check;


    CheckInteger ( Predicate<Integer> check ) {
        this.check = check;
    }

    public Predicate<Integer> getCheck () {
        return check;
    }
}
