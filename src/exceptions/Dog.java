package exceptions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("meat");
    }

    @Override
    public void sleep() {

    }

    public static void main(String[] args) {
        System.out.println(angleClock(4,50));
    }
    public static double angleClock(int hour, int minutes) {
       double hourAngle = (hour%12)*30+minutes*0.5;
       double minutesAngle = minutes*6;
       double diff = Math.abs(hourAngle - minutesAngle);
       return Math.min(diff,360-diff);

    }
}
