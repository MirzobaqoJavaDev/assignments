package wrappers;

public class Cat extends Animal {
    public Cat(){
        System.out.println("Cat constructor");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name="Ali";

    }
}
