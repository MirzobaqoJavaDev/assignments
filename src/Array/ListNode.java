package Array;



public class ListNode {
    public static void main(String[] args) {


        int[] digits = {1, 2, 3, 4, 5};
        int[] otherDigits = {9, 9, 9};
        plusOne(digits);
    }

    public static int[] plusOne(int[] digits) {
        // Massivning oxirgi indeksidan boshlab qidirish
        for (int i = digits.length - 1; i >= 0; i--) {
            // Oxirgi raqamni 9 ga teng bo'lsa, undan keyin 0 ga o'tkazish
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                // Oxirgi raqamni 1 ga oshirish va to'xtatish
                digits[i]++;
                return digits;
            }
        }
        // Agar hamma raqamlar 9 ga teng bo'lsa, yangi massiv yaratish va birinchi raqamni 1 qo'shish
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }





}