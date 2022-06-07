/*
    Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
*/
class Solution1{
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> cols=new HashSet<Integer>();
        HashSet<Integer> rows=new HashSet<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    cols.add(j);
                    rows.add(i);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(cols.contains(j) || rows.contains(i))
                    matrix[i][j]=0;
            }
        }
    }
}
