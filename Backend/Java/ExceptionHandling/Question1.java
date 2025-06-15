package Backend.Java.ExceptionHandling;
import java.util.Scanner;
public class Question1 { 
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        try{
            int balance = 50000;
            System.out.println("Enter your PIN number : ");
            int pin = sc.nextInt();
               if(pin == 5566)
               {
                System.out.println("Your balance is = "+balance);
               }
               else
               {
                System.out.println("Incorrect PIN number :");
               }    
        } catch(Exception e)
        {
                System.out.println("Exception is handled");
        }
    }
}
