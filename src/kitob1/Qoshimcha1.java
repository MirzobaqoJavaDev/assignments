package kitob1;

import java.util.Scanner;

public class Qoshimcha1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int result;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        result = number1+number2;

        System.out.printf("result is %d%n", result);

        result = number1*number2;
        System.out.printf("Produce is %d%n", result);


        result = number1%number2;
        System.out.printf(" quotient is %d%n", result);

    }
}
