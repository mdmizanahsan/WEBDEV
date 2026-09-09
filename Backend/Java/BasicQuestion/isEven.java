// Create a method that takes an integer and returns whether the number is even or odd.


package Backend.Java.BasicQuestion;

public class isEven {
    
    public static void evenOdd(int num){
        if (num % 2 == 0) {
            System.out.println("The Number is Even");
        } else {
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {
        int num = 13;

        evenOdd(num);
    }
}
