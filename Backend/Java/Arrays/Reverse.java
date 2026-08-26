package Backend.Java.Arrays;

public class Reverse {
    public static void main(String[] args){
        int [] arr = {1,2,3,4};

        int [] Reverse = new int[arr.length];
        int j = 0;

        for(int i = arr.length-1; i >= 0; i--){
            Reverse[j] = arr[i];
            j++;
        }
        
        for(int i = 0; i < Reverse.length; i++){
            System.out.print(Reverse[i] +" ");
        }

    }
}
