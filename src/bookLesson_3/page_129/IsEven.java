package bookLesson_3.page_129;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        boolean isEven = a % 2 == 0;
        System.out.println("isEven: " + isEven);

        System.out.println("-------------------------------");
        System.out.println("Invert or Negation");

        boolean isTrue = true;
        boolean isFalse =! isTrue;

        System.out.println("isTrue: " + isTrue);
        System.out.println("isFalse: " + isFalse);

        System.out.println("-------------------------------");
        System.out.println("Expression Invert or Negation: ");

        int age = 15;
        boolean isOlderThan18 =! (age > 18);
        System.out.println("isOlderThan18: " + isOlderThan18);

    }
}
