package reference;

public class HelloTeacher {
    protected String name;

    public HelloTeacher(){
        this("Teacher");
        System.out.println("dcsvdfvdfvdfdf");
    }
    protected HelloTeacher(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "HelloTeacher{" +
                "name='" + name + '\'' +
                '}';
    }


    public static void main(String[] args) {
        HelloTeacher helloTeacher = new HelloTeacher();
        System.out.println(helloTeacher);
    }
}
