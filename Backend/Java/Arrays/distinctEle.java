//Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the beginning in sorted order. Additionally, return the length of this distinct sorted subarray

package Backend.Java.Arrays;
 
   public class distinctEle {
    public static void main(String [] args){

        int [] arr = {1,1,2,2,3,3,3,4,4} ;

        int j = 1;

        for(int i = 1; i < arr.length; i++){
            if (arr[i] != arr[i-1]) {
                arr[j] = arr[i];
                j++;
            }
        }

        for(int i = 0; i<j; i++){
            System.out.print(arr[i] +" ");
        }
    }
   }