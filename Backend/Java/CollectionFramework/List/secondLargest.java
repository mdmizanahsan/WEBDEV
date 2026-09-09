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
/*
import java.util.*;

public class SecondLargest {

    public static int findSecondLargest(List<Integer> nums) {

        Set<Integer> set = new HashSet<>(nums);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : set) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } 
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        List<Integer> nums =
                Arrays.asList(10, 5, 20, 8, 20, 15);

        int result = findSecondLargest(nums);

        System.out.println("Second largest: " + result);
    }
}

 */
