package bookLesson_3.page_108_111;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {

        double a;
        double b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        a = input.nextDouble();

        System.out.print("Enter value of b: ");
        b = input.nextDouble();

        System.out.print("Enter value of c: ");
        c = input.nextDouble();

        double determinant = b * b - 4 * a * c;

        if (determinant > 0){
            double root1 = ( -b + Math.sqrt(determinant))/ (2 * a);
            double root2 = ( -b - Math.sqrt(determinant))/ (2 * a);

            System.out.println("The roots are " + root1 + " and " + root2);

        } else if (determinant == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is " + root);

        }
        else {
            System.out.println("The equation has no real roots.");
        }


    }
}
