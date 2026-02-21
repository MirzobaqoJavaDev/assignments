package kitob1;

public class Increment {
    public static void main(String[] args) {
        int a =5;
        System.out.printf("c before postincrement: %d%n", a);
        System.out.printf("postincrementing c %d%n", a++);
        System.out.printf("c after postincrementing %d%n%n", a);


        a = 5;
        System.out.printf("c before postincrement: %d%n", a);
        System.out.printf("postincrementing c %d%n", ++a);
        System.out.printf("c after postincrementing %d%n%n", a);


    }
}
