class Solution5{
    int[] findTwoElement(int arr[], int n) {
       int count[]=new int[n+1];
       for(int i:arr){
           count[i]+=1;
       }
       int miss=0;
       int repeat=0;
       for(int i=1;i<=n;i++){
           if(count[i]==0)
           miss=i;
           if(count[i]>1)
           repeat=i;
       }
       int ans[]=new int[2];
       ans[0]=repeat;
       ans[1]=miss;
       return ans;
    }
}