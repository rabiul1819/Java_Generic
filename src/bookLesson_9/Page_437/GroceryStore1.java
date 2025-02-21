package bookLesson_9.Page_437;

import java.util.List;

public class GroceryStore1 {

    // Generic method to print a list of items
    public static <T> void printItems(List<T> items){
        for (T item : items){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        List<String> fruits = List.of("Apple","Banana","Orange");
        List<String> vegetables = List.of("Carrot","Broccoli","spinach");

        System.out.println("Fruits:");
        printItems(fruits); // Calling generic method with a list of fruits

        System.out.println("\nVegetables:");
        printItems(vegetables);//// Calling generic method with a list of vegetables
    }
}
