import java.util.HashMap;
public class SubarraySumEqualsK {
 public static int subarraySum(int[] nums,int k){HashMap<Integer,Integer> prefixSums=new HashMap<>();prefixSums.put(0,1);int currentSum=0,count=0;for(int num:nums){currentSum+=num;int requiredSum=currentSum-k;if(prefixSums.containsKey(requiredSum))count+=prefixSums.get(requiredSum);prefixSums.put(currentSum,prefixSums.getOrDefault(currentSum,0)+1);}return count;}
 public static void main(String[] args){System.out.println("Number of Subarrays: "+subarraySum(new int[]{1,1,1},2));}
}