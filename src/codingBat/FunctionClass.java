package codingBat;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Function;

public class FunctionClass implements Function<Integer, String> {
    @Override
   public String apply(Integer t){
       return Integer.toString(t*t);
   }



    public int[] makeLast(int[] nums) {
    int[] result = new int[2*nums.length];
    for (int i = 0; i < nums.length-1; i++) {
        result[i]=0;
    }
    result[result.length-1]=nums[nums.length-1];
    return result;
    }

    public boolean double23(int[] nums) {
    if (nums.length<2){
        return false;
    }
    return (nums[0]==2&&nums[1]==2)||(nums[0]==3&&nums[1]==3);
    }
    public int[] fix23(int[] nums) {
       for (int i = 0; i < nums.length-1; i++) {
           if (nums[i]==2&&nums[i+1]==3){
               nums[i+1]=0;
           }
       }
       return nums;
    }
    public int start1(int[] a, int[] b) {
     int count = 0;
     if (a.length>0) {
         if (a[0] == 1)
             count++;
     }
     if (b.length>0) {
         if (b[0] == 1)
             count++;
     }
     return count;
    }
    public int[] biggerTwo(int[] a, int[] b) {
      int aSum = a[0]+a[1];
      int bSum = b[0]+b[1];
      if (aSum==bSum){
          return a;
      }
      if (aSum>bSum){
          return a;
      }else {
          return b;
      }
    }
    public int[] makeMiddle(int[] nums) {
     int h = nums.length/2;
     return new int[]{nums[h],nums[h+1]};
    }
    public int[] plusTwo(int[] a, int[] b) {
     return new int[]{a[0],a[1],b[0],b[1]};
    }
    public int[] swapEnds(int[] nums) {
    int first = nums[0];
    nums[0]=nums[nums.length-1];
    nums[nums.length-1]=first;
    return nums;
    }
    public int[] midThree(int[] nums) {
        int h = nums.length/3;
        return new int[]{nums[h],nums[h+1],nums[h+2]};
    }
    public int maxTriple(int[] nums) {
    if (nums.length<2){
        return nums[0];
    }
    if (nums.length==2){
        return Math.max(nums[0],nums[1]);
    }
    int max = Math.max(nums[0], nums[nums.length-1]);
    return Math.max(max, nums[nums.length/2]);
    }
    public int[] frontPiece(int[] nums) {
    if (nums.length<3){
        return nums;
    }
    return  new  int[]{nums[0], nums[1]};
    }

    public boolean unlucky1(int[] nums) {
        if (nums.length<2){
            return false;
        }
        if (nums.length==2&&nums[0]==1&&nums[1]==3){
            return true;
        }else if (nums.length==2){
            return false;
        }

     return (nums[0]==1 && nums[1]==3)||(nums[1]==1&& nums[2]==3)||
             (nums[nums.length-2]==1 && nums[nums.length-1]==3)||
             (nums[nums.length-3]==1&& nums[nums.length-2]==3);
    }
    public int[] make2(int[] a, int[] b) {
    if (a.length>3){
        return new int[]{a[0],a[1]};
    }
    if (a.length==1){
        return new int[]{a[0],b[0]};
    }
    return new int[]{b[0],b[1]};
    }
    public int[] front11(int[] a, int[] b) {
        if (a.length>=1&&b.length>=1){
            return new int[]{a[0],b[0]};
        }else if (a.length!=1 && b.length>1){
            return new int[]{b[0],b[1]};
        }else if (a.length>1&& b.length!=1){
            return new int[]{a[0],a[1]};
        }else if (a.length==1){
            return a;
        }else {
            return b;
        }
    }
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars>=40 && cigars<=60){
            return true;
        }
        return (isWeekend && cigars>=60);
    }
    public String doubleChar(String str) {
        StringBuilder sb = new StringBuilder();
      for (int i = 1; i < str.length(); i++) {
          sb.append(str.substring(i-1,i));
          sb.append(str.substring(i-1,i));
      }
      return str.toString();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(76);
        queue.offer(10);
        queue.offer(54);
        queue.offer(8);
        System.out.println("first Queue: "+queue);
        System.out.println("poll Queue: "+queue.poll());
        System.out.println("remove Queue: "+queue.remove());
        System.out.println("Element Queue: "+queue.element());
        System.out.println("secound Queue: "+queue);
     }
    public boolean bobThere(String str) {
     for (int i = 0; i < str.length()-2; i++) {
         if (str.charAt(i)=='b'&&str.charAt(i+2)=='b'){
             return true;
         }
     }
     return false;
    }
    public static boolean endOther(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        if (aLength>bLength){
            String temp = a.substring(aLength-bLength);
            return b.toLowerCase().equals(temp.toLowerCase());
        }
        if (bLength>aLength){
            String temp1 = b.substring(bLength-aLength);
            if (b.toLowerCase().equals(temp1.toLowerCase())){
                System.out.println(true);
            }
        }
        return false;
    }
    public boolean xyzThere(String str) {
        if (str.startsWith("xyz")){
            return true;
        }
        for (int i = 1; i < str.length()-1; i++) {
            if (str.charAt(i)=='x'&& str.charAt(i+1)=='y'&&str.charAt(i+2)=='z'&&str.charAt(i-1)!='.'){
                return true;
            }
        }
        return false;
    }
    public int countHi(String str) {
        int count = 0;
    for (int i = 0; i < str.length()-1; i++) {
        if (str.contains("hi")){
            count++;
        }
    }
    return count;
    }
    public boolean catDog(String str) {
    int count = 0;
    int count1 = 0;
    for (int i = 0; i < str.length()-2; i++) {
        if (str.charAt(i)== 'c' && str.charAt(i+1)=='a'&& str.charAt(i+2)=='d'){
            count++;
        }
        if (str.charAt(i)== 'd' && str.charAt(i+1)=='o'&& str.charAt(i+2)=='g'){
            count1++;
        }
    }
    return count==count1;

    }
    public int countCode(String str) {
     int count = 0;
     for (int i = 0; i < str.length()-3; i++) {
         if (str.charAt(i)=='c'&&str.charAt(i+1)=='o'&& str.charAt(i+3)=='e'){
             count++;
         }
     }
     return count;
    }

    public static int getAge(){
        System.out.println("Please enter a age");
        Scanner scanner = new Scanner(System.in);
      return scanner.nextInt();
    }
    public static String getName(){
        System.out.println("Please enter a name");
        Scanner scanner = new Scanner(System.in);
       return   scanner.next();

    }public static String getLastName(){

return null;
    }

}
