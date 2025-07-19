package Backend.Java.CollectionFramework.ListTypeQuestion.LinkedList;

import java.util.LinkedList;

public class Question1 {

    public static void main(String[] args) {
        
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Wake up");
        tasks.add("Brush");
        tasks.add("study java");
        tasks.add("Go to gym");
        tasks.add("Sleep");

        System.out.println("Tasks in the linked list:"+ tasks);

        tasks.remove("Brush");
        System.out.println("Tasks in the linked list:"+ tasks);

        tasks.addFirst("hahaha");
        System.out.println("Tasks in the linked list:"+ tasks);

        tasks.addLast("hehehe");
        System.out.println("Tasks in the linked list:"+ tasks);

        tasks.contains("Go to gym");
        System.out.println("Tasks in the linked list:"+ tasks);

    }
    
}
