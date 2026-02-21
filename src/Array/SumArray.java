package Array;


public class SumArray {
    public static void main(String[] args) {
        int[] array = {12, 51, 23};
        int total = 0;

        for (int counter = 0; counter < array.length; counter++)
            total += array[counter];

        int[] nums = {1, 2, 3, 4};
        int x = nums.length/2;
        int[] array1 = new int[]{x-1, x};
//        return array;array

//        return temp;
        System.out.printf("Total of  array elements: %d%n ", total);
    }
}
