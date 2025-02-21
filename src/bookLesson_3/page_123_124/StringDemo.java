package bookLesson_3.page_123_124;

public class StringDemo {
    public static void main(String[] args) {

        String nationalAnthemLineOne = "My Bengal Of Precious Gold, I Love You.";
        String nationalAnthemLineTwo = "Forever Your Skies, Your Air Set My Heart In Tune\n" +
                "As If It Were A Flute.";
        System.out.println(nationalAnthemLineOne);
        System.out.println(nationalAnthemLineTwo);
        System.out.println("-----------------------------");

        String nationalAnthem = nationalAnthemLineOne + nationalAnthemLineTwo; // concatenation operator is +

        System.out.println("After Concatenation\n" + nationalAnthem);
    }
}
