package reference;

public class MugMain {
    public static void main(String[] args) {
        Mug mug = new Mug(10);
        System.out.println(mug.getAmount());
        runMug(mug);
        System.out.println(mug.getAmount());
    }
    public static void runMug(Mug mug){
        mug = new Mug(12);

    }
}
