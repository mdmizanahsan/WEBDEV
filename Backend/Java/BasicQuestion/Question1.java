package Backend.Java.BasicQuestion;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] Technology = { "Phone - An electronic device","Laptop - Portable computer"};
        
        String[] Fruits = { "Apple - A sweet fruit","Banana - A yellow fruit"};

        String[] Vegtables = { "Carrot - A root vegtable","Tomato - Used in cooking"};

        String[] TravelPlace = { "Goa - Beach destination","Paris - City of lights"};
        
        String[] Books = {"Harry poter - A magical stroy","Ramayana - Epic book related to hindus"};


        System.out.println("this is our menu : ");

        System.out.println("1. Technolgy");
        System.out.println("2. Fruits");
        System.out.println("3. Vegetables");
        System.out.println("4. TravelPlace");
        System.out.println("5. Books");

        System.out.println(("choice any number(1 to 5)"));
        int num = sc.nextInt();

        System.out.println("Enter the keyword you want to search : ");
        String keyword = sc.next();

        

        String [] array = null;

        switch (num) {
            case '1':
                array = Technology;
                break;
        
            case '2':
                array = Fruits;
                break;

            case '3':
                array = Vegtables;
                break;
                
            case '4':
                array = TravelPlace;
                break;
                
            case '5':
                array = Books;
                break;    
            default:
            System.out.println("Invalid");
                break;
        }

        

    
    }
    
}
