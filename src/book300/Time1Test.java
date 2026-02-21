package book300;

public class Time1Test {
    public static void main(String[] args) {

        Time1 time1 = new Time1();
        displayTime("After time object is created", time1);
        System.out.println();

        time1.setTime(13, 27, 6);
        displayTime("After Calling setTime", time1);
        System.out.println();

        try {
            time1.setTime(99, 99, 99);
        }catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        displayTime("After calling setTime with invalid values", time1);
    }
    private static void displayTime(String header, Time1 t){
        System.out.printf("%s%n Universal time %s%n Standard time: %s%n", header, t.toUniversalString(), t.toString());
    }
}
