package againStudy;

public class ChildPerson extends AbstractExample{
    public ChildPerson() {
    }

    @Override
    public void value() {
        System.out.println("Value");

    }
    @Override
    public void print(){
        System.out.println("child print");
    }
}
