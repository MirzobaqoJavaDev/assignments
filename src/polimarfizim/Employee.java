package polimarfizim;

import reference.HelloTeacher;

import java.util.*;

public   abstract class Employee extends HelloTeacher{
    private  String firstName;
    private  String lastName;
    private  String socialSecurityNumber;
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public Employee(){

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    @Override
    public String toString(){
        return String.format("%s %s%n social security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }
    public abstract double earnings();


    public static boolean dividesSelf(int n) {

        int count=0;
        int number=n;
        String stringNumber = String.valueOf(n);
        for (int i=0; i<stringNumber.length(); i++){
            count=n%10;
            if (count==0 || number%count!=0){
                return false;
            }
            n=n/10;
        }
        return true;
    }
    public int[] copyEvens(int[] nums, int count) {
    int[] result = new int[count];
    int count1=count;
    int length=0;
        for (int num : nums) {
            if (count1 == 0) {
                break;
            }
            if (num % 2 == 0) {
                result[length++] = num;
                count1--;
            }
        }
    return result;
    }
    public int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        int count1=count;
        int length=0;
        for (int num : nums) {
            if (count1==0) {
                break;
            }
            if (isEndy(num)){
                result[length++] = num;
                count1--;
            }
        }
        return result;
    }
    public boolean isEndy(int num){
        return (num>=0 && num<=10) ||(num>=90 && num<=100);
    }
    public int matchUp(String[] a, String[] b) {
    int count =0;
    for (int i=0; i<a.length;i++){

        if (!a[i].isEmpty() && !b[i].isEmpty() &&a[i].charAt(0)==b[i].charAt(0)){
            count++;
        }
    }
    return count;
    }
    public static int[] fix45(int[] nums) {
        int n = nums.length;
        int[] result = Arrays.copyOf(nums, n);
        int fiveIndex = 0;

        for (int i = 0; i < n - 1; i++) { // n - 1, chunki i + 1 da chiqmasligi kerak
            if (result[i] == 4) {
                while (fiveIndex < n && (result[fiveIndex] != 5 || (fiveIndex > 0 && result[fiveIndex - 1] == 4))) {
                    fiveIndex++;
                }
                if (fiveIndex < n) { // Check bounds before swapping
                    int temp = result[i + 1];
                    result[i + 1] = 5;
                    result[fiveIndex] = temp;
                }
            }
        }
        return result;
    }


    public String name(String name){
        return "";
    }
    public Character name(String name,int a){
        return 'm';
    }


    public int findMaxConsecutiveOnes(int[] nums) {
        int result=0;
        int total=0;
     for (int i=0; i<nums.length;i++){
       if (nums[i]==1){
           result++;
       }else {
           result=0;
       }
       if (result>total){
           total=result;
       }
     }
     return total;
    }
    public void duplicateZeros(int[] arr) {
        int result = arr[0];
        int count=0;
        for (int i=0; i<arr.length;i++){
            if (arr[i]==0 && i<arr.length-1){
               result=arr[i+1];
               arr[i+1]=0;
               count++;
            }else {
                arr[count]=arr[i];
            }
        }

    }
    public boolean validMountainArray(int[] arr) {
       int n = arr.length;
       if (n<3){
           return false;
       }
       int i=0;
       while (i+1<n && arr[i]<arr[i+1]){
           i++;
       }
       if (i==0 || i==n-1){
           return false;
       }
       while (i+1<n && arr[i]>arr[i+1]){
           i++;
       }
       return i==n-1;
    }
    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")){
            map.put("b", map.get("a"));
            map.remove("a");
        }
        return map;
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")){
            map.put("b",map.get("a"));
        }
        map.remove("c");
        return map;
    }
    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")){
            String aValue = map.get("a");
            String bValue = map.get("b");
            map.put("ab",aValue+bValue);
        }
        return map;
    }
    public Map<String, String> topping1(Map<String, String> map) {
        map.put("bread","butter");
        if (map.containsKey("ice cream")){
            map.put("ice cream","cherry");
        }
        return map;
    }
    public Map<String, String> topping2(Map<String, String> map) {
        if (map.isEmpty()){
        map.put("yogurt", map.getOrDefault("ice cream", "salt"));
        if (map.containsKey("spinach")){
            map.put("spinach","nuts");
        }
        }
        return map;
    }
    public Map<String, String> topping3(Map<String, String> map) {
    if (map.containsKey("salad")){
        map.put("spinach",map.get("salad"));
    }
    if (map.containsKey("potato")){
        map.put("fries",map.get("potato"));
    }
    return map;
    }

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (Objects.equals(map.get("a"), map.get("b"))){
            map.remove("a");
            map.remove("b");
        }
        return map;
    }
    public Map<String, String> mapAB3(Map<String, String> map) {
        if (!map.containsKey("a") && map.containsKey("b")){
            map.put("a", map.get("b"));
        }
        if (!map.containsKey("b") && map.containsKey("a")){
            map.put("b", map.get("a"));
        }
        return map;
    }
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")){
            return map;
        }else if (map.containsKey("b") && !map.containsKey("a")){
            return map;
        }else if (!map.containsKey("a") && !map.containsKey("b")){
            return map;
        }else if (map.get("a").length()>map.get("b").length()){
            map.put("c",map.get("a"));
        }else if (map.get("a").length()<map.get("b").length()){
            map.put("c",map.get("b"));
        }else {
            map.put("a","");
            map.put("b","");
        }
        return map;
    }
    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map= new HashMap<>();
        for (String s:strings){
           map.put(s, 0);
        }
        return map;
    }
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map= new HashMap<>();
        for (String s:strings){
            map.put(s, s.length());
        }
        return map;
    }
    public Map<String, String> pairs(String[] strings) {
        Map<String, String > map= new HashMap<>();
        for (String s:strings){
            String start = s.substring(0,1);
            String end =s.substring(s.length()-1);
            map.put(start, end);
        }
        return map;
    }
    public  static Map<String, Integer> wordCount(String[] strings) {
        Map<String,Integer> map = new HashMap<>();
        for (int i=0; i<strings.length;i++){
            int count =0;
            for (int j=i+1; j<strings.length; j++){
                if (Objects.equals(strings[i], strings[j])){
                    count++;
                }
            }
            if (!map.containsKey(strings[i])) {
                map.put(strings[i], count);
            }
        }
        return map;
    }
    public static Map<String, String> firstChar(String[] strings) {
        Map<String,String> map = new HashMap<>();
        for (String s:strings){
            String first = s.substring(0,1);
            map.put(first, map.getOrDefault(first,"")+s);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(sum());
    }
    public static int remove(int a){
        return a*a;
    }
    public static int sum(){
        return remove(5)+remove(10);
    }
}

enum Employe{
  JJJJ,HHH
}
