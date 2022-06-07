class Solution3{
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0){
            if(nums[i]<nums[i+1])
                break;
            i--;
        }
        if(i==-1){
            Arrays.sort(nums);
            return;
        }
        int j=i+1;
        while(j<nums.length && nums[j]>nums[i]){
            j++;
        }
        j--;
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        Arrays.sort(nums,i+1,nums.length);
     }
}