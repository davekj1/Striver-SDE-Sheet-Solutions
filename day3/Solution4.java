class Solution4 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        HashMap<Integer,Integer> hash=  new HashMap<Integer,Integer>();
        for(int i:nums){
            if(hash.containsKey(i)){
                hash.put(i,hash.get(i)+1);
            }
            else
                hash.put(i,1);
        }
        int t=nums.length/3;
        for(Map.Entry<Integer,Integer> entry : hash.entrySet()){
            if(entry.getValue()>t){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}