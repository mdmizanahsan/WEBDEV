package Backend.Java.CollectionFramework.Generics;

public class question1 {
    public static void main(String[] args) {

        temp(4,5.5,6);
        
    }

    public static <t1,t2,t3> void temp(t1 x, t2 y, t3 z) {
        System.out.println("This is x =" +x);
        System.out.println("This is y =" +y);
        System.out.println("This is z =" +z);

    }
}
