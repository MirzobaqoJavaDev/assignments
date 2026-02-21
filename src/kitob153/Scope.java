package kitob153;

public class Scope {
    private static int x =1;

    public static void main(String[] args) {
        int x =5;
        System.out.printf("local x in main is %d%n", x);
      useLocalVariable();
      useField();
      useLocalVariable();
      useField();
        System.out.printf("%n local x main is %d%n", x);
    }
    public static void useLocalVariable(){
        int x =25;
        System.out.printf("%n local x on entering method useLocalVariable is %d%n", x);
        ++x;
        System.out.printf("Local x before exiting method useLocalVariable is %d%n", x);
    }
    public static void useField(){
        System.out.printf("%n Field x on entering method useField %d%n", x);
        x *=10;
        System.out.printf("Field x before exiting method useField %d%n", x);
    }
}
