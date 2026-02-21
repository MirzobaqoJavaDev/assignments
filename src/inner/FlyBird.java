package inner;

public class FlyBird extends Bird{

    public FlyBird(String name, double longitude, double latitude) {
        super(name, longitude, latitude);
    }
    public void fly(){
        System.out.println("I am fly");
    }
    public void hello(){
        System.out.println("Hello");
    }
}
