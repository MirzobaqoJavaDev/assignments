package inner;

public class Bird {
    private String name;
    private double longitude;
    private double latitude;

    public Bird() {

    }

    public Bird(String name, double longitude, double latitude) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public void getLocation() {
        System.out.println("I am in " + longitude + " , " + latitude + " I am name: " + name);
    }

}
