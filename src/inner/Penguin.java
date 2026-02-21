package inner;

public class Penguin extends SwimBird{
    public Penguin(String name, double longitude, double latitude) {
        super(name, longitude, latitude);
    }
    @Override
    public void swim(){
        System.out.println("Penguin: I am swim");
    }
}
