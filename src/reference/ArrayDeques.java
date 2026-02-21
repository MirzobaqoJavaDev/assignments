package reference;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class ArrayDeques {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        System.out.println(map);
        map.remove(2);
        System.out.println(map);
        map.replace(3, "Alo");
        System.out.println(map);
        map.clear();
        System.out.println(map);
    }
}
