package homework_nr_4;

import java.lang.Math.*;

import static java.awt.PageAttributes.MediaType.C0;

 public class Circle {
     public static void main(String[] args) {
         calculatedArea();
         Circle newArea = new Circle(4);
         calculatedArea();

     }
       static double radius =2;


        static void calculatedArea() {
            double surface = 2 * Math.PI * radius;
            System.out.println("Area is: " + surface);
        }

        public Circle(double radius) {
            this.radius = radius;
        }


 }


