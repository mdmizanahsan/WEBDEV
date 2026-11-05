import java.util.Scanner;

public class LargestNum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of array : ");
        int size = sc.nextInt();

        System.out.print("Enter the element of array : ");
        int [] array = new int[size];

        // storing the number
        for(int i = 0; i <= array.length-1; i++){
            array[i] = sc.nextInt();
        }

        int max = array[0];

        for(int i =0; i <= array.length-1; i++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Largest Number : "+max);
    }
}
