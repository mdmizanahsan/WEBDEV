package Backend.Java.ControlFlow;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
      System.out.println("Enter the first number : ");
        int a = sc.nextInt();

      System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);


        System.out.println("Enter the second number");
        int b = sc.nextInt();
        
        int result = 0;

            switch (operator) {
                case '+':
                    result = add(a, b);
                    break;
                case '-' :
                result = sub(a,b);
                    break;

                      case '*' :
                result = mul(a,b);
                    break;

                      case '/' :

                result = div(a,b);
                    break;

                default:
                    System.out.println("invalid opertaor");

            }

            System.out.println("Result: " + result);

    }

    public static int add(int a, int b){

        int result = a + b;

      return result;
        
    }

    public static int sub(int a,int b) {
        int subtract = a - b;

        
        return subtract;
    }

    public static int mul(int a, int b){
        int multiply = a*b;


       return multiply;
    }

    public static int div(int a,int b){
        int divide = a / b ;

        return divide;
    }
}
