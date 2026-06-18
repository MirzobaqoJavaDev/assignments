package exceptions;

public abstract class Animal {
    private String name;
    private int age;
    public Animal(){
        System.out.println("Animal Constructor");
    }

    public  void eat(){
        System.out.println("food");
    }
    public abstract void sleep();

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
}
