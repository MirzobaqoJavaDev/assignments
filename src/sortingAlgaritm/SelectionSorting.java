package sortingAlgaritm;

public class SelectionSorting {

    static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int minIdx = i;

            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
        }
    }

    static void printArray(int[] arr){
        for (int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println("origin array");
        printArray(arr);

        selectionSort(arr);

        System.out.println("sorted array");
        printArray(arr);

    }
}
