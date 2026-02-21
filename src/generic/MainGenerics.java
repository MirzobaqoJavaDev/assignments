package generic;

import java.io.*;
import java.util.*;

public class MainGenerics {
    public static void main(String[] args)  {
        System.out.println(heightChecker1(new int[]{1,1,4,2,1,3}));

    }
    public int thirdMax(int[] nums) {
        int firstMax=0;
        int secondMax=0;
        int thirdMax=0;
        boolean exist =false;
        if (nums.length==1) return nums[0];
        if (nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        return 0;

    }
    public  static int heightChecker1(int[] heights){
       int[] array = new int[101];

       for (int n:heights){
           array[n]++;
       }

       int index=0;
       int result=0;

       for (int i=1;i<=100;i++){
           while (array[i]>0){
               if (heights[index]!=i){
                   result++;
               }
               index++;
               array[i]--;
           }
       }
       return result;
    }

    public  static int heightChecker(int[] heights) {
        int index = 0;
        int length=0;
        int max = heights[0];
        int[] array = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            int count=0;
            array[length++]=heights[i];
            for (int j = 0; j < i ; j++) {
                if (array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;

                }
            }
            if (heights[i] > max) {
                max = heights[i];
                index = i;
            }
        }
        int count = 0;
        for (int i = 0 ; i < heights.length; i++) {
            if (array[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }

    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] % 2 > nums[right]) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            if (nums[left] % 2 == 0) left++;
            if (nums[right] % 2 == 1) right--;
        }
        return nums;
    }

    public static void test(int age) {
        if (age < 18) {
            throw new RuntimeException("Ukam kichiksan");
        }
        System.out.println(age);
    }

    public static void mathException() {
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new ArithmeticException("B equal zero");
        } else {
            System.out.println(a / b);
        }
    }

    static class InnerStaticClass {
        public void print() {
            System.out.println("static class");
        }
    }

    public static void calculator(int a, int b) {
        System.out.println(a + b);
    }

    public void print() {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2) * -1;
            }
        };
        List<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(45);
        list.add(6);
        list.add(89);
        list.sort(comparator);
        System.out.println(list);
    }


    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }


    public static void serialize() throws IOException {
        Student student = new Student();
        student.setName("Ali");
        student.setAge(12);
        student.setPassword("dfhjdhjhdj");

        FileOutputStream fileOutputStream = new FileOutputStream("student.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(student);

    }

    public static void deSerialize() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("student.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student) objectInputStream.readObject();
        System.out.println(student.getName() + " " + student.getAge() + " " + student.getPassword());

    }
}
