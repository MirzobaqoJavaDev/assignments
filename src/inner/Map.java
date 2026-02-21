package inner;

public interface Map {
     void mapMethod();

    interface InnerMap{
         void mapInner();

    }
    class ClassInnerMap{
        public int intReturn(){
            return 343;
        }
    }
}
