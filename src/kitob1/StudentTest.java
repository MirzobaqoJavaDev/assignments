package kitob1;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student("Ravshan", 96.3);
        Student student2 = new Student("Latif", 86.3);

        System.out.printf("%s`s latter grade is %s%n", student1.getName(), student1.getLetterGetter());
        System.out.printf("%s`s letter grade is %s%n", student2.getName(), student2.getLetterGetter());
    }
}
