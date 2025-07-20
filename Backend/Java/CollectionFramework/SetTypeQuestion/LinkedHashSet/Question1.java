package Backend.Java.CollectionFramework.SetTypeQuestion.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Question1 {
    
    public static void main(String[] args) {
        
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("PLase enter 6 Fruitd names");

        int count = 0;

        while (count < 6) {
            System.out.print("Fruit " + (count + 1) + ":");
            String fruit = sc.nextLine();

            boolean added = linkedHashSet.add(fruit);
            if (!added) {
                System.out.println("This fruit is already in the set, please enter a different fruit.");
            }
            count++;
        }
             System.out.println("unique Fruits in order");
            for(String fruits : linkedHashSet) {
                System.out.println("Fruits " + fruits);
            }
        }
}
