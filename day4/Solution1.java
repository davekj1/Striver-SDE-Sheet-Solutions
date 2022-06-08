/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> hash=new HashMap<>();
       for(int i=0;i<nums.length;i++){
           if(hash.containsKey(target-nums[i])){
               int ans[]={i,hash.get(target-nums[i])};
               return ans;
           }
           hash.put(nums[i],i);
           
       }
        return null;
    }
}
