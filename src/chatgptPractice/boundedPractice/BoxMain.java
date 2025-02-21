package chatgptPractice.boundedPractice;

public class BoxMain {
    public static void main(String[] args) {

        // Creating a Box for Integer (valid, because Integer is a subclass of Number)
        Box<Integer> integerBox = new Box<>(123);
        integerBox.printValue();

        // Creating a Box for Value (valid, because double is a subclass of Number)
        Box<Double> doubleBox = new Box<>(45.67);
        doubleBox.printValue();


        // Trying to create a Box for String (invalid, because String is not a subclass of Number)
        // Box<String> strBox = new Box<>("Hello"); // This line would cause a compilation error
    }
}
