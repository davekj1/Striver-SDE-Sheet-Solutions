class Solution3{
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
            return;
        }
        else if(n==0){
            return;
        }
        int i=0;
        while(i<m){
        	if(nums1[i]>nums2[0]){
        		int temp=nums1[i];
        		nums1[i]=nums2[0];
        		int k=0;
        		while(k<n-1 && temp>nums2[k+1]){
        			nums2[k]=nums2[k+1];
                    k++;
        		}
        		nums2[k]=temp;
        	}
            i++;
        }
       for(int j=m;j<m+n;j++){
        		nums1[j]=nums2[j-m];
       }
    }
}