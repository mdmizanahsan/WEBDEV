package Backend.Java.CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class countOccurances {
    
    public static void main(String [] args){

        int [] nums = {5,2,5,3,2,5,4};

        Map<Integer,Integer> occurance = new HashMap<>();

        for(int num : nums){
            if (occurance.containsKey(num)) {
                int count = occurance.get(num);
                occurance.put(num, count+1);
            } else {
                occurance.put(num, 1);
            }
        }
        System.out.println(occurance);
    }
}
