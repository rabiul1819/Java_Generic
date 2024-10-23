package bookLesson_9.page_426.nestedTuple;

public class TupleInsideTupleMain {
    public static void main(String[] args) {

        //Create a tuple inside a tuple
        Tuple<String, Tuple<Integer,Integer>> tupleInsideTuple = new Tuple<>("Tuple value", new Tuple<>(45,89));

        //show outer tuple details
        tupleInsideTuple.showType();

        //Show inner tuple details
        tupleInsideTuple.getY().showType();
    }
}
