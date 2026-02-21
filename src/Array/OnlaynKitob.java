package Array;

public class OnlaynKitob {
    public static void main(String[] args) {


    }
//    public static void main(String[] args) {
//        int result = sum(10);
//        System.out.println(result);
//    }
//    public static int sum(int k) {
//        if (k > 0) {
//            return k + sum(k - 1);
//        } else {
//            return 0;
//        }
//    }
//    public static void main(String[] args) {
//        int result = sum(5, 10);
//        System.out.println(result);
//    }
//    public static int sum(int start, int end) {
//        if (end > start) {
//            return 1 + sum(start, end - 1);
//        } else {
//            return end;
//        }
//    }
//    int x = 5;
//
//    public static void main(String[] args) {
//        OnlaynKitob myObj1 = new OnlaynKitob();  // Object 1
//        OnlaynKitob myObj2 = new OnlaynKitob();  // Object 2
//        System.out.println(myObj1.x);
//        System.out.println(myObj2.x);
//    }

    public static boolean array220(int[] nums, int index) {
        // Asosiy holat: agar indeks massiv uzunligidan katta yoki teng bo'lsa, false qaytarish
        if (index >= nums.length - 1) {
            return false;
        }

        // Rekursiv holat: agar hozirgi element va undan keyingi element mavjud bo'lsa va ular shartni qanoatlantirsa, true qaytarish
        if (nums[index] * 10 == nums[index + 1]) {
            return true;
        }

        // Keyingi indeks bilan rekursiv chaqirish
        return array220(nums, index + 1);
    }

    public String pairStar(String str) {
        int index =0;
        String result ="";
      for (int i=0; i<=str.length()-1;i++){
          if (str.charAt(i)==str.charAt(i+1)){
             result= result +"*";
          }else result=result;
      }
      return result;
    }

    public String endX(String str) {
       if (str.length()==0){
           return str;
       }
       char first = str.charAt(0);
          String end= str.substring(1);
          if (first=='x'){
              return endX(end)+first;
          }else {
              return first+endX(end);
          }
    }

    public int countPairs(String str) {
        int a=0;
     for (int i=0; i<str.length()-3; i++){
         if (str.substring(i,i+3).equals("abc")|| str.substring(i,i+3).equals("aba")){
             a++;
         }
     }
     return a;
    }


}
