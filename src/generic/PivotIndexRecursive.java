package generic;

public class PivotIndexRecursive {
    public int pivotIndex(int[] nums){
        int totalSum= getSum(nums,0);
        return findPivot(nums,0,0,totalSum);
    }

    private int getSum(int[] nums, int i){
        if (i==nums.length) return 0;
        return nums[i]+ getSum(nums,i+1);
    }
    private int findPivot(int[] nums, int i, int leftSum, int totalSum){
        if (i==nums.length) return -1;
        int rightSum=totalSum-leftSum-nums[i];
        if (rightSum==leftSum){
            return i;
        }
        return findPivot(nums,i+1,leftSum+nums[i],totalSum);
    }

    public static void main(String[] args) {
        PivotIndexRecursive pivotIndexRecursive= new PivotIndexRecursive();
        System.out.println(pivotIndexRecursive.pivotIndex(new int[]{1,7,3,6,5,6}));
    }
}
