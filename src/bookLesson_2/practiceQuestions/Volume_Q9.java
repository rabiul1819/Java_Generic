package bookLesson_2.practiceQuestions;

import java.util.Scanner;

public class Volume_Q9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double length = input.nextDouble();

        System.out.print("Enter Width: ");
        double width = input.nextDouble();

        System.out.print("Enter Height: ");
        double height = input.nextDouble();

        double volume = length * width * height;

        System.out.printf("Volume = %.3f\n", volume);


        input.close();
    }
}
