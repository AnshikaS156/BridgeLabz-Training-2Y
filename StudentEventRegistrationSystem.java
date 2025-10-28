import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

class Participant <T>{
    private T rollnumber;
    private String name;
    private String Branch;

    public Participant(T rollnumber, String name, String Branch){
        this.rollnumber = rollnumber;
        this.name = name;
        this.Branch = Branch;
    }
    public T getRollnumber(){
        return rollnumber;
    }

    public String getName(){
        return name;
    }
    public String getBranch(){
        return Branch;
    }
    
    public void displayInfo(){
        System.out.println("Roll Number: " + rollnumber + ", Name: " + name + ", Branch: " + Branch);
    }



}

public class StudentEventRegistrationSystem {
    public static void main(String[] args) {
        HashSet<Integer> introllNumber= new HashSet<>();
        introllNumber.add(101);
        introllNumber.add(102);
        introllNumber.add(101);
        HashSet<String> strrollNumber = new HashSet<>();
        strrollNumber.add("Abc101");
        strrollNumber.add("Xyz102");
        strrollNumber.add("Abc101");

        ArrayList<Participant<Integer>> intParticipants = new ArrayList<>();
        intParticipants.add(new Participant<>(101, "Anshika", "CSE"));
        intParticipants.add(new Participant<>(102, "Kashish", "ECE"));
       

        ArrayList<Participant<String>> strParticipants = new ArrayList<>();
        strParticipants.add(new Participant<>("Abc101", "Ayushi", "ME"));
        strParticipants.add(new Participant<>("Xyz102", "Vanshika", "CE"));

        LinkedList<Participant<Integer>> intParticipantList = new LinkedList<>(intParticipants);
        intParticipantList.add(new Participant<>(103, "Amisha", "EE"));


        LinkedList<Participant<String>> strParticipantList = new LinkedList<>(strParticipants);
        strParticipantList.add(new Participant<>("Pqr103", "Tanishka", "AE"));

        
        System.out.println("----- Student Event Registration System -----");
        
        System.out.println("Integer Roll Numbers: " + introllNumber);
        System.out.println("String Roll Numbers: " + strrollNumber);
        System.out.println("\n----- Integer Roll Numbers(Main List) -----");
        
        for (Participant<Integer> participant : intParticipants) {
            participant.displayInfo();
        }
        System.out.println("\n----- String Roll Numbers(Main List) -----");
        for (Participant<String> participant : strParticipants) {
            participant.displayInfo();
        }
        System.out.println("\n-----Integer Participant Waiting List:-----");
        for (Participant<Integer> participant : intParticipantList) {
            participant.displayInfo();
        }
        System.out.println("\n-----String Participant Waiting List:-----");
        for (Participant<String> participant : strParticipantList) {
            participant.displayInfo();
        }





    }
    
}

    

