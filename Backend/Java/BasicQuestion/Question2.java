package Backend.Java.BasicQuestion;

import java.util.Scanner;

public class Question2 {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         String[] Technology = { "Phone - An electronic device", "Laptop - Portable computer" };

        String[] Fruits = { "Apple - A sweet fruit", "Banana - A yellow fruit" };

        String[] Vegtables = { "Carrot - A root vegtable", "Tomato - Used in cooking" };

        String[] TravelPlace = { "Goa - Beach destination", "Paris - City of lights" };

        String[] Books = { "Harry poter - A magical stroy", "Ramayana - Epic book related to hindus" };

        System.out.println("this is our menu : ");

        System.out.println("1. Technolgy");
        System.out.println("2. Fruits");
        System.out.println("3. Vegetables");
        System.out.println("4. TravelPlace");
        System.out.println("5. Books");


        System.out.println(("choice any number(1 to 5)"));
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Technolgy items");
                for(String items : Technology){
                    System.out.println(items);
                }
                break;
         case 2:
                System.out.println("Friuts items");
                for(String items : Fruits){
                    System.out.println(items);
                }
                break;
                 case 3:
                System.out.println("Vegetables items");
                for(String items : Vegtables){
                    System.out.println(items);
                }
                break;
                 case 4:
                System.out.println("Travel Place items");
                for(String items : TravelPlace){
                    System.out.println(items);
                }
                break;
                 case 5:
                System.out.println("Books items");
                for(String items : Books){
                    System.out.println(items);
                }
                break;
            default:
            System.out.println("invalid number");
                break;
        }
    }
}
