package Backend.Java.CollectionFramework.SetTypeQuestion.HashSet;

import java.util.HashSet;

public class Question1 {
    
    public static void main(String[] args) {
        
        // Crate a HAshSet to store inique elements
        HashSet<String> uniqueElement = new HashSet<>();

        // Adding elements to the HashSet
        uniqueElement.add("Apple");
        uniqueElement.add("Banana");
        uniqueElement.add("Cherry");
        uniqueElement.add("Apple"); 
        
        // Duplicate, will not be added

        for(String element : uniqueElement) {
            System.out.println("Element:" + element);
            
        }
    }
}
