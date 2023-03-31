package sort;
import java.util.Arrays;
import java.util.Collections;
public class inbuilt_sort2 {
    public static void printArr(Integer arr[]) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        Integer arr[] = {5,4,1,3,2};
        //Arrays.sort(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,3,Collections.reverseOrder());
       
        printArr(arr);

    }
}
