package bookLesson_3.page_97_98;

public class Literal {
    public static void main(String[] args) {
        boolean result = true;
        char capitalC = 'C';

        System.out.println("Result = " + result + " \nCapitalC = " + capitalC);

        //Integer Literal
        System.out.println("\n\nInteger Literal");
        System.out.println("-----------------\n");

        int countInt = 10;
        long countLong = 4L;
        System.out.println("Integer : " + countInt + " \nLong : " + countLong);

        int decimalValue = 123;
        int hexDecimalValue = 0x7B;
        int binaryValue = 0b1111011;
        int octalValue = 0173;

        System.out.println("DecimalValue : " + decimalValue + " \nhexDecimalValue : " + hexDecimalValue);
        System.out.println("BinaryValue : " + binaryValue + " \noctalValue : " + octalValue);

        //Floating point  Literal
        System.out.println("\n\nFloating point  Literal");
        System.out.println("-----------------\n");

        double pi = 3.1416;
        double gravitationalConstant = 6.67408E-11;
        float area = 50.26544f;
        System.out.println("PI : " + pi + "\nGravitational Constant G : " + gravitationalConstant + "\n Area : " + area);


        //Character & string literal
        System.out.println("\n\nCharacter & string literal");
        System.out.println("-----------------\n");

        String greetingInBangla = "সুপ্রভাত";
        String greetingInChinese = "早上好";
        char ka = 'ক';

        System.out.println("Greeting In Bangla: " + greetingInBangla + "\n Greeting In Chinese: " + greetingInChinese + "\n Ka: " + ka);

        //ASCII
        System.out.println("\n\nASCII Value");
        System.out.println("-----------------\n");
        char a = 'a';
        int asciiValue = a;
        System.out.println("ASCII value of a: " + asciiValue);

        //Numeric Literal
        System.out.println("\n\nNumeric Literal");
        System.out.println("-----------------\n");

        int x1 = 2_101_969;
        int x2 = 1__192;
        int x3 = 03_661;
        int x4 = 0b0111_1011_0001; ;
        int x5 = 0x7_B_1;
        byte b1 = 1_2_7;
        double d1 = 1_29.09_19;
        System.out.println("x1 : " + x1 + "\nX2 : " + x2 + "\nX3 : " + x3 + "\nX4 : " + x4 + " \nX5: " + x5);
        System.out.println("B1 : " + b1 + "\nD1 : " + d1);




    }
}
