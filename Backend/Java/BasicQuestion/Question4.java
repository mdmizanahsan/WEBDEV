package Backend.Java.BasicQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    ArrayList<String> list = new ArrayList<>();
    list.add("mango");
    list.add("apple");

    while (true) {

      System.out.print("Enter you want ");
      String fruit = sc.nextLine();

      if (list.contains(fruit)) {
        System.out.println("fruit already present");
      } else {
        list.add(fruit);
        System.out.println(list);
      }
    }

  }
}
