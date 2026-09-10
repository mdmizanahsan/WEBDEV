package Backend.Java.BasicQuestion;

public class Fibonacci {
    public static void main(String[] args) {
       int n = 9;

       int first_Num = 0;
       int second_Num = 1;

       System.out.print(first_Num+" "+second_Num+" ");

       for(int i = 2 ; i < n ; i++){
        int Fibonacci = first_Num + second_Num;

        System.out.print(Fibonacci+" ");

        first_Num = second_Num;
        second_Num = Fibonacci;
       }
    }
}
