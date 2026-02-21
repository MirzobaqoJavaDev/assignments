package generic;

public class Calculator<E> implements Engine<E>{
    @Override
    public void show(E e) {
        System.out.println(e);
    }
}
