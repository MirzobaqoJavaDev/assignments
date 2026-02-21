package reference;

public class Main12 {
    public static void main(String[] args) {
    Cheese myCheese = new Cheese("Ravshan");
        System.out.println(myCheese.getName());

        still(myCheese);
        System.out.println(myCheese.getName());
    }
    public static void still(Cheese myCheese) {
        myCheese = new Cheese("Latif");
        myCheese.setName("Latif");
        System.out.println(myCheese.getName());
    }


}
