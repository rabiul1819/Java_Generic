package bookLesson_9.page_426;

public class TupleMain {
    public static void main(String[] args) {

        Tuple<String,String> tuple = new Tuple<>("Rabiul" ," Islam");
        tuple.ShowTypes();

        Tuple<String,Integer> person = new Tuple<>("Reham",3);
        person.ShowTypes();
    }
}
