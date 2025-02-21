package bookLesson_3.page_107;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = 32 + ( celsius * 9/5);

        System.out.println("Temperature in fahrenheit: " + fahrenheit);
    }
}
