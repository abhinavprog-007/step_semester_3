public class MaximumSubarray {
 public static int maxSubArray(int[] nums){int currentSum=nums[0],maximumSum=nums[0];for(int i=1;i<nums.length;i++){if(currentSum+nums[i]>nums[i])currentSum+=nums[i];else currentSum=nums[i];if(currentSum>maximumSum)maximumSum=currentSum;}return maximumSum;}
 public static void main(String[] args){System.out.println("Maximum Subarray Sum: "+maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));}
}