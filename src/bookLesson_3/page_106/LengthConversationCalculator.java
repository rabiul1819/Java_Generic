package bookLesson_3.page_106;

import java.util.Scanner;

public class LengthConversationCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a length in inch: ");
        double inch = input.nextDouble();

        double meters = inch * .0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }
}
