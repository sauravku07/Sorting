package sort;
public class counting_sort {
    public static void countinsort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int index = 0; index < arr.length; index++) {
            largest = Math.max(largest, arr[index]);
        }
        int count[] = new int[largest+1];
        for (int index = 0; index < arr.length; index++) {
            count[arr[index]]++;
        }
        int j= 0;
        for (int index = 0; index < count.length; index++) {
            while (count[index] > 0) {
                arr[j] = index;
                j++;
                count[index]--;
            }
        }
    }
    public static void printArr(int arr[]) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2,1,2,3,1,2,4};
        countinsort(arr);
        printArr(arr);
        
    }
}
