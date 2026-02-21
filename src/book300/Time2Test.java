package book300;

public class Time2Test {
    public static void main(String[] args) {
        Time2 t1 =new Time2();
        Time2 t2 =new Time2(2);
        Time2 t3 =new Time2(5,42);
        Time2 t4 =new Time2(12, 6, 59);
        Time2 t5 =new Time2(t4);
        System.out.println("Constructed with");
        displayTime("t1 all default arguments:", t1);
        displayTime("t2: hour specified ; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour, minute and second specified", t4);
        displayTime("t5: Time2 object t4 specified", t5);

        try {
            Time2 t6 = new Time2(27, 67, 99);
        }catch (IllegalArgumentException e){
            System.out.printf("%n Exception while initializing  t6: %s%n", e.getMessage());
        }

    }
    private static void displayTime(String header, Time2 t){
        System.out.printf("%s%n %s%n %s%n", header, t.toUniversalString(), t.toString());
    }
}
