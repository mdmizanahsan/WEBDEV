package Backend.Java.CollectionFramework.ListTypeQuestion.LinkedList;
import java.util.LinkedList;
import java.util.Scanner;

public class Question2 {
    
    public static void main(String[] args){

        LinkedList<String> todoList = new LinkedList<>();
     
    Scanner sc = new Scanner(System.in); 
    
    while(true){
        System.out.println("---- To-Do List Management System ----");
        System.out.println("1. Add Task at the end");
        System.out.println("2. Add Task at the beginning");
        System.out.println("3. Remove a Task ");
        System.out.println("4. Show all Tasks");
        System.out.println("5. Exit");

        System.out.print("Enter your choice (1 to 5) :");
        int choice = sc.nextInt();
        sc.nextLine(); 

        switch(choice) {
            case 1:
                System.out.println("Enter the task to add at the end:");
                String taskend= sc.nextLine();
                todoList.add(taskend);
                System.out.println("Task added successfully!");
                break;
            case 2:
                System.out.println("Enter the task to add at the beginning:");
                String taskbeg = sc.nextLine();
                todoList.addFirst(taskbeg);
                System.out.println("Task added successfully!");
                break;
            case 3:
                System.out.println("Enter the task to remove:");
                String taskRev = sc.nextLine();
                todoList.remove(taskRev);
                System.out.println("Task removed successfully!");
                break;
                case 4:
                System.out.println("Show all the tasks:");
                for (String task : todoList) {
                    System.out.println("- " + task);
                }
                break;
            case 5:
                System.out.println("Exiting the system.");
                return;        

            default:
                System.out.println("Invalid choice. Please try again.");
                break;    
        }
    }

    }
}
