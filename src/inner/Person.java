package inner;

import java.io.*;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.Map;


public class Person implements Comparable<Person> {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://dasturlash.uz/resources?name=1");
        System.out.println(url.getRef());
    }

    @Override
    public int compareTo(Person o) {
        int n = this.age.compareTo(o.age);
        if (n == 0) {
            return this.name.compareTo(o.name);
        }
        return n;
    }

}
