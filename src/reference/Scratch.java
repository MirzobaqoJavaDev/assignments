package reference;

import java.util.*;

class Scratch {


    public static double a = 1;

    private static boolean nextPermutation(int n, String[] strings) {//ab.  bc. cd

        String first = strings[0];

        if (((int) a % 2) == 1) {
            String text = strings[n - 1];
            strings[n - 2] = strings[n - 1];
            strings[n - 1] = text;
            a += 0.5;
        }
        if (((int) a % 2) == 0) {
            String text1 = strings[n - 3];
            strings[n - 3] = strings[n - 1];
            strings[n - 1] = strings[n - 2];
            strings[n - 2] = text1;

        }
        if (a >= 2 && first.equals(strings[0])) {
            return false;
        }
        return true;
//        ab bc cd
//        ab cd bc
//        bc ab cd
//        bc cd ab
//        cd ab bc
//        cd bc ab


    }

    public String getSandwich(String str) {
        int startLength = str.indexOf("bread");
        int endLength = str.lastIndexOf("bread");

        if (startLength == -1 || startLength == endLength) {
            return "";
        }
        return str.substring(startLength + 5, endLength);
    }

    public boolean sameStarChar(String str) {
        if (str.isEmpty()) {
            return false;
        }
        if (str.length() == 1) {
            return str.charAt(0) == '*';
        }
        if (str.length() == 2) {
            return str.charAt(0) == '*' && str.charAt(1) == '*';
        }
        boolean result = false;
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == '*' && i != 1) {
                if (str.charAt(i - 1) == str.charAt(i + 1)) {
                    result = true;
                }
            } else {
                result = false;
            }

        }
        return result;
    }

    public String oneTwo(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i + 2 < str.length(); i += 3) {
            char first = str.charAt(i);
            char two = str.charAt(i + 1);
            char last = str.charAt(i + 2);
            builder.append(two).append(last).append(first);
        }
        return builder.toString();
    }

    public String zipZap(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i>0 && i>str.length()-1 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                continue;
            }
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }
    public String starOut(String str) {
        StringBuilder builder = new StringBuilder();
        boolean result =true;
        int indexFirst = str.indexOf("*");
        int lastIndex = str.lastIndexOf("*");
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='*' || (indexFirst-1)!=i){
                result=false;
            }
            if (result || (lastIndex+1)!=i){
                builder.append(i);
            }
        }
        return builder.toString();
       }
    public String plusOut(String str, String word) {
        StringBuilder builder = new StringBuilder();
        int length = word.length();
    for (int i=0; i<str.length(); i++){
        if (str.substring(i,i+length).equals(word)){
            builder.append(word);
            i+=(length-1);
        }else {
            builder.append("+");
        }
    }
    return builder.toString();
    }
    public String wordEnds(String str, String word) {
        StringBuilder builder = new StringBuilder();
        int length = word.length();
     for (int i= 0; i<=str.length()-length;i++){
        if (str.substring(i,i+length).equals(word)){
            if (i>0){
                builder.append(str.charAt(i-1));
            }
            if (i+length<str.length()){
                builder.append(str.charAt(i+length));
            }
        }
     }
     return builder.toString();
    }
    public boolean xyBalance(String str) {
        boolean hasY = false;
        for (int i=str.length()-1; i>=0; i--){
            if (str.charAt(i)=='y'){
                hasY=true;
            }
            if (str.charAt(i)=='x'&& !hasY){
                return false;
            }
        }
        return true;
    }
    public int countEvens(int[] nums) {
        int count=0;
     for (int i=0; i<nums.length;i++){
         if (nums[i]%2==0){
             count++;
         }
     }
     return count;
    }
    public int bigDiff(int[] nums) {

    int firstMax = nums[0];
    int firstMin = nums[0];
    for (int i=0; i<nums.length;i++){
        if (firstMax<nums[i]){
            firstMax=nums[i];
        }
        if (firstMin>nums[i]){
            firstMax=nums[i];
        }
    }
    return firstMax-firstMin;
    }
    public int centeredAverage(int[] nums) {
        int firstMax = nums[0];
        int firstMin = nums[0];
        int count = nums.length - 2;
        for (int i = 0; i < nums.length; i++) {
            if (firstMax < nums[i]) {
                firstMax = nums[i];
            }
            if (firstMin > nums[i]) {
                firstMax = nums[i];
            }
        }
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        return (total - firstMax - firstMin) / count;
    }
    public int sum13(int[] nums) {
     int total=0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i]!=13) {
                total += nums[i];
            }
        }
        return total;
    }
    public int sum67(int[] nums) {
    boolean result =true;
    int total=0;
    for (int i = 0; i < nums.length; i++){
        if (nums[i]==6){
            result=false;
        }
        if (nums[i]==7){
            result=true;
        }
        if (result){
            total+=nums[i];
        }
    }
    return total;
    }
    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==2&& nums[i+1]==2){
                return true;
            }
        }
        return false;
        }
    public boolean lucky13(int[] nums) {
        boolean result = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1 || nums[i]==3){
                result=false;
            }
        }
        return result;
        }
        public String missingChar(String str, int n){
        StringBuilder builder= new StringBuilder();
        int count =0;
        for (int i =0; i<str.length();i++){
            if (count==n){
                continue;
            }
            builder.append(str.charAt(i));
            count++;
        }
        return builder.toString();
        }


    public boolean sum28(int[] nums) {
        int total =0;
    for (int i = 0; i < nums.length; i++){
        if (nums[i]==2){
            total+=2;
        }
    }
  return total==8;
    }
    public boolean frontBeck(String str){
        return  str.startsWith("hi");
          }
    public boolean more14(int[] nums) {
        int count1 =0;
        int count4 =0;
        for (int num : nums) {
            if (num == 1) {
                count1++;
            }
            if (num == 4) {
                count4++;
            }
        }
    return count1>count4;
    }
    public int[] fizzArray(int n) {
    int[] result = new int[n];
    for (int i=0;i<n;i++){
        result[i]=i;
    }
    return result;
    }
    public boolean only14(int[] nums) {

    for (int i = 0; i < nums.length; i++){
        if (nums[i]!=1){
            return false;
        }
    }
    return true;
    }
    public String[] fizzArray2(int n) {
        String[] result = new String[n];
        for (int i=0;i<n;i++){
            result[i]= String.valueOf(i);
        }
        return result;
    }
    public boolean isEverywhere(int[] nums, int val) {
        if (nums.length <= 2) {
            if (nums[0] == val) {
                return true;
            } else return nums[1] == val;
        }
        if (nums[0] == val) {
            for (int i = 2; i < nums.length; i+=2) {
                if (nums[i] != val) {
                    return false;
                }
            }

        }else if (nums[1]==val){
            for (int i = 3; i < nums.length; i+=2){
                if (nums[i] != val) {
                    return false;
                }
            }
        }
        return false;
    }
    public boolean either24(int[] nums) {
    boolean result2 = false;
    boolean result4 = false;

    for (int i=0;i<nums.length-1;i++){
        if (nums[i]==2 && nums[i+1]==2){
            result2=true;
        }
        if (nums[i]==4 && nums[i+1]==4){
            result4=true;
        }
    }
    if (result2 && result4){
        return false;
    }
    return result2 || result4;
    }
    public int matchUp(int[] nums1, int[] nums2) {
    int count =0;
    for (int i=0; i<nums1.length;i++){
        if (Math.abs(nums1[i]-nums2[i])<=2 && (nums1[i]-nums2[i])!=0){
            count++;
        }
    }
    return count;
    }
    public boolean has77(int[] nums) {
     for (int i=0; i<nums.length-2;i++){
         if ((nums[i]==7 && nums[i+1]==7) || (nums[i]==7 && nums[i+2]==7)){
             return true;
         }
     }
     return false;
    }
    public boolean has12(int[] nums) {
    int result1=0;
    int result2=0;
    for (int i=0; i<nums.length;i++){
        if (nums[i]==1){
            result1=i;
        }
        if (nums[i]==2){
            result2=i;
        }
    }
    return result1<result2;

    }
    public boolean modThree(int[] nums) {
    for (int i=0; i<nums.length;i+=3){
        if (nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0){
            return true;
        } else if (nums[i]%2==1 && nums[i+1]%2==1 && nums[i+2]%2==1){
            return true;
        }
    }
    return false;
    }
    public boolean haveThree(int[] nums) {
    int count =0;
    for (int i=0; i<nums.length-1;i++){
        if (nums[i]==3 && nums[i+1]!=3){
            count++;
        }
    }
    if (nums[nums.length-1]==3)
        count++;
    return count==3;
    }
    public boolean twoTwo(int[] nums) {

    for(int i=0;i<nums.length;i++){
       if (nums[i]==2){
         boolean count = (i>0 && nums[i-1]==2)||(i<nums.length-1 && nums[i+1]==2);
         if (!count){
             return false;
         }
       }
    }
    return true;
    }
    public boolean sameEnds(int[] nums, int len) {
     for (int i=0; i<len;i++){
         if (nums[i]!=nums[nums.length-len+i]){
             return false;
         }
     }
     return true;
    }
    public boolean tripleUp(int[] nums) {
    for (int i=0; i<nums.length;i++){
            if (nums[i]==(nums[i]+1) && nums[i]==(nums[i]+2)){
                       return true;
        }
    }
    return false;
    }
    public int[] fizzArray3(int start, int end) {
    int[] result = new int[end-start];
    int count =0;
    for (int i=start; i<end; i++){
        result[count]=i;
        count++;
    }
    return result;
    }
    public int[] shiftLeft(int[] nums) {
    int[] result = new int[nums.length];
    int count = nums[0];
    for (int i=0; i<nums.length-1;i++){
        result[i]=nums[i+1];
    }
     result[nums.length-1]=count;
    return result;
    }
    public int[] tenRun(int[] nums) {
        int count =0;
        boolean  result =false;
      for (int i=0;i<nums.length;i++){
          if (nums[i]%10==0){
              count=nums[i];
              result=true;
          }
          if (result){
              nums[i]=count;
          }
      }
      return nums;
    }
    public int[] pre4(int[] nums) {
      int index =0;
      while (index<nums.length && nums[index]!=4){
          index++;
      }
      return Arrays.copyOfRange(nums,0,index);
    }


    public int[] post4(int[] nums) {
    int index=nums.length-1;
    while (index>0 && nums[index]!=4){
        index--;
    }
    return Arrays.copyOfRange(nums,index,nums.length);
    }
    public int[] notAlone(int[] nums, int val) {
        if (nums.length<3){
            return nums;
        }
    for (int i=1; i<nums.length-1;i++){
        if (nums[i]==val && nums[i-1]!=val && nums[i+1]!=val){
        nums[i]=Math.max(nums[i-1],nums[i+1]);
        }
    }
    return nums;
    }
    public int[] zeroFront(int[] nums) {
    int[] result = new int[nums.length];
    int count =0;
        for (int num : nums) {
            if (num == 0) {
                count++;
            }
        }
        for (int i=count; i<nums.length;i++){
            if (nums[i]!=0){
                result[i]=nums[i];
            }
        }
        return result;
    }
    public int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
    for (int i=0; i<nums.length;i++){
       if (nums[i]!=10){
           result[i]=nums[i];
       }
    }
    return result;
    }
    public int[] zeroMax(int[] nums) {
    for (int i=0; i<nums.length;i++){
        if (nums[i]==0){
            int maxNol=0;
            for (int j=i+1; j<nums.length;j++){
                if (nums[j]%2==1 && nums[j]>maxNol){
                    maxNol=nums[j];
                }
            }
            if (maxNol!=0){
                nums[i]=maxNol;
            }
        }
    }
    return nums;
    }
    public int[] evenOdd(int[] nums) {
    int[] result = new int[nums.length];
    int count =0;
    for (int i=0;i<nums.length;i++){
        if (nums[i]%2==0){
            result[count]=nums[i];
            count++;
        }
    }
    for (int i=0;i<nums.length;i++){
            if (nums[i]%2==1){
                result[count]=nums[i];
                count++;
            }
        }
    return result;
    }
    public String[] fizzBuzz(int start, int end) {
    String[] result= new String[end-start];
    for (int i=start; i<end;i++){
        if (i%3==0){
            result[i]="fizz";
        }
        if (i%5==0){
            result[i]="Buzz";
        }
        result[i]= String.valueOf(i);
    }
    return result;
    }
    public int countYZ(String str) {
        str =str.toLowerCase()+" ";
        int count =0;
        for (int i=0; i<str.length()-1; i++){
            if ((str.charAt(i)=='y' || str.charAt(i)=='z') && !Character.isLetter(str.charAt(i+1))){
                count++;
            }
        }
        return count;
    }
    public String withoutString(String base, String remove) {
        return base.replaceAll("?i"+remove,"");
    }



    public boolean equalIsNot(String str) {
    int countIs=0;
    int countNot=0;
    for (int i=0;i<str.length();i++){
        if (str.startsWith("not", i)){
            countNot++;
        }
        if (str.startsWith("is",i)){
            countIs++;
        }
    }
    return countNot==countIs;
    }
    public boolean gHappy(String str) {
    for (int i=0;i<str.length();i++){
        if (str.charAt(i)=='g'){
            if ((i>0 && str.charAt(i-1)=='g')||(i<str.length()-1 && str.charAt(i+1)=='g')){
                continue;
            }
            return false;
        }
    }
    return true;
    }
    public int countTriple(String str) {
    int count =0;
    for (int i=0; i<str.length()-2;i++){
        if (str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2)){
            count++;
        }
    }
    return count;
    }
    public int sumDigits(String str) {
    int total =0;
    for (int i=0;i<str.length();i++){
       if (Character.isDigit(str.charAt(i))){
           total+=Character.getNumericValue(str.charAt(i));
        }
    }
    return total;
    }
    public String sameEnds(String string) {
     int count =0;
     for (int i=0; i<string.length();i++){
         if (string.substring(0,i).equals(string.substring(string.length()-i))){
             count++;
         }
     }
     return string.substring(0,count);
    }
    public String mirrorEnds(String string) {
        StringBuilder builder = new StringBuilder();
    for (int i=0;i<string.length();i++){
        if (string.charAt(i)==string.charAt(string.length()-i-1)){
            builder.append(string.charAt(i));
        }else {
            break;
        }
    }
    return builder.toString();
    }
    public int maxBlock(String str) {
    int count =0;
    int countMax=0;
    for(int i=0;i<str.length()-1;i++){
        if (str.charAt(i)==str.charAt(i+1)){
            count++;
        }
        if (countMax<=count){
            countMax=count;
        }
        if (str.charAt(i)!=str.charAt(i+1)){
            count=0;
        }
    }
    return countMax+1;
    }
    public int sumNumbers(String str) {
        int total=0;
        String string="";
        for (int i=0;i<str.length();i++){
            if (Character.isDigit(str.charAt(i))){
              string+=str.charAt(i);
            }else {
                if (!string.isEmpty()){
                    total+=Integer.parseInt(string);
                    string="";
                }
            }
        }
        if (!string.isEmpty()){
            total+=Integer.parseInt(string);
        }
        return total;
    }
    public static String notReplace(String str) {
     StringBuilder builder = new StringBuilder();
     if (str.length()==2 && str.startsWith("is")){
         return "is not";
     }
     boolean count = false;
     for (int i=0; i<str.length()-1;i++){
         if (str.startsWith("is")){
             builder.append(" is not");
             i+=2;
         }
         if (!Character.isLetter(str.charAt(i)) && str.startsWith("is", i+1)) {
             System.out.println( builder.append(" is not"));
             i+=2;
             count=false;
         }else {
             builder.append(str.charAt(i));
             count=true;
         }
     }
     if (count && str.endsWith("is")){
         builder.append("is not");
     }
     return builder.toString();
    }
    public static int removeDuplicates(int[] nums) {
    int count=0;
    int result=nums[0];
    for (int i=1; i<nums.length;i++){
        if (nums[i]!=result){
            count++;
            result=nums[i];
        }
    }
    return count+1;
    }

    public int maxSpan(int[] nums) {
        int maxSpan=0;
        for (int i=0; i<nums.length;i++){
            for (int j=nums.length-1;j>=i; j--){
                if (nums[i]==nums[j]){
                    int span=j-i-1;
                    maxSpan=Math.max(maxSpan,span);
                    break;
                }
            }
        }
        return maxSpan;
    }
    public  static int[] fix34(int[] nums) {
        int n = nums.length;

        int j = 0; // 4 larni almashtirish uchun ko'rsatkich

        for (int i = 0; i < n; i++) {
            if (nums[i] == 3) {
                // 3 ning keyingi elementini topamiz (bo'sh joy)
                while (j < n && (nums[j] != 4 || (j > 0 && nums[j - 1] == 3))) {
                    j++;
                }
                if (j < n) { // Chegaradan chiqmaslik uchun tekshiramiz
                    // Swap (3 ning keyingisini 4 bilan almashtiramiz)
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
    public int[] fix45(int[] nums) {
     int j=0;
     int[] result = new int[nums.length];
     for (int i=0;i<nums.length;i++){
         if (nums[i]!=5){
             if (nums[i]==4){
                 result[j]=4;
                 result[j+1]=5;
                 j+=2;
             }else {
                 result[j]=nums[i];
                 j++;
             }
         }
     }
     return result;
    }
    public boolean scoresIncreasing(int[] scores) {
        boolean result =true;
    for (int i=0;i<scores.length-1;i++){
        if (scores[i]>scores[i+1]){
            result=false;
        }
    }
    return result;
    }
    public boolean scores100(int[] scores) {
        boolean result =false;
        for (int i=0;i<scores.length-1;i++){
            if (scores[i]==100 && scores[i+1]==100){
                result=true;
            }
        }
        return result;
    }
    public boolean scoresClump(int[] scores) {
        boolean result =false;
        for (int i=0;i<scores.length-2;i++) {
            if ((scores[i+1]-scores[i])<=2 &&(scores[i+2]-scores[i])<=2){
                result=true;
            }
        }
        return result;
        }
    public int scoresAverage(int[] scores) {
    int end=0;
    int start=0;
    for (int i=0;i<scores.length/2;i++){
        start+=scores[i];
        end+=scores[scores.length-i-1];
    }
    return Math.max(start,end);
    }

    public static boolean canBalance(int[] nums) {
        int totalFirst=0;
        int totalEnd=0;
        int a=0;
        int b=0;
        for (int i=0;i<nums.length;i++){
         if (totalFirst==totalEnd){
             totalFirst+=nums[i];
             totalEnd+=nums[nums.length-1-i];
             a++;
             b++;
             continue;
         }
         if (totalFirst<totalEnd){
             totalFirst+=nums[i];
             a++;
             continue;
         }
         if (totalFirst>totalEnd){
             totalEnd+=nums[nums.length-1-i];
             b++;
             continue;
         }
         if ((a+b)== nums.length){
             break;
         }
        }
        return totalFirst==totalEnd;
    }
    public static int wordsCount(String[] words, int len) {
        int count = 0;
        for (String word : words) {
            if (word.length() == len) {
                count++;
            }
        }
        return count;
    }
    public String[] wordsFront(String[] words, int n) {
     String[] result = new String[n];
     for (int i=0; i<=n; i++){
         result[i]=words[i];
     }
     return result;
    }
    public List wordsWithoutList(String[] words, int len) {
       List<String> result = new ArrayList<>();
       for (int i=0;i<words.length;i++){
           int length = words[i].length();
           if (length!=len){
               result.add(words[i]);
           }
       }
       return result;
    }
    public static boolean hasOne(int n) {
     int length = String.valueOf(n).length();
     int result=0;
     for (int i=0; i<length;i++){
          if (n%10!=0){
            result++;
          }
         n=n/10;
          if (result>1){
              return false;
          }
     }
     return true;
    }
    public static boolean dividesSelf(int n) {
        int length = String.valueOf(n).length();
        int count =0;
        boolean result=true;
        int a=0;

        for (int i=0; i<length-1;i++){
            if (n%10==0){
                return false;
            }
            count=n%10;
             a=n/10;
            if (count%(a%10)!=0 ){
                result=false;
            }
            if(count==3){
                result=false;
            }
            n=n/10;
        }
        return result;
    }


    public static void main(String[] args) {
    int[][] result = {{1,2,3},{4,5,6,},{7,8}};
    for (int i=0; i<result.length;i++){
        for (int j=0;j<result[i].length;j++){
            System.out.print(result[i][j]+"\t");
        }
        System.out.println();
    }
    }
}
