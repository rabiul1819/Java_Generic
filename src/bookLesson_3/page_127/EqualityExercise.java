package bookLesson_3.page_127;

import java.util.Scanner;

public class EqualityExercise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number1: ");
        double a = input.nextDouble();

        System.out.print("Enter number2: ");
        double b = input.nextDouble();

        boolean isAGreaterThanB = a > b;
        if (isAGreaterThanB){
            System.out.println(a + " is greater than " + b);
        }
        else {
            System.out.println( b + " is greater than " + a);
        }
    }
}
