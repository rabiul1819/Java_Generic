package bookLesson_2.equationSolver;

import java.util.Scanner;

public class Equation_Solver_page81 {
    public static void main(String[] args) {

        double y;
        double x;
        int a;
        int b;
        int c;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of x:");
        x = input.nextDouble();

        System.out.print("Enter value of a:");
        a = input.nextInt();

        System.out.print("Enter value of b:");
        b = input.nextInt();

        System.out.print("Enter value of c:");
        c = input.nextInt();

        y = a * x * x + b * x + c ;

        System.out.println("Result of y = " + y);
    }
}
