package sort;
import java.util.Arrays;
public class inbuilt_sort {
    public static void printArr(int arr[]) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        //Arrays.sort(arr);
        Arrays.sort(arr,0,3);
        printArr(arr);

    }
}
