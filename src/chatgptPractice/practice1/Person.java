package chatgptPractice.practice1;

public class Person {
    private String name;
    private int age;

    //Constructor
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    //Getter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // Optionally, override toString() for easy printing


//    @Override
//    public String toString() {
//        return "Person{name ='" + name + "',age = " + age + " } ";
//    }

    @Override
    public String toString() {
      //  return "Person{name = '" + name + "' , age = " + age + "} ";
        return "person { name = '" + name + "' , age = "+ age + "}";
    }
}
