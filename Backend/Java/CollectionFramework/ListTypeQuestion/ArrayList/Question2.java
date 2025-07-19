package Backend.Java.CollectionFramework.ListTypeQuestion.ArrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {
    
    public static void main(String[] args) {

       ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
        
        System.out.println("---- Student Management System ----");

        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Search Student");
        System.out.println("4. Display all students");
        System.out.println("5. Exit");
       
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

           switch (choice)  {
            case 1 :
                System.out.print("Enter student name: ");
                String studentName = scanner.nextLine();
                students.add(studentName);
                System.out.println("Student added Successfully !");
                break;
            
            case 2 :
                System.out.print("Enter student name to remove: ");
                String studentRemove = scanner.nextLine();
                students.remove(studentRemove);
                System.out.println("Student removed Successfully !");
                break;

            case 3 :
                System.out.println("Enter student name to search: ");
                String studentSearch = scanner.nextLine();
                if(students.contains(studentSearch)) {
                    System.out.println("Student " + studentSearch + " found in the list.");
                } else {
                    System.out.println("Student " + studentSearch + " not found in the list.");
                }
                break;    
            
            case 4 :
                System.out.println("Enter student name to display: ");
                System.out.println("Students List :"+students);
                break;
                
            case 5 :
                System.out.print("Exiting the system.");
                return;

            default:
            System.out.println("Please choose between 1 to 5");
                break;
           }
        }

    }
}

