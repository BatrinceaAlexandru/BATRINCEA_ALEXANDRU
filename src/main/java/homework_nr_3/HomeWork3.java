package homework_nr_3;

public class HomeWork3 {

    public static void main(String[] args) {

        int dayOfWeek = 3;
        switch (dayOfWeek) {

            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("You introduced wrong month of the year");


        }
        for(int x=100; x !=1000; x++){

            if( x % 5 ==0) {
                System.out.println("Number from 100 till 1000 wich divedes to 5: " + x);

                double sum = 0.0;

                for (double a = 1; a <= 97; a += 2) {
                    sum += a / (a + 2);
                }
                System.out.println("The sum is: " + sum);


            }
        }
    }
}
