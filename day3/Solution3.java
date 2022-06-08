class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hash=  new HashMap<Integer,Integer>();
        for(int i:nums){
            if(hash.containsKey(i)){
                hash.put(i,hash.get(i)+1);
            }
            else
                hash.put(i,1);
        }
        int t=(nums.length+1)/2;
        for(Map.Entry<Integer,Integer> entry : hash.entrySet()){
            if(entry.getValue()>=t){
                return entry.getKey();
            }
        }
        return -1;
    }
}