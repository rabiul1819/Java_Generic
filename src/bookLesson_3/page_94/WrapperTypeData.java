package bookLesson_3.page_94;

public class WrapperTypeData {
    public static void main(String[] args) {
        Double Y = 5.6; //wrapper class reference type
        double y = 9.61; //primitive

        System.out.println("Wrapper Class reference data Y = " + y);
        System.out.println("Primitive  data Y = " + y);

        // Example of wrapper type data as a complement of primitive data
        Integer a;
        int b = 9;
        a = b;
        System.out.println("Display wrapper data inside of primitive data y = " + a);
    }
}
