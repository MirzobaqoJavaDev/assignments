package book300;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(2, 24, 1994);
        Date hire  = new Date(3, 2, 1989);
        Employee employee = new Employee("Bob", "Blue", birth, hire);
        System.out.println(employee);
    }
}
