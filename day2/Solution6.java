/*
For a given integer array/list 'ARR' of size 'N' containing all distinct values, find the total number of 'Inversions' that may exist.
An inversion is defined for a pair of integers in the array/list when the following two conditions are met.
*/
import java.util.* ;
import java.io.*; 
public class Solution6{
    static long ans=0;
    public static void merge(long arr[],int l,int m,int h){
	  int n1=m-l+1;
      int n2=h-m;
      long arr1[]=new long[n1];
      long arr2[]=new long[n2];
      for(int i=l;i<=m;i++){
          arr1[i-l]=arr[i];
      }
      for(int i=m+1;i<=h;i++){
          arr2[i-m-1]=arr[i];
      }
      int i=0;int j=0;int k=l;
      while(i<n1 && j<n2){
          if(arr1[i]<=arr2[j]){
              arr[k]=arr1[i];
              i++;
              k++;
          }
          else{
              arr[k]=arr2[j];
              ans+=(n1-i);
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
    public static void mergeSort(long arr[],int l,int h){
        if(l<h){
        int mid=(l+h)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,h);
        merge(arr,l,mid,h);
        }
    }
    public static long getInversions(long arr[], int n) {
        // Write your code here.
       ans=0;
       mergeSort(arr,0,n-1);
       return ans;
    }
}