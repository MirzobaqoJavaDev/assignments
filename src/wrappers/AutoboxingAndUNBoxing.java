package wrappers;

import java.util.ArrayList;
import java.util.Arrays;

public class AutoboxingAndUNBoxing {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(12);
        arrayList.add(null);

        int intNumber = arrayList.get(0);

        System.out.println(intNumber);
        System.out.println( arrayList.get(2));
    }
}
