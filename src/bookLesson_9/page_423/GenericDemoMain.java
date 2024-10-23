package bookLesson_9.page_423;

public class GenericDemoMain {
    public static void main(String[] args) {
        Generic<Integer> iObj;   // Create a reference to Generic with type Integer.

        iObj = new Generic<>(88);   // Instantiate Generic with Integer type, passing 88.
        iObj.showType();   // This will print the type of the object (java.lang.Integer).

        int value = iObj.getObj();   // Get the Integer value from iObj.
        System.out.println("value = " + value);   // Print the integer value.

        Generic<String> strObj = new Generic<>("This is a test");   // Create a Generic object with type String.
        strObj.showType();   // This will print the type of the object (java.lang.String).

        String strValue = strObj.getObj();   // Get the String value from strObj.
        System.out.println("strValue = " + strValue);   // Print the string value.
    }
}
