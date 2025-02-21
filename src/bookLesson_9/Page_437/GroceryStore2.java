package bookLesson_9.Page_437;

public class GroceryStore2 {

    //Generic method to find maximum item
    public static <T extends Comparable<T>> T findMax(T[] items) {
        T max = items[0];
        for (T item : items) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] fruitsStocks = {50, 20, 75, 30};
        Double[] vegetableWeights = {10.5, 25.2,5.1};

        System.out.println("Maximum fruits stock: " + findMax(fruitsStocks));
        System.out.println("Maximum vegetable weight: " + findMax(vegetableWeights));
    }

}