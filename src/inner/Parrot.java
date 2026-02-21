package inner;

public class Parrot extends FlyBird {
    public Parrot(String name, double longitude, double latitude) {
        super(name, longitude, latitude);
    }

    @Override
    public void fly() {
        System.out.println("Parrot: I am fly");
    }

}
