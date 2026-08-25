package exceptions;

import java.util.Objects;

public  class Animal {
    private String name;
    private int age;
    public Animal(){
        System.out.println("Animal Constructor");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Animal(String name){
        this.name = name;
    }

    public  void eat(){
        System.out.println("food");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
