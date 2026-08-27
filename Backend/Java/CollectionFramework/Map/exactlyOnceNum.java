// Print those number whose exactly come one time 
package Backend.Java.CollectionFramework.Map;
import java.util.Map;
import java.util.HashMap;

public class exactlyOnceNum {
   public static void main(String[] args){
    int [] nums = {10,20,10,30,20,40,30};

    Map<Integer,Integer> frequency = new HashMap<>();

    for(int num : nums){
        if(frequency.containsKey(num)){
           int count =  frequency.get(num);
           frequency.put(num, count+1);
        } else {
            frequency.put(num, 1);
        }
    }
   // entrySet() → Map ki KEY + VALUE dono ko ek-ek karke access karo
    for(Map.Entry<Integer,Integer> entry:frequency.entrySet()) {
        if(entry.getValue() == 1){
            System.out.println(entry.getKey());
        }
      }
   }   
}
