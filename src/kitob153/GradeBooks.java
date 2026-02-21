package kitob153;

public class GradeBooks {
    private  String courseName;
    private  int[] grade;

    public GradeBooks(String courseName, int[] grade) {
        this.courseName = courseName;
        this.grade = grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int[] getGrade() {
        return grade;
    }

    public void setGrade(int[] grade) {
        this.grade = grade;
    }

    public  void processGrades(){
  outputGrades();
        System.out.printf("%nClass average is %.2f%n", getAverage());
        System.out.printf("Lowest grade is %d%n Highest grade is %d%n%n", getMinimum(), getMaximum());

        outputBarChar();
    }

    public int  getMinimum(){
        int lowGrade = grade[0];
        for (int grad : grade) {
            if (grad < lowGrade)
                lowGrade = grad;
        }
        return lowGrade;
    }
    public int getMaximum(){
    int highGrade = grade[0];
    for (int grad : grade){
        if (grad>highGrade)
            highGrade=grad;
    }
    return highGrade;
    }

    public double getAverage(){
        int total = 0;
        for (int grad :grade)
            total += grad;
        return  (double) total/grade.length;
    }
    public void outputBarChar(){
        System.out.println("Grade distribution");
        int[] frequency = new int[11];
        for (int grad :grade)
            ++frequency[grad/10];
        for (int count =0; count<frequency.length; count++){
            if (count==10)
                System.out.printf("%5d: ", 100 );
            else System.out.printf("%02d-%02d: ", count*10, 9+10*count);

            for (int star =0; star<frequency[count]; star++)
                System.out.print("*");

            System.out.println();

        }
    }
   public void outputGrades(){
       System.out.printf("The grades are: %n%n");
       for (int student =0; student<grade.length; student++)
           System.out.printf("Student %2d: %3d%n", student+1, grade[student]);
   }
}
