package Backend.Java.Multithreading.OnlineFoodOrder;

public class mian {
    
    public static void main(String[] args) {
        
        Thread ThreadOrder = new Thread( new OrderProcess());

        ThreadOrder.start();

        Thread DeliveryFood = new Thread( new DeliveryTracking());
        DeliveryFood.start();
    }
}
