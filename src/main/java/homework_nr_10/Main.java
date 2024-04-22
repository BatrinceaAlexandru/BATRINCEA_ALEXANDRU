package homework_nr_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main ( String[] args ) {


    List<Integer> numbers1 = new ArrayList<>();

        for (int i = 0; i != 20; i++ )
            numbers1.add(i);



    Predicate<Integer> testForNotEven = ( Integer i) -> (i % 2) != 0;
    Consumer<Integer> justPrint = ( Integer i) -> System.out.println(i);
    Function<Integer, Integer> multiplyByTwo = ( Integer i) -> i * 2;
    Supplier<List<Integer>> randomElementList = () -> {
        List<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i != 100; i++ )
            randomNumbers.add(i);
        return randomNumbers;
    };

        System.out.println("All numbers from the array ");
        System.out.println(numbers1);
        System.out.println("Only odd numbers ");
    testForEvenNumber2(numbers1, testForNotEven );
        System.out.println("Print all elements ");
    printElement(numbers1, justPrint);
        System.out.println("Multiplied elements by 2 " );
    multiplyByTwo(numbers1, multiplyByTwo);
    List<Integer> listRand = getRandom(randomElementList);
        System.out.println("Print random element from array ");
    randomElement(listRand,justPrint);
}


public static void testForEvenNumber2 (List<Integer> inputList, Predicate <Integer> predicate) {
    for (Integer element :
            inputList) {
        if (predicate.test(element)) System.out.println(element);
    }
}

public static void printElement (List <Integer> inputList, Consumer <Integer> consumer){
    for (Integer element :
            inputList) {
        consumer.accept(element);

    }
}

public static void multiplyByTwo (List <Integer> inputList, Function <Integer, Integer> function){
    for (Integer element :
            inputList)
        System.out.println(function.apply(element));
}

public static void randomElement (List <Integer> inputList, Consumer <Integer> supplier) {
    Random rand = new Random();
    int randomElement = inputList.get(rand.nextInt(inputList.size()));
    System.out.println(randomElement);
}

public static List<Integer> getRandom (Supplier<List<Integer>> supply){
    return supply.get();
}
}
