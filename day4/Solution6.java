class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left=0;
        int right=0;
        int max=0;
        HashSet<Character> hash=new HashSet<Character>();
        while(right<s.length()){
            if(hash.contains(s.charAt(right))){
                while(s.charAt(left)!=s.charAt(right)){
                    hash.remove(s.charAt(left));
                    left++;
                }
                hash.remove(s.charAt(left));
                left++;
            }
            max=Math.max(max,right-left+1);
            hash.add(s.charAt(right));
            right++;
        }
       return max;
    }
}