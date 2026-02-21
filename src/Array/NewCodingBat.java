package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NewCodingBat {
    public int[] fix34(int[] nums) {
        ArrayList<Integer> others = new ArrayList<>();
        for (int num : nums) {
            if (num != 3 && num != 4) {
                others.add(num);
            }
        }
        int[] result = new int[nums.length];
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 3) {
                boolean b = result[i + 1] == 4;
                i++;
            } else if (result[i] != 4) {
                result[i] = others.get(index++);
            }
        }
        return result;
    }

    public List<String> copies3(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");
        return strings;
    }

    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }

    public List<String> lower(List<String> strings) {
        List<String> lowerList = new ArrayList<>();
        for (String str : strings) {
            lowerList.add(str.toLowerCase());
        }
        return lowerList;
    }

    public List<String> noX(List<String> strings) {
        List<String> listArray = new ArrayList<>();
        for (String str : listArray) {
            listArray.add(str.replace("x", ""));
        }
        return listArray;
    }

    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n > 0);
        return nums;
    }

    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }

    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n >= 13 && n <= 19);
        return nums;
    }

    public List<String> noZ(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str.contains("x")) {

            } else {
                result.add(str);
            }
            return result;
        }
        return result;

    }


    public List<String> noLong(List<String> strings) {
    List<String> result = new ArrayList<>();
    for (String str : strings){
        if (str.length()!=3 && str.length()!=4 ){
            result.add(str);
        }
    }
    return result;
    }
    public List<String> noYY(List<String> strings) {
     List<String> result = new ArrayList<>();
     for (String str : strings){
         String tur = str+"y";
         if(!tur.contains("yy")){
             result.add(tur);
         }
     }
     return result;
}

    public List<Integer> two2(List<Integer> nums) {
   nums.replaceAll(n-> n*2);
   nums.removeIf(n-> n%10==2);
   return nums;

    }
    public List<Integer> square56(List<Integer> nums) {
  nums.replaceAll(n-> n*n+10);
  nums.removeIf(n-> n%10==5 || n%10==6);
  return nums;
    }

    public int bunnyEars2(int bunnies) {
        int total =0;
       for (int i=1; i<=bunnies; i++){
           if(i%2==0){
               total +=3;
           }else {
               total +=2;
           }
       }
       return total;
    }
    public int triangle(int rows) {
 int total =0;
 for (int i=0; i<=rows; i++){
     total +=1;
 }
 return total;
    }


    public int sumDigits(int n) {
        int total =0;
     while (n>0){
         int sum = n%10;
         total +=sum;
         n /=10;
     }
     return total;
    }
    public int count7(int n) {
        int total =0;
        while (n>0){
            int sum = n%10;
            if(sum==7){
                total++;
            }
            n /=10;
        }
        return total;
    }
    public int count8(int n) {
        if (n == 0) {
            return 0;
        }

        int rightmostDigit = n % 10;
        int nextDigit = (n / 10) % 10;

        if (rightmostDigit == 8) {
            if (nextDigit == 8) {
                return 2 + (n / 10);
            } else {
                return 1 + count8(n / 10);
            }
        } else {
            return count8(n / 10);
        }

    }

}