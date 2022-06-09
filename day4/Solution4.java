/*Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.*/
import java.util.*;
class Solution4{
	static int maxLen(int arr[], int n)
    {
       int dp[]=new int[n+1];
       for(int i=1;i<=n;i++){
       	dp[i]=dp[i-1]+arr[i-1];
       }
       HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
       int max=0;
       for(int i=0;i<=n;i++){
       	if(hash.containsKey(dp[i])){
       		max=Math.max(max,i-hash.get(dp[i]));
       	}
       	else{
       		hash.put(dp[i],i);
       	}
       }
       return max;
    }
    public static void main(String[] args) {
    	int n=8;
    	int a[]={15,-2,2,-8,1,7,10,23};
    	System.out.println(maxLen(a,n));
    }
}