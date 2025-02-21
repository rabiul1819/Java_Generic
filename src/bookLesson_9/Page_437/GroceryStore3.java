package bookLesson_9.Page_437;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GroceryStore3 {

    // Generic method to filter items based on a condition
    public static <T> List<T> filterItems(List<T> items, Predicate<T> condition){
        List<T> result = new ArrayList<>();

        for (T item : items){
            if (condition.test(item)){
                result.add(item);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // List of fruit stocks

        List<Integer> fruitsStocks = List.of(50, 20, 75, 30, 10);


        // Filtering stocks greater than 25
        List<Integer> highStockFruits = filterItems(fruitsStocks, stock -> stock > 25);

        System.out.println("Fruits with high stock:\"");
        System.out.println(highStockFruits);

    }

}
