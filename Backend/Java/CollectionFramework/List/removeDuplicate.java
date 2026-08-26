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
