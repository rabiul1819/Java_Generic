package bookLesson_9.page_426;

public class Tuple <X , Y>{
    private final X x;
    private final Y y;

    public Tuple(X x , Y y){
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }

    public void ShowTypes(){
        System.out.println("Type of X is : " + x.getClass().getName() + " and value: " + x);
        System.out.println("Type of Y is : " + y.getClass().getName() + " and value: " + y);
    }
}
