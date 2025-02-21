package bookLesson_3.page_128;

import java.util.Scanner;

public class EqualityExercise2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter a number: ");
        int b = input.nextInt();

        boolean isAEqualToB = a == b;
        System.out.println("isAEqualToB = " + isAEqualToB);

        boolean isANotEqualToB = a != b;
        System.out.println("isANotEqualToB = " + isANotEqualToB);

        boolean isAGreaterThanOrEqualToB = a >= b;
        System.out.println("isAGreaterThanOrEqualToB = " + isAGreaterThanOrEqualToB);

        boolean isALessThanOrEqualToB = a <= b;
        System.out.println("isALessThanOrEqualToB = " + isALessThanOrEqualToB);

    }
}
