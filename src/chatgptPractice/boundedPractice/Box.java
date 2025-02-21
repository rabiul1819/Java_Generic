package chatgptPractice.boundedPractice;
// Bounded generic class Box that accepts only subclasses of Number
public class Box<T extends Number> {
    private  T value;

    public Box(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    // Method to print the value
    public void printValue(){
        System.out.println("Value: " + value);

    }
}
