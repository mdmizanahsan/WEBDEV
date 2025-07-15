package Backend.Java.Multithreading.OnlineFoodOrder;

public class DeliveryTracking implements Runnable{
    
    public void run() {
        System.out.println("Delivery Boy is at resturant");
        try{
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Delivery Boy is on the way");   
        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            System.out.println(e);
        }

         System.out.println("Delivery Boy is near the location");
        }
}
