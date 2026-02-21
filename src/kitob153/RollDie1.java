package kitob153;

import java.security.SecureRandom;

public class RollDie1 {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        int[] result = new int[7];
        for (int roll =1; roll<=600000; roll++)
            ++result[1+randomNumber.nextInt(6)];

        System.out.printf("%s%8s%n", "Index", "Value");
        for (int face =1;face<result.length; face++)
            System.out.printf("%4d%10d%n", face, result[face]);


        System.out.printf("%5s%n%s%8s%n%5s", "*", "*", "*","*");

    }
}
