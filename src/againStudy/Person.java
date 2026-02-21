package againStudy;

import againStudy.MainPerson.InnerClass;

public class Person implements Cloneable{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public Person setName(String name) {
        this.name = name;
        return this;
    }
    public Person setAge(int age){
        this.age=age;
        return this;
    }

    @Override
    public String toString(){
        return "Person{"+
                "name='"+name + '\''+
                ", age= "+age+
                '}';
    }


    @Override
    public Person clone() {
        try {
            Person clone = (Person) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
