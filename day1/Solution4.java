/*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.*/
/*AKA Kadane's Algorithm*/
class Solution4{
    public int maxSubArray(int[] nums) {
      int maxSoFar=Integer.MIN_VALUE;
      int maxTillHere=0;
      for(int i:nums){
         maxTillHere+=i;
          maxSoFar=Math.max(maxSoFar,maxTillHere);
          maxTillHere=Math.max(maxTillHere,0);
      }
    return maxSoFar;
        
    }
}