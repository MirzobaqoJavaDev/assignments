package reference;

public abstract class Vehicle {
    public int speed = 60;
    public void move(){
        System.out.println("vehicle move");
    }
    public abstract void run();

    public abstract String getInfo();
}
class Car extends Vehicle {
    public int speed = 100;
    public void move(){
        System.out.println("Car move");
    }

    @Override
    public void run() {
        System.out.println("Car run");
    }

    @Override
    public String getInfo() {
        return "Asasas";
    }

    public static void main(String[] args) {
        Vehicle v = new Car();
        System.out.println(v.speed);
        System.out.println();
        v.move();
        v.run();

    }
}
