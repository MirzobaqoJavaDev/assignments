package kitob1;

public class Student {
    private String name;
    private double average;

    public Student(String name, double average) {
        this.name = name;
        if (average>0.0)
            if (average<=100.0)
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double studentAverage) {
        if (average>0.0)
            if (average<=100.0)
        this.average = average;
    }

    public String getLetterGetter(){
        String letterGetter = "";
        if (average>=90.0)
            letterGetter = "A";
        else if (average>=80.0)
            letterGetter = "B";
        else if (average>= 70.0)
             letterGetter = "C";
        else if (average>=60)
            letterGetter = "D";
        else letterGetter = "F";
        return letterGetter;

    }
}
