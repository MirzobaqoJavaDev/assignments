package kitob153;

public class InitArray {
       public static void main(String[] args) {
        int[] result  = new  int[10];
        System.out.printf("%s%8s%n","Index",  "Value");
        for (int i=0; i<result.length; i++){
            System.out.printf("%5d%8d%n", i, result[i]);
        }
    }
}
