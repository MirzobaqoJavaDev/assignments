package book300;

public class ThisTest {
    public static void main(String[] args) {
       SimpleTime time = new SimpleTime(6, 30, 19);
        System.out.println(time.buildrString());
    }

}
class SimpleTime{
    private int hour;
    private int minute;
    private int second;

    public SimpleTime(int hour, int minute, int second) {
        if (hour<0 || hour>=24|| minute<0 || minute>=60 || second<0 || second>=60){
        throw new IllegalArgumentException(
                "hour, minute and/or second was out of range");
    }
            this.hour = hour;
            this.minute = minute;
            this.second = second;

    }
    public String buildrString(){
        return String.format("%24s :%s%n %25s :%s", "This.UniversalString()",
                this.toUniversalString(), "toUniversalString()", toUniversalString());
    }

    public String toUniversalString(){
        return String.format("%02d: %02d: %02d", this.hour, this.minute, this.second);
    }

}
