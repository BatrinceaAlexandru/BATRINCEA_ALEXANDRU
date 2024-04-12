package homework_nr_6;

import java.util.OptionalInt;

public class Date {

private int day ;
private int month;
private int year;

String error ="Error";

private String errorDate = "Error";


    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }


        public void setDay ( int day) {
if (day > 0 && day <=31){
    this.day = day;
}
else{
this.day =999;

            }
}
public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        }
        else {
            this.month =999;
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate (){
        System.out.println("The date is :" + day + "/" + month + "/" + year );

    }
}
