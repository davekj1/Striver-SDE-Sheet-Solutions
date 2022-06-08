class Solution {
    HashMap<String,Integer> hash=new HashMap<>();
    public int uniquePaths(int m, int n) {
        if(m==1 || n==1)
            return 1;
        String s1=(m-1)+","+n;
        String s2=m+","+(n-1);
       if(hash.get(s1)==null){
           int s=uniquePaths(m-1,n);
           hash.put(s1,s);
       }
       if(hash.get(s2)==null){
           int s=uniquePaths(m,n-1);
           hash.put(s2,s);
       }
       return  hash.get(s1)+hash.get(s2);
    }
}