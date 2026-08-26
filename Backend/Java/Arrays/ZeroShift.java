package Backend.Java.Arrays;

public class ZeroShift {
    public static void main(String[] args) {
        int [] array = {1,0,2,0,3,0,5,6};

        int index = 0;

        for(int i = 0; i < array.length-1; i++){
            if (array[i] != 0) {
                array[index] = array[i];
                index++;
            }
        }
        while (index < array.length) {
            array[index] = 0;
            index ++;
        }
        for(int i = 0; i < array.length-1; i++){
            System.out.print(array[i] + " ");
        }
    }
}
