package bookLesson_9.page_426;

public class TupleMain {
    public static void main(String[] args) {

        Tuple<String,String> fullName = new Tuple<>("Rabiul" ," Islam");
        fullName.ShowTypes();

        Tuple<String,Integer> nameAge = new Tuple<>("Reham",3);
        nameAge.ShowTypes();
    }
}
