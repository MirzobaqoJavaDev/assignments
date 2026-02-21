package Array;

public class Main {
    public static void main(String[] args) {
        System.out.println(stringClean("yyzzza")); // "yza"
        System.out.println(stringClean("abbbcdd")); // "abcd"
        System.out.println(stringClean("Hello")); // "Helo"
    }

    public static String stringClean(String str) {
        if (str.length() <= 1) {
            return str;
        }

        char first = str.charAt(0);
        char second = str.charAt(1);

        if (first == second) {
            return stringClean(str.substring(1));
        } else {
            return first + stringClean(str.substring(1));
        }
    }
}
