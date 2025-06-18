package Backend.Java.CollectionFramework.ListTypeQuestion;
import java.util.ArrayList;
public class Question1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<> ();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40); 
        al.add(50);

        System.out.println("Elements in the ArrayList: " + al);

        al.add(2, 100); 
        // Replacing the element at index 2 with 100
        System.out.println("Elements in the ArrayList: " + al);

        al.set(5,500);
        System.out.println("Elements in the ArrayList: " + al);

        al.remove(al.size() - 1);
           System.out.println("Elements in the ArrayList: " + al);
    }

}
