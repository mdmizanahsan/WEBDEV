
package Backend.Java.Arrays;

public class Question12 {
    public static void main(String[] args){
        int [] arr = {2,5,3,6,1,7,4};

        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for(int i = 0; i <= arr.length-1; i++){
            if (arr[i] > max) {
                sec_max = max;
                max = arr[i];

            } else if(arr[i] > sec_max && max != sec_max  ) {

                sec_max = arr[i];
            }
        }
          System.out.println("first Max " + max);
                 System.out.println("Second max " +sec_max);

    }
    
}
