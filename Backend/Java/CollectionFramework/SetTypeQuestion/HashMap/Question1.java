package Backend.Java.CollectionFramework.SetTypeQuestion.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Question1 {
    
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    HashMap< Integer, String> students = new HashMap<>();

    students.put(1,"mizan");
    students.put(2,"prince");
    students.put(3,"rizwan");
    students.put(4,"sajid");

       // get() :- kisi key value ko access karne ke liye use hota hai
    System.out.println("Roll no. "+students.get(1));

    if(students.containsKey(3)) {
        System.out.println("Roll no. 3 is present in the map.");
    } else {
        System.out.println("Roll no. 3 is not present in the map.");
    }
    
    for(Integer roll : students.keySet()) {
        System.out.println("Roll no. " + roll + ", Name: " + students.get(roll));

    }
  }
}
