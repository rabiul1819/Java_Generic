package bookLesson_9.page_423;

public class Generic<T> {   // 'T' is a type parameter, which will be replaced by an actual type when an object is created.
    private T obj;   // 'obj' is of type 'T', the actual type will be known when we create an instance of this class.

    public Generic(T obj) {   // This is the constructor that accepts an argument of type 'T'.
        this.obj = obj;
    }

    public T getObj() {   // This method returns an object of type 'T'.
        return obj;
    }

    public void showType() {   // This method prints the actual type of 'T' at runtime.
        System.out.println("Type of T: " + obj.getClass().getName());
    }
}
