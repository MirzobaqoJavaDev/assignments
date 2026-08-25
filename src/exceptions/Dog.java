package exceptions;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("meat");
    }



    public static void main(String[] args) {
        int[] array = {8,2,3,4,6};
        System.out.println(missingMultiple(array,2));
    }
    public static int missingMultiple(int[] nums, int k) {
        boolean right=true;
        int next = k;
        while (right) {
           if (hastNextTrue(nums, next)){
               next +=k;
           }else {
               right=false;
           }
        }
        return next;
    }
    public  static boolean hastNextTrue(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                return true;
            }
        }
        return false;
    }


    public static double angleClock(int hour, int minutes) {
        double hourAngle = (hour % 12) * 30 + minutes * 0.5;
        double minutesAngle = minutes * 6;
        double diff = Math.abs(hourAngle - minutesAngle);
        return Math.min(diff, 360 - diff);

    }
}
