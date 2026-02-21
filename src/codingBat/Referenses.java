package codingBat;

import java.util.function.Function;
import java.util.function.Supplier;

public class Referenses {
    public static void main(String[] args) {
        Function<String, Car> function=Car::new;

        Car car = function.apply("BMW");
        car.display();
    }

}
class Car{
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void display(){
        System.out.println("Car" + model);
    }
}

