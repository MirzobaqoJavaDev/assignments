package Array;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];
        for ( int roll = 0; roll<=600000; roll++)
            ++frequency[1+ random.nextInt(6)];

        System.out.printf("%s%10s%n", "Face", "frequency");

        for (int face = 0; face<frequency.length; face++)
            System.out.printf("%4d%10d%n", face, frequency[face]);

    }
}
