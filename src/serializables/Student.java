package serializables;

import java.io.*;
import java.util.Map;

public class Student implements Serializable {
    @Serial
    private final static long serialVersionUID = -1695473743334433701L;
    private String name;
    private String password;
    private int age;
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
//    @Serial
//    private void writeObject(ObjectOutputStream outputStream) throws IOException {
//        outputStream.defaultWriteObject();
//        String name = "Ab"+getName();
//        outputStream.writeObject(name);
//    }
//    @Serial
//    private void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
//        inputStream.defaultReadObject();
//        String  string = (String) inputStream.readObject();
//        name=string.substring(2);
//
//    }

    public static void main(String[] args) {
        try {
            serialize();
            deserialize();
        } catch (ClassNotFoundException e) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void serialize() throws IOException {
        Student student = new Student();
        student.setName("Ali");
        student.setAge(22);
        student.setPassword("sxsadscde");
        FileOutputStream fileOutputStream = new FileOutputStream("student.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.flush();
        objectOutputStream.close();

    }
    public static void deserialize() throws IOException, ClassNotFoundException {
      FileInputStream fileInputStream = new FileInputStream("student.txt");
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
      Student student = (Student) objectInputStream.readObject();
        System.out.println(student.getName() +" "+ student.getAge()+" "+ student.getPassword());
    }
//
//    @Override
//    public void writeExternal(ObjectOutput out) throws IOException {
//        out.writeObject(name);
//        out.writeInt(age);
//    }
//
//    @Override
//    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//        name= (String) in.readObject();
//        age=in.readInt();
//    }
}
