package exceptions;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("meat");
    }


    public static void main(String[] args) {
        int[] array = {5,0,1,4};
        System.out.println(firstStableIndex(array,3));
    }
    public static int firstStableIndex(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (maxNumber(nums,i)-minNumber(nums,i)<k){
                return i;
            }
        }
        return -1;
    }
    public static int minNumber(int[] nums, int i) {
        int min = nums[i];
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] < min) {
                min = nums[j];
            }
        }
        return min;
    }
    public  static int maxNumber(int[] nums,int i) {
        int max = nums[0];
        for (int j = 1; j <= i; j++) {
            if (nums[j] > max) {
                max = nums[j];
            }
        }
        return max;
    }

    public boolean uniformArray(int[] nums1) {
           int odd = 0;
            int even = 0;
            if (nums1.length==2 && nums1[0]%2==0 && nums1[1]%2!=0) {
                return false;
            }
            if(nums1.length==2 && nums1[0]%2!=0 && nums1[1]%2==0){
                return true;
            }
            for (int num : nums1) {
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            return nums1.length == 1 || odd >= 2 || even >= 2;
        }


    public boolean isBig(int[] nums1, int index, int number) {

        for (int i = index; i < nums1.length; i++) {
            int temp = nums1[i];
            if (temp % 2 != 0 && nums1[i] < number) {
                return true;
            }
        }
        return false;
    }

//    public boolean uniformArray(int[] nums1) {
//        boolean isPair = false;
//        boolean isOdd = false;
//        int isPairCount = 0;
//        int isOddCount = 0;
//        for (int i = 0; i < nums1.length; i++) {
//            if (nums1[i] % 2 == 0) {
//                isPair = true;
//                isPairCount++;
//            }else {
//                isOdd = true;
//                isOddCount++;
//            }
//        }
//        if (isPairCount==nums1.length) {
//            return true;
//        }
//        if (isOddCount==nums1.length) {
//            return true;
//        }
//        return isPair && isOdd;
//    }

    public String lexPalindromicPermutation(String s, String target) {
        return null;
    }

    public static String lexGreaterPermutation(String s, String target) {
        int n = s.length();

        // s dagi har bir harfning umumiy soni
        int[] sCount = new int[26];
        for (char c : s.toCharArray()) sCount[c - 'a']++;

        // cum[i] = target[0..i-1] prefiksidagi har bir harf soni
        int[][] cum = new int[n + 1][26];
        boolean[] feasible = new boolean[n + 1];
        feasible[0] = true;

        for (int i = 1; i <= n; i++) {
            cum[i] = cum[i - 1].clone();
            int idx = target.charAt(i - 1) - 'a';
            cum[i][idx]++;
            // prefiks mumkinmi: shu harfning soni s dagi sondan oshmasligi kerak
            feasible[i] = feasible[i - 1] && cum[i][idx] <= sCount[idx];
        }

        // pozitsiyalarni oxiridan boshigacha tekshiramiz
        for (int i = n - 1; i >= 0; i--) {
            if (!feasible[i]) continue;

            // shu prefiksdan keyin qolgan harflar soni
            int[] remaining = new int[26];
            for (int c = 0; c < 26; c++) {
                remaining[c] = sCount[c] - cum[i][c];
            }

            int targetChar = target.charAt(i) - 'a';

            // target[i] dan kattaroq eng kichik mavjud harfni topamiz
            int chosen = -1;
            for (int c = targetChar + 1; c < 26; c++) {
                if (remaining[c] > 0) {
                    chosen = c;
                    break;
                }
            }

            if (chosen == -1) continue; // bu pozitsiyada ishlamadi, oldingisini sinaymiz

            // natijani quramiz
            StringBuilder sb = new StringBuilder();
            sb.append(target, 0, i);           // mos kelgan prefiks
            sb.append((char) ('a' + chosen));  // kattaroq harf
            remaining[chosen]--;

            // qolganlarini o'sish tartibida qo'shamiz
            for (int c = 0; c < 26; c++) {
                for (int k = 0; k < remaining[c]; k++) {
                    sb.append((char) ('a' + c));
                }
            }

            return sb.toString();
        }

        return "";
    }

    public boolean isLarge(String s, String target) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < target.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public List<String> fullList(String s, String target) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {

        }
        return list;
    }

    public String shortestBeautifulSubstring(String s, int k) {
        int start = 0;
        int end = 1;
        int minLength = s.length();
        Map<String, Integer> map = new HashMap<>();
        while (end > start) {
            String str = s.substring(start, end);
            if (isLength(str, k)) {
                if (str.length() < minLength) {
                    minLength = str.length();
                    map.clear();
                    map.put(s.substring(start, end), minLength);
                } else if (str.length() == minLength) {
                    map.put(s.substring(start, end), minLength);
                }

                start++;
            } else {
                if (s.length() > end) {
                    end++;
                } else {
                    start++;
                }
            }
        }
        Set<String> set = map.keySet();
        if (set.size() > 1) {
            String trueValue = set.iterator().next();
            for (String str : set) {
                if (isEquals(trueValue, str)) {
                    trueValue = str;
                }
            }
            return trueValue;
        }
        return map.isEmpty()
                ? null
                : map.keySet().iterator().next();
    }

    public boolean isEquals(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) > b.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public boolean isLength(String s, int k) {

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return sum == k;
    }

    public static int missingMultiple(int[] nums, int k) {
        boolean right = true;
        int next = k;
        while (right) {
            if (hastNextTrue(nums, next)) {
                next += k;
            } else {
                right = false;
            }
        }
        return next;
    }

    public static boolean hastNextTrue(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                return true;
            }
        }
        return false;
    }


    public static double angleClock(int hour, int minutes) {
        double hourAngle = (hour % 12) * 30 + minutes * 0.5;
        double minutesAngle = minutes * 6;
        double diff = Math.abs(hourAngle - minutesAngle);
        return Math.min(diff, 360 - diff);

    }
}
