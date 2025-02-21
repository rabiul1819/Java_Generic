package bookLesson_2.practiceQuestions;

import java.util.Scanner;

public class twoPointDistance_Q7 {
    public static void main(String[] args) {

        int x1,x2,y1,y2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of x1 = ");
        x1 = scanner.nextInt();


        System.out.print("Enter value of x2 = ");
        x2 = scanner.nextInt();

        System.out.print("Enter value of y1 = ");
        y1 = scanner.nextInt();

        System.out.print("Enter value of y2 = ");
        y2 = scanner.nextInt();

        int distance = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        double result = Math.sqrt(distance);

        System.out.println(String.format("Distance is = %.3f",result));

        scanner.close();
    }

}
