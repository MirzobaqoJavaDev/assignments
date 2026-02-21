package againStudy;

public class GenericExample {
    public <T> void print(T[] array){
        for (T t :array ){
            System.out.print(t+" ");
        }
        System.out.println();
    }
    public <T> T lastElement(T[] array){
        if (array.length==0){
            return null;
        }
        return array[array.length-1];
    }
    public <T,E> String isValueEqual(T a, T e){
        if ((a.toString()).equals(e.toString())){
          return "The values are equal";
        }else {
           return "The values are not equal";
        }

    }
}
