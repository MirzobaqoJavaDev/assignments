package reference;

public class SpecialInteger {
    static final int min = 0;
    static final int max = 1000;
    int value;

    public SpecialInteger() {
    this.value = 0;
    }
    public SpecialInteger(int value) {
       setValue(value);
    }

    public void checkValue(int value) {
        if (value<min || value>max){
            throw new RuntimeException("Invalid value");
        }
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        checkValue(value);
        this.value = value;
    }
    public void add(int n){
        checkValue(this.value+n);
        this.value += n;
    }
    public void subtract(int n){
        checkValue(this.value-n);
        this.value -= n;
    }
    public static SpecialInteger valueOf(int value){
        return new SpecialInteger(value);
    }
    @Override
    public String toString() {
        return ""+ value;
    }

    public static void main(String[] args) {

        String  a = "dsd";
        int b = Integer.parseInt(a);
        System.out.println(b);
    }
}
