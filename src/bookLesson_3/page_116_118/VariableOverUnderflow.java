package bookLesson_3.page_116_118;

public class VariableOverUnderflow {
    public static void main(String[] args) {
        double overflowDouble = Double.MAX_VALUE * 2;
        System.out.println("Double Overflow: " + overflowDouble); // overflow
        double underFlowDouble = Double.MIN_VALUE / 2;
        System.out.println("Double Under Flow: " + underFlowDouble);
    }
}
