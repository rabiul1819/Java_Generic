package bookLesson_3.page_136;

public class SwapWithout3rdVariableAndOperator {
    public static void main(String[] args) {

        int x = 20;
        int y = 22;

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("X = " + x);
        System.out.println("Y = " + y);

       
    }
}
