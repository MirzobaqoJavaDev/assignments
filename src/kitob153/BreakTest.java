package kitob153;

public class BreakTest {
    public static void main(String[] args) {
        int count;
        for (count=1; count<=10; count++){
           if (count==6)
            break;
               System.out.printf("%d ", count);

        }
        System.out.printf("%n Broke out of loop at count = %d%n", count);
    }
}
