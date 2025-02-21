package bookLesson_3.page_123_124;

public class ConcatenationDemo {
    public static void main(String[] args) {

        String greeting = "Hello " + " World";
        System.out.println(greeting);

        String name = "Rabiul";
        System.out.println("Hello, " + name);
        System.out.println("---------------------------");

        int hour = 4;
        String message = "We have been waiting here for over " + hour + " hours";
        System.out.println(message);
        System.out.println("--------------------------");

        System.out.println(5 + 3 + " Abcd");
        System.out.println(5 + 3  * 2 + " Abcd");
        System.out.println("Abcd " + 5 + 3);//use parenthesis to avoid concatanation
        System.out.println("Abcd " + 5 + 3 * 2);

        System.out.println("----------------------------");
        System.out.println("Solution upper problem");
        System.out.println("Abcd " + (5 + 3));//use parenthesis to avoid concatanation
        System.out.println("Abcd " + (5 + 3 * 2));
    }
}
