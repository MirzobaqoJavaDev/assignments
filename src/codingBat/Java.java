package codingBat;

import java.util.Objects;

public class Java{
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Java{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Java(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public Java(){

    }
    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age=age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
