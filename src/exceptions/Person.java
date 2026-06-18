package exceptions;

public class Person {
    private int age;
    public void setAge(int age) throws YoshXatoException {
        if (age<0)
            throw new YoshXatoException("Yosh xato: "+age);
        this.age = age;
    }

    public static void main(String[] args) throws YoshXatoException {
    String s = "Ali";


    }
    public static int totalWaviness(int num1, int num2) {
        int count =0;

        for (int i=num1; i<=num2; i++){
            String str = String.valueOf(i);
            int len = str.length();
            if (len<=2)
                continue;
            for (int j=0;j<len-2;j++){
                char ch = str.charAt(j);
                char ch2 = str.charAt(j+1);
                char ch3 = str.charAt(j+2);
                if ((ch2>ch && ch2>ch3)||(ch2<ch && ch2<ch3)){
                    count++;
                }
            }
        }
        return count;
    }

}
