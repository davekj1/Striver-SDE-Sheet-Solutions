/*Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.*/
class Solution2{
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int []> arr=new ArrayList<>(); 
        arr.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            if(arr.get(arr.size()-1)[1]>=intervals[i][0])
                arr.get(arr.size()-1)[1]=Math.max(arr.get(arr.size()-1)[1],intervals[i][1]);
            else
                arr.add(intervals[i]);
        }
        int ans[][]=new int[arr.size()][2];
        for(int i=0;i<arr.size();i++){
            ans[i][0]=arr.get(i)[0];
            ans[i][1]=arr.get(i)[1];
        }
        return ans;
    }
}