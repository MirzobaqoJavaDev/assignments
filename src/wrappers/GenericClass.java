package wrappers;


public class GenericClass <T extends Animal>{
    private T name;
    private T age;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }


    public static void main(String[] args) {


    }
}
