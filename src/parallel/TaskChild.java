package parallel;

public class TaskChild  {
    private String fullName;
    public TaskChild(String fullName){
        this.fullName=fullName;
    }

    public TaskChild() {
        System.out.println("Task child");
    }
}
