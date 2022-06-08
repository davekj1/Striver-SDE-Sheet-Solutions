class Solution1{
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean flag=false;
        for(int i[]:matrix){
            if(i[0]<=target && i[n-1]>=target){
                int p=Arrays.binarySearch(i,target);
                flag= p<0 ? false : true;
                break;
            }
        }
        return flag;
    }
}
