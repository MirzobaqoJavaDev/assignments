package Array;

public class InitArray {

    public static void main(String[] args) {

//        int[] array = new int[10];
        int[] array = {12, 54, 84, 12, 98, 85, 45, 96, 72, 12, 54};

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);

    }
}
