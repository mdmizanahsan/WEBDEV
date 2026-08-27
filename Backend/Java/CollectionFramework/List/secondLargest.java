package Backend.Java.CollectionFramework.List;

import java.util.List;
import java.util.Arrays;

public class secondLargest {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(10, 5, 20, 8, 15);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : list){
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest) {
                secondLargest = num;
            }
        }
        System.out.println("Largest No. " +largest);
        System.out.println("Second Largest No. " +secondLargest);
    }
}
