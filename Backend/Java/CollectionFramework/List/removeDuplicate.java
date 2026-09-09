// "Write a Java program to remove duplicates from a List while maintaining insertion order."

package Backend.Java.CollectionFramework.List;
import java.util.*;

public class removeDuplicate {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 40);

        Set<Integer> set = new LinkedHashSet<>(list);

        List<Integer> result = new ArrayList<>(set);

        System.out.println(result);

    }
}
/*  public class Removeduplicate{
        public static List<Integer> removeDuplicate(List<Integer> nums){
             Set<Integer> set = new LinkedHashSet<>(nums);
               return new ArrayList<>(set);
            }

        public static void main(String[] args){
        List<Integer> nums = Arrays.asList(10, 20, 10, 30, 20, 40);

        List<Integer> result = removeDuplicate(nums);

        System.out.println(result);
        }
}
 */
