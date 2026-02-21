package codingBat;

public class Run {
    public static void main(String[] args) {
     Integer foo = 13;
        System.out.println(foo);
        setFoo(foo);

        System.out.println(foo);
        foo=24;
        System.out.println(foo);
    }
    public static void setFoo(Integer foo){
        foo=2;
    }
}
