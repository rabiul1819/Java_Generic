package bookLesson_2.practiceQuestions;

import java.util.Scanner;

public class Calculator_Q1 {
    public static void main(String[] args) {

        double num1;
        double num2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of num1 = ");
        num1 = input.nextDouble();

        System.out.print("Enter value of num2 = ");
        num2 = input.nextDouble();

        double sum = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;


        System.out.println("Sum = " + sum + "\nSub = " + sub + "\nMul = " + mul + "\nDiv = " + div);

        input.close();

    }


}
