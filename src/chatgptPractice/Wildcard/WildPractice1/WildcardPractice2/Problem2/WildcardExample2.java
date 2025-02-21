package chatgptPractice.Wildcard.WildPractice1.WildcardPractice2.Problem2;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample2 {
    // Method using wildcard to sum numbers

    public static double calculateTotalCost(List <? extends Number> prices){
        double total = 0;
        for (Number price : prices){
            total += price.doubleValue(); // Convert to double for summation
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> electronicsPrices = new ArrayList<>();
        electronicsPrices.add(300); //Laptop
        electronicsPrices.add(200); //Mobile

        List<Double> groceriesPrices = new ArrayList<>();
        groceriesPrices.add(15.99);//Milk
        groceriesPrices.add(10.49);//Bread

        System.out.println("Total cost of Electronics: $" + calculateTotalCost(electronicsPrices));
        System.out.println("Total cost of Groceries: $" + calculateTotalCost(groceriesPrices));
    }
}

