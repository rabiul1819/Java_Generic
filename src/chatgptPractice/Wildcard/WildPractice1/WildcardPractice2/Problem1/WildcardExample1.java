package chatgptPractice.Wildcard.WildPractice1.WildcardPractice2.Problem1;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample1 {
    // Method using wildcard to process employees

    public static void processEmployee(List <? extends Employee> employees){
        for (Employee e : employees){
            e.work();// // Common behavior
        }
    }

    public static void main(String[] args) {
        List<Manager> managers = new ArrayList<>();
        managers.add(new Manager("Alice"));

        List<Developer> developers = new ArrayList<>();
        developers.add(new Developer("Bob"));

        System.out.println("Processing Managers: ");
        processEmployee(managers);// Works for Managers

        System.out.println("\nProcessing Developer: ");
        processEmployee(developers);
    }
}
