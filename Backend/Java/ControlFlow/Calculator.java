package Backend.Java.ControlFlow;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     /*
      System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
     */   

            add();


    }

    public static void add(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int a = sc.nextInt();

        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        int result = a + b;

        System.out.println("The sum is = "+result);

        sub(a, b);
    }

    public static void sub(int a,int b) {
        int subtract = a - b;

        System.out.println("The sub of two number is = "+subtract);
        
        mul(a,b);
    }

    public static void mul(int a, int b){
        int multiply = a*b;

        System.out.println("The multiplication of two number is = "+multiply);

       div(a,b);
    }

    public static void div(int a,int b){
        int divide = a / b ;

        System.out.println("The Division of two number is = "+divide);
    }
}
