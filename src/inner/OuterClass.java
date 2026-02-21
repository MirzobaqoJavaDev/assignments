package inner;

import java.util.*;

public class OuterClass implements Comparable<OuterClass> {
    private Long id;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "OuterClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OuterClass that)) return false;
        return age == that.age && Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    public OuterClass(Long id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
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

    public static void main(String[] args) {
        List<OuterClass> list = new ArrayList<>();
        list.add(new OuterClass(1L, "Ali", 12));
        list.add(new OuterClass(2L, "Vali", 26));
        list.add(new OuterClass(3L, "Gani", 6));
        list.add(new OuterClass(4L, "Ahmad", 33));
        Collections.sort(list);
        for (OuterClass o :list){
            System.out.println(o);
        }


    }

    public static boolean balance() {
        Stack<Character> stack = new Stack<>();
        String expr = "{[()])";
        for (char ch : expr.toCharArray()) {
            // ochiq qavs bo‘lsa push qilamiz
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                stack.pop(); // yopilganiga mosini olib tashlaymiz
            }
        }
        System.out.println(stack.isEmpty()); // true => balanslangan
        return stack.isEmpty();
    }

    public static void hello() throws InterruptedException {

    }


    public static void dinner(int a, int b) {
        if (b == 0) {
            throw new NotSmartException("B ga nol berish mumkun emas");
        } else {
            System.out.println(a / b);
        }
    }

    @Override
    public int compareTo(OuterClass o) {
        return this.age - o.age;
    }
//    public int[] replaceElements(int[] arr) {
//        int end= arr[arr.length-1];
//        int end1 = arr[arr.length-2];
//        arr[arr.length-1]=-1;
//        arr[arr.length-2]=end;
//        for (int i= arr.length-3; i>0; i--){
//       if (end1<arr[i]){
//           arr[i]=
//       }
//
//        }
//    }
}
