package inner;

public class SwimBird extends Bird{

    public SwimBird(String name, double longitude, double latitude) {
        super(name, longitude, latitude);
    }
    public void swim(){
        System.out.println("I am swim");
    }
}
