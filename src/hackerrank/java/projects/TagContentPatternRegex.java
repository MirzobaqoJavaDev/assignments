package hackerrank.java.projects;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.rmi.AlreadyBoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.*;

public class TagContentPatternRegex {
    static int tagContentPattern;
    public static void main(String[] args){
        try {
            int n = Integer.parseInt("ER32R");
            System.out.println("Ali");
            System.out.println(n);
        }catch (ArithmeticException e){
            System.out.println("this not number");
        }

    }
    public void file(String  name){
        try {
            FileReader fileReader = new FileReader(name);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public void malumotOlish() throws SQLException {
        Connection connection = DriverManager.getConnection("fdfdfdfd");
    }

    public int numberOfSpecialChars(String word) {
        System.out.println(tagContentPattern);
        int[] array = new int[66];
        int strLength = word.length();
        for (int i=0; i<strLength;i++){
            array[word.charAt(i)-'A']=word.charAt(i);
        }
        int count = 0;
        int arrayLength = array.length/2;
        for (int i=0; i<arrayLength; i++){
            if (array[i]>0 && array[i+32]>0){
                count++;
            }
        }
        return count;
    }
    public  boolean isGood(int[] nums) {
       int[] array = new int[nums.length-1];
       for (int i :nums){
           array[i]+=1;
       }
       for (int i =1;i<array.length-1;i++){
           if (array[i]!=1){
               return false;
           }
       }
        return array[array.length - 1] == 2;
    }
    public int minMoves(int[] nums, int limit) {
        int minMove = 0;
        if (nums.length==4){
            if (((nums[0]+nums[3])-(nums[1]+nums[2]))==0){
                return 0;
            }else if (((nums[0]+nums[3])-(nums[1]+nums[2]))<limit){
                return 1;
            }else {
                return 2;
            }
        }
        return 1;
    }
    public static int[] findDiagonalOrder(int[][] mat) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int m = mat.length;
        int n =mat[0].length;
        for (int i =0;i<m;i++){
            for (int j=0;j<n;j++){
                int key = i+j;
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(mat[i][j]);
            }
        }
        int[] res = new int[m*n];
        int index = 0;
        for (int i =0;i<m+n-1;i++){
            List<Integer> list = map.get(i);
            if (i%2==0){
                Collections.reverse(list);
            }
            for (int v : list){
                res[index++] = v;
            }
        }
        return res;
    }
    //Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left = n;
        int right = 0;
        for (int i = 0; i < m; i++) {
            for (int j = right; j < left; j++) {
                if (i == 0) {
                    res.add(matrix[i][j]);
                }

            }
            right = left - 1;
            if (i == m - 1) {

            }
        }
        return res;
    }
    public int threeSumClosest(int[] nums, int target) {
        int closestNumber=nums[0]+nums[1]+nums[2];
        int sum=0;
        for (int i=1;i<nums.length-2;i++){
            sum=nums[i]+nums[i+1]+nums[i+2];
            if (Math.abs(sum-target)<Math.abs(closestNumber-target)){
                closestNumber=sum;
            }
        }
        return closestNumber;
    }
}
