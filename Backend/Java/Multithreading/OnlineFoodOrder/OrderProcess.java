package Backend.Java.Multithreading.OnlineFoodOrder;

public class OrderProcess implements Runnable{

    public void run() {
        System.out.println("Cuttting a vegetable");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            System.out.println(e);
        }

                System.out.println("Food is Cooking");
                try{
                    Thread.sleep(1000);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }

               System.out.println("Your Order is packed");

    }
    
}
           // we can use this also
/*
 *    public void run() {
 *        String[] steps = {"Vegetable is cutting","Food id cooking..","Your order is packed"};
 *           for(String step : steps){
 *              System.out.println(step);
 *                  try{
 *                      Thread.sleep(1000);                 
 *                     } catch(interuptedException) {
 *                              System.out.println(e);
 * }
 *   }
 *          
 *     }
 * 
 * 
 * 
 */