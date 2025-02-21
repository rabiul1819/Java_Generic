package bookLesson_2.practiceQuestions;

import java.util.Scanner;

public class RadianToDegree_Q10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Angle of Radian: ");
        double radian = input.nextDouble();

        double degree = radian * (180/Math.PI);

        System.out.printf("%f Radian = %.3f Degree\n",radian,degree);
    }
}
