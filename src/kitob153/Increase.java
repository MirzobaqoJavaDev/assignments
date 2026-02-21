package kitob153;

public class Increase {
    public static void main(String[] args) {
    int[][] array1 = new int[10][10];

        for (int row = 0; row<array1.length;row++) {
            for (int count = 0; count < array1[row].length; count++){
                array1[row][count]=(1+row)*(1+count);
        }
        }
        System.out.println("Natija");
      outputArray(array1);
    }

    public static void outputArray(int[][] array){
        for (int row = 0; row<array.length;row++){
            for (int count = 0 ; count<array[row].length; count++){
                System.out.printf("  %4d", array[row][count]);
        }
            System.out.println();
        }

    }
}
