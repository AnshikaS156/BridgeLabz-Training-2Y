import java.util.Scanner;

public class StudentRegistrationSystem{

    
    public static void displayStudentNames(String[] names) {
        System.out.println("Registered Students:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    
    public static void compareStrings(String str1, String str2) {
        System.out.println("Comparing Strings:");
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1.equals(str2): " + str1.equals(str2));
    }

   public static void searchStudent(String[] names, String searchName) {
    boolean found = false;
    for (int i = 0; i < names.length; i++) { 
        if (names[i].equals(searchName)) {
            found = true;
            break;
        }
    }
    if (found) {
        System.out.println("Student Registered");
    } else {
        System.out.println("Student Not Found");
    }
}
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students to register: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] studentNames = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();
        }

        displayStudentNames(studentNames);
        String name1 = "Hello";
        String name2 = "Hello";
        String name3 = new String("Hello");
        System.out.println(" SCP Behavior:");
        System.out.println("name1 == name2: " + (name1 == name2)); 
        System.out.println("name1.equals(name2): " + name1.equals(name2)); 
        System.out.println("name1 == name3: " + (name1 == name3)); 
        System.out.println("name1.equals(name3): " + name1.equals(name3)); 

      
        String original= "Anshika";
        String modified = original.concat(" Saraswat");
        
        System.out.println("Original Name: " + original); 
        System.out.println("Modified Name: " + modified);

        compareStrings(name1, name3);

        
        System.out.print("\nEnter a name to search for registration: ");
        String searchName = scanner.nextLine();
        searchStudent(studentNames, searchName);


        System.out.print("Enter a name to modify with StringBuffer: ");
        String bufferName = scanner.nextLine();
        StringBuffer sbuffer = new StringBuffer(bufferName);
        sbuffer.append(" Registered");
        sbuffer.insert(0, "Student: ");
        sbuffer.delete(8, 9); 
        System.out.println("Modified with StringBuffer: " + sbuffer);
       

        scanner.close();
    }
}