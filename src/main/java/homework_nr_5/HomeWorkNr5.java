package homework_nr_5;

public class HomeWorkNr5 {
    public static void main(String[] args) {


    int[] numbers = new int[100];


    for(int index = 0 ; index != numbers.length; index++){
        numbers[index] = 100 - index;
        System.out.println("Number for index "+ index +" is : "+ numbers[index]);
    }

    int sumEven = 0;
    int sumOdd = 0;

    for(int index = 0 ; index != numbers.length; index++){
        if(numbers[index] %2==0){
            sumEven += numbers[index];
        }
        else{
            sumOdd += numbers[index];
        }

    }
        System.out.println("The sum of even numbers is: "+ sumEven);
        System.out.println("The sum of odd numbers is: "+sumOdd);

int copyNumbers[] = new int[numbers.length];

for (int index = 0; index !=copyNumbers.length; index++){
    copyNumbers[index]=numbers[index];
    System.out.println("New array "+ copyNumbers[index]);
}

}
}