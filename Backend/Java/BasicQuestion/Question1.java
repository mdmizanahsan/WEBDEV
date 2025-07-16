
package Backend.Java.BasicQuestion;

import java.util.Scanner;

public class Question1 {
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
        sc.nextLine();
         
         String[] select = null;
             String name = "";
         switch (num) {
            case 1:
                select = Technology;
                name = "Technolgy";
                break;
             case 2:
                select = Fruits;
                name = "Technolgy";
                break;
                case 3:
                select = Vegtables;
                name = "Vegtables";
                break;  
                    case 4:
                select = TravelPlace;
                name = "TravelPlace";
                break;
                    case 5:
                select = Books;
                name = "Books";
                break;  
            default:
                break;
         }
            System.out.println("Items in "+name+" category");
            for(String items : select){
                System.out.println(items);
            }
    }
}
