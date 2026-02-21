package generic;

import java.util.Comparator;
import java.util.Objects;

public class Person{
    private String name;
    private Integer age;

    public void thisExample(){
        System.out.println(this);
    }

    public int compare(Person person){
        return this.name.compareTo(person.getName());
    }
   public Person(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return "{name= "+this.name+", "+"age= "+this.age+" }";
    }



//
//    @Override
//    public int compareTo(Person o) {
//       int n = age.compareTo(o.age);
//       if (n==0){
//           return name.compareTo(o.name);
//       }
//       return n;
//    }

}
