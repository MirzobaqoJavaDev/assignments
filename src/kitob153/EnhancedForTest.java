package kitob153;

public class EnhancedForTest {
    public static void main(String[] args) {
        int[] result = {4,5,6,12,98,7,23,6,14,56,92,12};
        int total = 0;
        for (int array :result)
            total += array;
        System.out.printf("Total to elements array  %d%n", total);
    }
}
