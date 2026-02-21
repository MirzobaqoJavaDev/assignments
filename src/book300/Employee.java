package book300;

public class Employee {
    private String fistName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    public Employee(String fistName, String lastName, Date birthDate, Date hireDate) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

   public String toString(){
        return String.format("%s,  %s Hired: %s Birthday: %s", lastName, fistName,  hireDate, birthDate);
   }
}
