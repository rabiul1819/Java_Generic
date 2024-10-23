package chatgptPractice.practice1;

public class Main {
    public static void main(String[] args) {

        // // Creating a box for Integer type
        Box<Integer> integerBox = new Box<>(123);
        System.out.println("Integer value: " + integerBox.getItem());

        // Creating a box for String type
        Box<String> stringBox = new Box<>("Hello Generic");
        System.out.println("String value: " + stringBox.getItem());

        // Box with Double
        Box<Double> doubleBox = new Box<>(99.99);
        System.out.println("Double value: " + doubleBox.getItem() );

        // Box with custom type (e.g., Person class)
        Box<Person> personBox = new Box<>(new Person("John",30));
        System.out.println("Person value: " + personBox.getItem());
    }
}
