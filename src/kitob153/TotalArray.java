package kitob153;

public class TotalArray {
    public static void main(String[] args) {
        int[] result = {4,51,25,45,6,561,35,36,45,64};
        int total =0;
        for (int i=0; i<result.length; i++){
            total += result[i];
        }
        System.out.printf("Total of array elements %d%n", total);
    }
}
