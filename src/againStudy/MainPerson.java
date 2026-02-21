package againStudy;

public class MainPerson {


    public MainPerson() {
        System.out.println("Constructor");
    }

    final Person person = new Person("Ali", 23);


    int variableGlobal;

    public static void main(String[] args) {
        GenericExample genericExample = new GenericExample();
        Integer[] integers = {12, 43, 655, 78};
        String[] strings = {"ds", "dfds", "hello", "alike"};
        Double[] doubles = {12.09, 45.8, 65.87};


        genericExample.print(integers);
        genericExample.print(strings);
        genericExample.print(doubles);
        System.out.println("_____________");


        System.out.println(genericExample.lastElement(integers));
        System.out.println(genericExample.lastElement(strings));
        System.out.println(genericExample.lastElement(doubles));
        System.out.println("----------");
        System.out.println(genericExample.isValueEqual(121,"120"));


    }

    public class InnerClass {
        int age = 12;
    }

    void global() {
        System.out.println(variableGlobal);
    }

    void test() {

        Runnable r1 = () -> {
            System.out.println(this);
        };
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(this);
            }
        };
        System.out.println(r1);
        System.out.println(runnable);
    }


    @Override
    public String toString() {
        return "MainPerson{}";
    }

    public static int[] replaceElements(int[] arr) {
        int afterReplace = arr[arr.length - 1];
        int replace = 0;
        arr[arr.length - 1] = -1;
        if (arr.length > 1) {
            replace = arr[arr.length - 2];
            arr[arr.length - 2] = afterReplace;

        }
        if (afterReplace > replace) {
            replace = afterReplace;
        }

        if (arr.length > 2) {
            for (int i = arr.length - 3; i >= 0; i--) {
                afterReplace = arr[i];
                arr[i] = replace;
                if (replace < afterReplace) {
                    replace = afterReplace;
                }
            }
        }
        return arr;
    }

    public int[] replaceElementsEasy(int[] arr) {
        int maxRight = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight, current);
        }
        return arr;
    }
}
