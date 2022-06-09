/*Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.*/
class Solution3{
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash=new HashSet<>();
        for(int i:nums){
            hash.add(i);
        }
        int longestStreak=0;
        for(int i:nums){
            if(!hash.contains(i-1)){
                int currentStreak=1;
                int currNum=i;
                while(hash.contains(currNum+1)){
                    currentStreak+=1;
                    currNum+=1;
                }
               longestStreak=Math.max(longestStreak,currentStreak);
            }
       
        }
        return longestStreak;
    }
}