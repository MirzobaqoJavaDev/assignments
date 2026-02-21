package kitob1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountTest2 {
    public static void main(String[] args) {

        allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz" });
        }
    public static String[] allSwap(String[] strings) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {

            char firstChar = strings[i].charAt(0);
            if (map.containsKey(firstChar)) {
                String temp = strings[map.get(firstChar)];
                strings[map.get(firstChar)] = strings[i];
                strings[i] = temp;
                map.remove(firstChar);

            } else {
                map.put(firstChar, i);
            }
        }
        return strings;

    }


}
