package chatgptPractice.Wildcard.WildPractice1.WildcardPractice2.Problem1;
// Subclass for Manager

public class Manager extends Employee{
    Manager(String name){
        super(name);
    }

    void manage(){
        System.out.println(name + " in managing the team.");
    }

}
