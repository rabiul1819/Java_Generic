package chatgptPractice.Wildcard.WildPractice1;

public class ScienceBook extends Book {

    private String field;

    public ScienceBook(String title,String field){
        super(title);
        this.field = field;
    }

    public String getField(){
        return field;
    }

    public String toString(){
        return "ScienceBook: " + getField() + " , Field: " + field;
    }
}
