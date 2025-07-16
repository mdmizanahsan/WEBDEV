package Backend.Java.CommonQuestion.LanguageTranslater;

import java.util.Scanner;

public class LanguageTranslaterHelper {
    
    public static void main(String[] args){

        String[] english = {"hello","goodbye","thank you"};

        String[] spanish = {};

        String[] french = {};

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a language");

        System.out.println("1. English");
        System.out.println("2. Spanish");
        System.out.println("3. French");

        System.out.println("Choose any number between (1 to 3)");

        int num = sc.nextInt();
                  sc.nextLine();

        System.out.println("Enter the Word");

        String input = sc.nextLine().toLowerCase();

       
    }
}
