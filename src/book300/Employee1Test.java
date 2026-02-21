package book300;

public class Employee1Test {
    public static void main(String[] args) {
        System.out.printf("Employees before instantiation:%d%n",
                Employee1.getCount());
        Employee1 e1 = new Employee1("Susan", "Baker");
        Employee1 e2 = new Employee1("Bob", "Blue");

        System.out.printf("%n Employees after instantiation:%n");
        System.out.printf("via e1.getCount(): %d%n", e1.getCount());
        System.out.printf("via e2.getCount(): %d%n", e2.getCount());
        System.out.printf("via Employee.getCount: %d%n", Employee1.getCount());

        System.out.printf("%n Employee 1: %s  %s%n Employee 2: %s %s%n",
                e1.getFirstName(), e1.getLastName(),
                e2.getFirstName(), e2.getLastName());
    }
}
