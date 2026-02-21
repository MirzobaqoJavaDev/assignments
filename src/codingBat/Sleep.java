package codingBat;

import Array.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class Sleep {

    public boolean sleepIn(boolean weekday, boolean vacation) {
    if (!weekday || vacation){
        return true;
    }
    return false;
    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
      if (!aSmile && !bSmile){
          return true;
      }
      if (aSmile && bSmile){
          return true;
      }
      return false;
    }
    public int sumDouble(int a, int b) {
     if(a==b){
         return 2*(a+b);
     }
     return a+b;
    }
    public boolean parrotTrouble(boolean talking, int hour) {
     if (!talking){
         return false;
     }
     if (talking && (hour<7 || hour>20)){
         return true;
     }
     return false;
    }
    public boolean makes10(int a, int b) {
     if (a==10 || b==10 || (a+b)==10){
         return true;
     }
     return false;
    }
    public boolean nearHundred(int n) {
        return (n >= 90 && n <= 110) || (n >= 190 && n <= 210);
    }
    public boolean posNeg(int a, int b, boolean negative) {
    if ((a>0 && b<0)||(a<0 && b<0)){
        return true;
    }
    if ((a<0 &&b<0)&& negative){
        return true;
    }
    return false;
    }
    public static void notString(String str) {
    String s = str.substring(0,3);
    if (s.equals("not")){
        System.out.println(str);
    }
        System.out.println("not "+str);
    }
    public String missingChar(String str, int n) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        if (i!=n){
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
    }
    public String frontBack(String str) {
    if (str.length()==1){
        return str;
    }
    String last = String.valueOf(str.charAt(0));
    String end = String.valueOf(str.charAt(str.length()-1));
    String s = str.substring(1,str.length()-1);
    return end+last+s;
    }
    public String front3(String str) {
        if (str.length()==0){
            return str;
        }
        if (str.length()>0 && str.length()<3){
            return str+str+str;
        }
    String last =str.substring(0,3);
    return last+last+last;
    }
    public String backAround(String str) {
        String s =str.substring(str.length()-1);
        return s+str+s;
    }
    public boolean or35(int n) {
    return n%3==0||n%5==0;
    }
    public String front22(String str) {
        if (str.length()<2){
            return str;
        }
    String s = str.substring(0,2);
    return s+str+s;
    }
    public boolean startHi(String str) {
    return str.startsWith("hi");
    }
    public boolean icyHot(int temp1, int temp2) {
    return (temp1<0 && temp2>100)||(temp1>100 && temp2<0);
    }
    public boolean in1020(int a, int b) {
        return (a>=10 && a<=20 && b>=10 && b<=20);
    }
    public boolean hasTeen(int a, int b, int c) {
   return (a>=13 && a<=19)||(b>=13 && b<=19)||(c>=13 && c<=19);
    }
    public boolean loneTeen(int a, int b) {
    if (a>=13 && a<=19 && b>=13 && b<=19){
        return false;
    }
    return (a>=13 && a<=19) || (b>=13 && b<=19);
    }
    public String delDel(String str) {
    String first= str.substring(0,1);
    String last = str.substring(1, 4);
    String end = str.substring(4);
    if (last.equals("del")){
        return first+end;
    }
    return str;
    }
    public boolean mixStart(String str) {
    return str.startsWith("ix", 1);
    }
    public String startOz(String str) {
       if (str.startsWith("oz")){
           return "oz";
       }
        if (str.charAt(0)=='o'){
            return "o";
        }
       if (str.charAt(1)=='z'){
           return "z";
       }
       return " ";
    }
    public int intMax(int a, int b, int c) {
     int max = Math.max(a,b);
     if (max<c){
        max = c;
     }
     return max;
    }
    public int close10(int a, int b) {
    int max1= Math.abs(a-10);
    int max2= Math.abs(b-10);
    if (max1==max2){
        return 0;
    }
    if (max1>max2){
        return b;
    }
    return a;

    }
    public boolean in3050(int a, int b) {
      if ((a>=30 && a<=40) && (b>=30 && b<=40))
          return true;
      if ((a>=40 && a<=50) && (b>=40 && b<=50))
          return true;
      return false;

    }
    public int max1020(int a, int b) {
    if ((a>=10 && a<=20) && (b>=10 && b<=20)){
        return Math.max(a,b);
    }
    if (a>=10 && a<=20){
        return a;
    }
    if (b>=10 && b<=20){
        return b;
    }
    return  0;
    }
    public boolean stringE(String str) {
        int a =0;
     for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i)=='e'){
             a++;
         }
     }
     return a==1 || a==3;
    }
    public boolean lastDigit(int a, int b) {
     return (a%10)==(b%10);
    }
    public String endUp(String str) {
     if (str.length()<=3){
         return str.toUpperCase();
     }
     String first = str.substring(0,str.length()-3);
     String last = str.substring(str.length()-3);
     return first+last.toUpperCase();
    }
    public String everyNth(String str, int n) {
        StringBuilder sb = new StringBuilder();
     for (int i=0; i<str.length(); i++){
         if (i%n==0){
             sb.append(str.charAt(i));
         }
     }
     return sb.toString();
    }
    public String stringTimes(String str, int n) {
    StringBuilder sb = new StringBuilder();
    for (int i=0; i<n; i++){
        sb.append(str);
    }
    return sb.toString();
    }
    public String frontTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
     if (str.length()<3){
         for (int i=0; i<n; i++){
             sb.append(str);
         }
         return sb.toString();
     }
     String length3 =str.substring(0,3);
        for (int i=0; i<n; i++){
            sb.append(str);
        }
        return sb.toString();

     }
    int countXX(String str) {
        int count = 0;
     for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i)=='x'){
         count++;
         }
     }
     return count-1;
    }
    boolean doubleX(String str) {
    for (int i = 0; i < str.length()-1; i++) {
        if (str.charAt(i)=='x'){
           if (str.charAt(i+1)=='x'){
               return true;
           }
            return false;
        }
    }
    return false;
    }
    public String stringBits(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i+=2) {
        sb.append(str.charAt(i));
    }
    return sb.toString();
    }
    public String stringSplosion(String str) {
        StringBuilder sb = new StringBuilder();
     for (int i = 0; i <= str.length(); i++) {
         sb.append(str.substring(0,i));
     }
     return sb.toString();
    }
    public int last2(String str) {
        int count = 0;
        if (str.length()<3){
            return 0;
        }
     String last = str.substring(str.length()-2);
     for (int i=str.length()-2; i>=2; i--) {
         if (str.substring(i-2,i).equals(last)){
             count++;
         }
     }
     if (str.length()==4){
         return 2*count;
     }
     return count;
    }
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
      return count;
    }

    public  static void arrayFront9(int[] nums) {
        for (int i=0; i<nums.length; i++){
            if (nums[i] == 9) {
                System.out.println(true);
            }
            if (nums.length==3){
                break;
            }

        }
        System.out.println(false);
    }

    public boolean array123(int[] nums) {
     for (int i=0; i<nums.length-3; i++){
         if (nums[i]==1&&nums[i+1]==2&&nums[i+2]==3) {
             return true;
         }
     }
     return false;
    }
    public int stringMatch(String a, String b) {
        int count = 0;
        int min = Math.min(a.length(),b.length());
    for (int i = 0; i <min; i++) {
        if (a.substring(i,i+1).equals(b.substring(i,i+1))) {
            count++;
        }

    }
    return count;
    }
    public String stringX(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.length()<3){
            return str;
        }
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length()-1; i++) {
            if (!(str.charAt(i)=='x')){
                sb.append(str.charAt(i));
            }
     }
        sb.append(str.length()-1);
        return sb.toString();
    }
    public String altPairs(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i+=3) {
            sb.append(str.charAt(i));
            if (str.length()<=(i+1)){
            sb.append(str.charAt(i+1));
        }
        }
        return sb.toString();
    }
    public String stringYak(String str) {
     StringBuilder sb = new StringBuilder();
     for (int i = 0; i < str.length()-3; i++) {
         if (!(str.substring(i,(i+3)).equals("yak"))){
             sb.append(str.charAt(i));
         }
     }
     return sb.toString();
    }
    public int array667(int[] nums) {
        int count = 0;
      for (int i = 0; i < nums.length-1; i++) {
          if (nums[i]==6 &&(nums[i+1]==6||nums[i+1]==7)){
              count++;
          }
      }
      return count;
    }
    public boolean noTriples(int[] nums) {
        int count = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i]==nums[i+1]&& nums[i+1]==nums[i+2]){
            count++;
        }
    }
    if (count==0){
        return true;
    }
    return false;
    }
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==2 && nums[i+1]==7 && nums[i+2]==1){
                return true;
            }
        }
        return false;
    }
    public String  helloName(String name) {
        return "Hello " + name;
    }
    public String makeOutWord(String out, String word) {
        String first= out.substring(0,2);
        String second= out.substring(2);
        return first+word+second;
    }
    public String extraEnd(String str) {
        String last = str.substring(str.length()-2);
        return last+last+last;
    }
    public String firstTwo(String str) {
     if (str.length()<3){
         return str;
     }
     return str.substring(0,2);
    }
    public String firstHalf(String str) {
    int a = str.length()/2;
    return str.substring(0,a);
    }
    public String withoutEnd(String str) {
    return str.substring(1,str.length()-1);
    }
    public String nonStart(String a, String b) {
    return a.substring(1)+b.substring(1);
    }
    public String left2(String str) {
    if (str.length()<3){
        return str;
    }
    return str.substring(str.length()-2)+str.substring(0,str.length()-2);
    }
    public String theEnd(String str, boolean front) {
    if (front){
        return String.valueOf(str.charAt(0));
    }
    return str.substring(str.length()-1);
    }
    public String withouEnd2(String str) {
    if (str.length()<3){
        return "";
    }
    return str.substring(1,str.length()-1);
    }
    public String middleTwo(String str) {
    int length = str.length()/2;
    return str.substring(length-1,length+1);
    }
    public boolean endsLy(String str) {
        if (str.length()<2){
            return false;
        }
        return str.endsWith("ly");
    }
    public String nTwice(String str, int n) {
     return str.substring(0,n)+str.substring(str.length()-n);
    }
    public String twoChar(String str, int index) {
     if (str.length()<=index || index==0){
         return str.substring(0,2);
     }
     return str.substring(index,index+2);
    }
    public String middleThree(String str) {
    if(str.length()<=3){
        return str;
    }
    int length = str.length()/3;
    return str.substring(length, length+4);
    }
    public boolean hasBad(String str) {
    if (str.length()<3){
        return false;
    }
        return str.startsWith("bad") || str.startsWith("bad", 1);
    }
    public String atFirst(String str) {
    if (str.length()==1){
        return str+"@";
    }
    if (str.isEmpty()){
        return "@@";
    }
    return str.substring(0,2);
    }
    public static String lastChars(String a, String b) {
        if (a.isEmpty()&&b.isEmpty()){
            return "@@";
        }
    if (a.isEmpty()){
        return "@"+b.substring(b.length()-1);
    }
    if (b.isEmpty()){
        return a.charAt(0)+"@";
    }
    return a.charAt(0)+b.substring(b.length()-1);
    }
    public String conCat(String a, String b) {
        if (a.isEmpty()){
            return b;
        }
        if (b.isEmpty()){
            return a;
        }
    if (a.charAt(a.length()-1)==b.charAt(0)){
        return a+b.substring(1);
    }
    return a+b;
    }
    public String lastTwo(String str) {
     if (str.length()<2){
         return str;
     }
     return str.substring(0,str.length()-2)+str.charAt(str.length()-1)+str.substring(str.length()-2);
    }
    public String seeColor(String str) {
     if (str.startsWith("red")){
         return "red";
     }
     if (str.startsWith("blue")){
         return "blue";
     }
     return "";
    }
    public boolean frontAgain(String str) {
    if (str.length()==2){
        return true;
    }
    return str.substring(0,2).equals(str.substring(str.length()-2));
    }
    public String minCat(String a, String b) {
        int h = Math.abs(a.length()-b.length());
    if (a.length()>b.length()){
        return a.substring(h)+b;
    }else {
        return b.substring(h)+a;
    }
    }
    public String extraFront(String str) {
        if (str.length()<2){
            return str+str+str;
        }
        String first= str.substring(0,2);
        return first+first+first;
    }
    public String without2(String str) {
        if (str.length()==2){
            return "";
        }
     if (str.substring(0,2).equals(str.substring(str.length()-2))){
         return str.substring(2);
     }else {
         return str;
     }
    }
    public String deFront(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str.startsWith("a")){
             stringBuilder.append("a");
        }
        if (str.startsWith("b",1)){
            stringBuilder.append("b");
        }

        stringBuilder.append(str.substring(2));
        return stringBuilder.toString();
    }
    public String startWord(String str, String word) {
        if (str.length()<2){
            return "";
        }
    StringBuilder result = new StringBuilder();
    result.append(str.charAt(0));
    for (int i = 1; i < word.length(); i++) {
        if (str.charAt(i)==word.charAt(i)){
            result.append(str.charAt(i));
        }
    }
    return result.toString();
    }
    public String withoutX(String str) {
    StringBuilder stringBuilder = new StringBuilder();
    if (!str.startsWith("x")){
        stringBuilder.append(str.charAt(0));
    }
    stringBuilder.append(str, 1, str.length()-1);
    if (!str.endsWith("x")){
        stringBuilder.append(str.substring(str.length()-1));
    }
    return stringBuilder.toString();
    }
    public String withoutX2(String str) {
    StringBuilder stringBuilder = new StringBuilder();
    if (!str.startsWith("x")){
        stringBuilder.append(str.charAt(0));
    }
    if (!str.startsWith("x",1)){
        stringBuilder.append(str.charAt(1));
    }
    stringBuilder.append(str.substring(2));
    return stringBuilder.toString();
    }
    public boolean firstLast6(int[] nums) {
   return nums[0]==6 || nums[nums.length-1]==6;
    }
    public int[] makePi() {
    int[] nums = new int[3];
    for (int i = 0; i <3; i++) {
        nums[i]=makePi()[i];
    }
    return nums;
    }
    public boolean commonEnd(int[] a, int[] b) {
    return a[0]==b[0] || a[a.length-1]==b[a.length-1];
    }
    public int sum3(int[] nums) {
     return nums[0]+nums[1]+nums[2];
    }
    public int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};

    }
    public int[] maxEnd3(int[] nums) {
    return nums[0]>nums[2]? new int[]{nums[0],nums[0],nums[0]}:new int[]{nums[2],nums[2],nums[2]};
    }
    public int sum2(int[] nums) {
    if (nums.length<2){
        return 0;
    }
    return nums[0]+nums[1];
    }
    public int[] makeEnds(int[] nums) {
    return nums.length==1? new int[]{nums[0]} : new int[]{nums[0],nums[nums.length-1]};
    }
    public boolean has23(int[] nums) {
    return nums[0]==2||nums[0]==3||nums[1]==2||nums[1]==3;
    }



    public static void main(String[] args) {
        IntFunction<int[]> arrayClear= int[]::new;

        int[] array = arrayClear.apply(5);
        System.out.println("Massif yaratish "+array.length);
     }

    }


