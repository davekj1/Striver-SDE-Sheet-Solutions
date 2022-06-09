//4 sum
class Solution2{
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<ArrayList<Integer>> hash=new HashSet<ArrayList<Integer>>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int k=j+1;
                int l=nums.length-1;
                int t=target-nums[i]-nums[j];
                while(k<l){
                    if(nums[k]+nums[l]==t){
                        ArrayList<Integer> arr=new  ArrayList<Integer>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[k]);
                        arr.add(nums[l]);
                        hash.add(arr);
                        k++;
                    }
                    else if(nums[k]+nums[l]>t){
                        l--;
                    }
                    else{
                        k++;
                    }
                }
            }
        }
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        for(ArrayList<Integer> arr:hash){
            list.add(arr);
        }
        return list;
    }
} 