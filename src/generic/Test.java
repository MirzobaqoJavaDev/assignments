package generic;

public class Test implements Engine<String>{
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}
