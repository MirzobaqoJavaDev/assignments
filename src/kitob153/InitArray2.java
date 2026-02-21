package kitob153;

public class InitArray2 {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int[] result = new int[ARRAY_LENGTH];

        for (int i =0; i<result.length; i++)
            result[i] = 2+2*i;

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int i =0; i<result.length; i++)
        System.out.printf("%5d%8d%n", i, result[i]);

    }
}
