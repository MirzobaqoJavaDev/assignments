package wrappers;

import polimarfizim.HourlyEmployee;

public class HeapAndStack implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public <T> void generic(T[] age){
        for (T age1:age){
            System.out.println(age1);
        }
    }

    public static void main(String[] args) {
        HeapAndStack heapAndStack = new HeapAndStack();
        Integer[] intGeneric= {1,2,3,4};
        heapAndStack.generic(intGeneric);
    }

    @Override
    public HeapAndStack clone() throws CloneNotSupportedException {

            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (HeapAndStack) super.clone();

    }
}
