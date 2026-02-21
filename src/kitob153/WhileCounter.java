package kitob153;

public class WhileCounter {
    public static void main(String[] args) {
        int counter = 0;
        while (++counter<=10){
            System.out.printf("  %d", counter);

        }
        System.out.println();
    }

}
class ForCounter {
    public static void main(String[] args) {
         for (int counter =1; counter<=10; counter++){
             System.out.printf("%d ", counter);
         }
        System.out.println();
    }
}

