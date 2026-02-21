import inner.Bird;
import inner.FlyBird;

import java.text.NumberFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {
    private Date date;

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        for (int i=1; i<=s.length()-k;i++){
            String sub = s.substring(i,i+k);
            if (sub.compareTo(smallest)<0){
                smallest=sub;
            }
            if (sub.compareTo(largest)>0){
                largest=sub;
            }
        }


        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }

    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String s : strs) {
            stringBuilder.append(s.length()).append("#").append(s);
        }
        return stringBuilder.toString();
    }

    // Shifrlangan stringni asl ro'yxatga qayta tiklash
    public List<String> decode(String s) {
        List<String> str = new ArrayList<>();

        int i = 0;
        while (i < s.length()) {

            int j = i;

            while (s.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(s.substring(i, j));

            str.add(s.substring((j + 1), (j + 1 + length)));

            i = j + 1 + length;
        }
        return str;
    }

    public Map<String, Integer> processTransaction(List<String> transactions) {
        Map<String, Integer> userBalance = new HashMap<>();
        for (String transaction : transactions) {
            String[] parts = transaction.split(",");

            String userId = parts[0];
            int amount = Integer.parseInt(parts[1]);
            String type = parts[2];

            userBalance.putIfAbsent(userId, 0);

            if (type.equals("DEPOSIT")) {
                userBalance.put(userId, userBalance.get(userId) + amount);
            } else if (type.equals("WITHDRAW")) {
                userBalance.put(userId, userBalance.get(userId) - amount);
            }

        }
        return userBalance;
    }

    public static long getNearestDistance(Long D, long step) {
        long lower = (D / step) * step;
        long upper = ((D + step - 1) / step) * step;
        return Math.min(D - lower, upper - D);
    }

    public static void main(String[] args) {


        String regex = "\\b(\\w+)\\b(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();
            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = m.replaceAll("$1");
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();




//        Scanner scanner = new Scanner(System.in);
//        int T = scanner.nextInt();
//
//        for (int t = 0; t < T; t++) {
//
//
//            long A = scanner.nextLong();
//            long B = scanner.nextLong();
//            long C = scanner.nextLong();
//            long D = scanner.nextLong();
//
//            long distA = getNearestDistance(D,A);
//            long distB = getNearestDistance(D,B);
//            long distC = getNearestDistance(D,C);
//
//            long minDist = Math.min(distA,Math.max(distC,distB));
//            int count=0;
//
//            if (distA==distB) count++;
//            if (distA==distC) count++;
//            if (distB==distC) count++;
//
//            if(count>0){
//                System.out.println("Istaganingizni tanlashingiz mumkun");
//            }else {
//                System.out.println(minDist);
//            }
//        }

//
//        Main codec = new Main();
//        List<String> original = Arrays.asList("hello", "world", "123#456", "Java!");
//        String encoded = codec.encode(original);
//        System.out.println("Encoded: " + encoded);
//
//        List<String> decoded = codec.decode(encoded);
//        System.out.println("Decoded: " + decoded);
//
//        // Tekshiruv
//        System.out.println("Tengmi? " + original.equals(decoded));


//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();
//
//
//        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
//
//        Locale localeIndia = new Locale("en","IN");
//
//        String india = NumberFormat.getCurrencyInstance(localeIndia).format(payment);
//        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
//        String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);


//
//        Bird flyBird=new FlyBird("Ali",12.5,54.8);
//        flyBird.getLocation();
//    }
//
//    public static int binaryS(int[] a, int key) {
//        Arrays.sort(a);
//        return binarySO(a, 0, a.length, key);
//    }
//
//    public static int binarySO(int[] a, int fromIndex, int toIndex, int key) {
//        int low = fromIndex;
//        int high = toIndex - 1;
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            System.out.println(mid);
//            int midVal = a[mid];
//            if (midVal > key) {
//                high = mid - 1;
//            } else if (midVal < key) {
//                low = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//
//        return -1;
    }

    public String findDay(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
        return dayOfWeek.toUpperCase();
    }


}