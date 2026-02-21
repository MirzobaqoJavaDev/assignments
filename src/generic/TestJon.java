package generic;

public class TestJon <T,E>{
    private T value;
    private E obj;

    public void setAll(T value, E obj){
        this.value=value;
        this.obj=obj;
    }

    public T getValue(){
        return this.value;
    }
    public E getObj(){
        return this.obj;
    }
}

