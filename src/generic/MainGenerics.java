package generic;

import java.io.*;
import java.util.*;

public class MainGenerics {
    public static void main(String[] args)  {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 7, 3, 6, 9,9})));


    }
    public static int[] plusOne(int[] digits) {
        int count=0;
       for (int i=digits.length-1;i>=0;i--){
           if (digits[i]==9){
               digits[i]=0;
               count++;
           }else {
               digits[i]+=1;
               break;
           }
       }
       if (count==digits.length){
           int[] array = new int[digits.length+1];
           array[0]=1;
           return array;
       }

       return digits;
    }

    public int dominantIndex(int[] nums) {
       int firstMax=Integer.MIN_VALUE;
       int secondMax=Integer.MIN_VALUE;
       int index=0;

       for (int i=0;i<nums.length;i++){
           if (nums[i]>firstMax){
               secondMax=firstMax;
               firstMax=nums[i];
               index=i;
           }else if (nums[i]>secondMax && nums[i]<firstMax){
               secondMax=nums[i];
           }
       }
       return firstMax>2*secondMax?index:-1;
    }

    public static int pivotIndex(int[] nums) {
        int totalSum =0;
        for (int n:nums){
            totalSum+=n;
        }
       int leftSum=0;
        for (int i=0;i<nums.length;i++){
            int rightSum = totalSum-leftSum-nums[i];
            if (leftSum==rightSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
    public int[] sortedSquares(int[] nums) {
        int[] array = new int[nums.length];
        int leftIndex=0;
        int rightIndex=nums.length-1;
        int arrayIndex=nums.length-1;
        while (leftIndex<=rightIndex){
            int leftSquare=nums[leftIndex]*nums[leftIndex];
            int rightSquare = nums[rightIndex]*nums[rightIndex];
            if (leftSquare<rightSquare){
                array[arrayIndex]=rightSquare;
                rightIndex--;
            }else {
                array[arrayIndex]=leftSquare;
                leftIndex++;
            }
            arrayIndex--;
        }
        return array;
    }

    public static boolean isValid(String s) {
        if (s.length()%2!=0){
            return false;
        }
        Map<Integer,Integer> map = new HashMap<>();
        map.put(91,0);
        map.put(93,0);
        map.put(40,0);
        map.put(41,0);
        map.put(123,0);
        map.put(125,0);
        for (int i =0;i<s.length();i++){
            if (map.get(91)==s.charAt(i)){
                int value =map.get(91);
                value++;
                map.put(91,value);
            }else if (map.get(93)==s.charAt(i)) {
                int value = map.get(93);
                value++;
                map.put(93, value);
            }else if (map.get(40)==s.charAt(i)){
                int value =map.get(40);
                map.put(40,++value);
            }else if (map.get(41)==s.charAt(i)){
                int value =map.get(41);
                map.put(41,++value);
            }else if (map.get(123)==s.charAt(i)){
                int value =map.get(123);
                map.put(123,++value);
            }else if (map.get(125)==s.charAt(i)){
                int value =map.get(125);
                map.put(125,++value);
            }
//            if (map.containsKey((int)s.charAt(i))){
//                int value = map.get((int)s.charAt(i));
//                map.put((int)s.charAt(i),value++);
//            }
        }
        if ((!map.get(91).equals(map.get(93))) || (!Objects.equals(map.get(40), map.get(41)))||(!Objects.equals(map.get(123), map.get(125)))){
            return false;
        }
        return true;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        List<Integer> result = new ArrayList<>();
        int[] array= new int[100001];
        for (int n :nums){
            array[n]++;
        }
        for (int i=1;i<=length;i++){
            if (array[i]==0){
                result.add(i);
            }
        }
    return result;

    }
    public  static int thirdMax(int[] nums) {
        Long firstMax=null;
        Long secondMax=null;
        Long thirdMax=null;
        for (long n:nums){

            if ((firstMax!=null &&firstMax == n) ||(secondMax!=null && secondMax==n) ||(thirdMax!=null &&thirdMax==n)) continue;

            if (firstMax==null || n>firstMax){
                thirdMax=secondMax;
                secondMax=firstMax;
                firstMax=n;
            } else if (secondMax==null || n>secondMax) {
                thirdMax=secondMax;
                secondMax=n;
            } else if (thirdMax==null || n>thirdMax) {
                thirdMax=n;
            }
        }
        return thirdMax==null? firstMax.intValue():thirdMax.intValue();

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


//    public int[] sortArrayByParity(int[] nums) {
//        int left = 0;
//        int right = nums.length - 1;
//        while (left < right) {
//            if (nums[left] % 2 > nums[right]) {
//                int temp = nums[left];
//                nums[left] = nums[right];
//                nums[right] = temp;
//            }
//            if (nums[left] % 2 == 0) left++;
//            if (nums[right] % 2 == 1) right--;
//        }
//        return nums;
//    }

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



    }

