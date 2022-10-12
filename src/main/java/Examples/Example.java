package Examples;

import java.lang.reflect.Array;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class Example {
    public static void main(String[] args) {

        myMethod(7, 4, 6, -7, 100);//721
        myMethod(0, 1111, 54); //0
        myMethod(-1, 5, 7, 89);//-101

        myMethod(3.4, 2, 3, 6); //37.4
        myMethod(3.4, 5.2, 9.8, 4.6); //66.64

    }

    public static void myMethod(int a, int... numbers) {

        int sum = 0;
        for (int w : numbers) {

            sum = sum + w;
        }
        System.out.println(a * sum);
    }

     public static void myMethod(double a, int...numbers){

        double sum = 0;
        for (int w : numbers){

            sum = sum + w;
        }
         System.out.println(a*sum);
     }

     public static void myMethod(double a, double...numbers){

        double sum = 0;
        for (double w : numbers){

            sum = sum + w;

        }
         System.out.println(a*sum);
     }
}
















