class Solution4{
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hash=new HashSet<Integer>();
        for(int i:nums){
            if(hash.contains(i))
                return i;
            hash.add(i);
        }
        return 0;
    }
}