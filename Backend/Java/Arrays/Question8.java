package Backend.Java.Arrays;

import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = sc.nextInt();

        System.out.println("Do you have DL");
        String dl = sc.next().trim();

        if (age >= 18 && dl.equals("yes")) {
            System.out.println("you can go with bike for voting");
        } else if (age >= 18 && dl.equals("no")) {
            System.out.println("you can go for voting but without bike");
        } else {
            System.out.println("you can not vote");
        }

    }
}
