package kitob153;

public class InitArray1 {
    public static void main(String[] args) {
        int[] result = {41,54,5,65,12,35,78,12,32,75};
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int i =0; i<result.length; i++){
            System.out.printf("%5d%8d%n", i, result[i]);
        }
    }
}
