package Array;

import java.util.Arrays;

public class OxiriO {
    public static void main(String[] args) {
        dividesSelf(13);

    }


    public static boolean dividesSelf(int n) {
        while (n > 0) {
            int x = n % 10;
            if (x == 0 && n % x != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[i] = nums[i];
            }
        }
        return result;
    }

    public int powerN(int base, int n) {
     return (int) Math.pow(base,n);
    }
    public int countX(String str) {
        int b =0;
    for (int i=0; i<str.length(); i++){
        if (str.charAt(i)=='i'){
            b++;
        }
    }
    return b;
    }
    public int countHi(String str) {
        int a=0;
     for (int i=0; i<=str.length()-2; i++){
         if(str.substring(i,i+2).equals("hi")){
             a++;
         }
     }
     return a;
    }
    public String changeXY(String str) {
     return str.replace('x','y');
    }


    public String changePi(String str) {
  return str.replace("pi", "3.14");
    }
    public String noX(String str) {
   return   str.replace("x", "");
    }
    public boolean array6(int[] nums, int index) {
        for (int i=0; i<nums.length; i++){
            if (nums[i]==6){
                return true;
            }
        }
        return false;
    }
    public int array11(int[] nums, int index) {
        int a=0;
       for (int i=0; i<nums.length; i++){
           if (nums[i]==11){
               a++;
           }
       }
       return a;
    }
    public boolean array220(int[] nums, int index) {
        for (int i=0; i<nums.length; i++){
           if (nums[i]*10==nums[i+1])
                    return true;

                }
        return false;
    }


//    public int count11(String str) {
////       if(str.length()<2){
////           return 0;
////       }
////       int a=0;
////       for (int i=0; i<str.length(); i++){
////           if(str.charAt(i)=='1' && (str.charAt(i+1)=='1'|| str.charAt(i+3)!='1'){
////               a++;
////           }
////
////       }
////       return a;
//    }
    public String stringClean(String str) {
        if (str.length()<=1){
            return str;
        }
        char first = str.charAt(0);
        char second = str.charAt(1);
        if (first==second){
            return stringClean(str.substring(1));
        }else {
            return first + stringClean(str.substring(1));
        }
    }
    public int countHi2(String str) {
   if (str.length()<2){
       return 0;
   }
         if (str.length()>3 && str.substring(0, 3).equals("xhi") ){
             return countHi2(str.substring(3));
         }else if (str.substring(0, 2).equals("hi")){
             return 1+countHi2(str.substring(2));
         }else {
             return countHi2(str.substring(1));
         }
    }


    public String allStar(String str) {
    if (str.length()<1){
        return str;
    }
    return str.charAt(0)+"*"+allStar(str.substring(1));
    }
}

