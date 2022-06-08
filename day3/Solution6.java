class Solution {
    int ans=0;
     public void merge(int arr[],int l,int m,int h){
    int n1=m-l+1;
      int n2=h-m;
      int arr1[]=new int[n1];
      int arr2[]=new int[n2];
      for(int i=l;i<=m;i++){
          arr1[i-l]=arr[i];
      }
      for(int i=m+1;i<=h;i++){
          arr2[i-m-1]=arr[i];
      }
      int i=0;int j=0;int k=l;
      while(i<n1 && j<n2){
          if((long) arr1[i]>2*(long) arr2[j]){
              j++;
              ans+=(n1-i);
          }
          else{
              i++;
          }
      }
      i=0;
      j=0;
      k=l;
      while(i<n1 && j<n2){
          if(arr1[i]<=arr2[j]){
              arr[k]=arr1[i];
              i++;
              k++;
          }
          else{
              arr[k]=arr2[j];
              j++;
              k++;
          }
      }
      while(i<n1){
          arr[k]=arr1[i];
          i++;
          k++;
      }
      while(j<n2){
          arr[k]=arr2[j];
          j++;
          k++;
      }
    }
    public  void mergeSort(int arr[],int l,int h){
        if(l<h){
        int mid=(l+h)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,h);
        merge(arr,l,mid,h);
        }
    }
    public int reversePairs(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return ans;
    }
}