package bookLesson_9.page_433;

public class StatisticsBoundedType<T extends Number>{
    private T[] numbers;

    public StatisticsBoundedType(T[] numbers){
        this.numbers = numbers;
    }
    public double average(){
        double sum = 0.0;
        for (T number : numbers){
            sum += number.doubleValue(); //Error!!
        }
        return  sum / numbers.length;
    }
}
