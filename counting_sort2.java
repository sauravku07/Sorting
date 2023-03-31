package sort;

public class counting_sort2 {
    public static void countingsort2(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int index = 0; index < arr.length; index++) {
            largest = Math.max(largest, arr[index]);
        }
        int count[] = new int[largest+1];
        for (int index = 0; index < arr.length; index++) {
            count[arr[index]]++;
        }
        int j= 0;
        for (int index = count.length-1; index >= 0; index--) {
            while (count[index] > 0) {
                arr[j] = index;
                j++;
                count[index]--;
            }
        }
        
    }
    public static void Printarr(int arr[]) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        countingsort2(arr);
        Printarr(arr);

    }
}
