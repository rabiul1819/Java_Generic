package chatgptPractice.practice1;

public class Box <T>{
    private T item;

    //constructor
    public Box(T item){
        this.item = item;
    }
    //Getter method
    public T getItem(){
        return item;
    }

    //setter method


    public void setItem(T item) {
        this.item = item;
    }
}
