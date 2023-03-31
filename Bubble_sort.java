package sort;
public class Bubble_sort {
    public static void Bubblesort(int arr[]) {
        for(int turn=0;turn<arr.length-1;turn++){
            for (int j = 0; j < arr.length-1-turn; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                 }
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
        int arr[] ={5,4,1,3,2};
        Bubblesort(arr);
        printArr(arr);
    }
}
