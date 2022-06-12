/*You are given the schedule of N meetings with their start time Start[i] and end time End[i]. But you have only 1 meeting room. So, you need to tell the meeting numbers you can organize in the given room, such that the number of meetings organized is maximum.*/
import java.util.*;
class Pair{
    int a;
    int b;
    int se;
    Pair(int a,int b,int se){
        this.a=a;
        this.b=b;
        this.se=se;
    }
}
public class Solution1{
    public static List<Integer> maximumMeetings(int[] start, int[] end) {        
       Pair[] pair=new Pair[start.length];
       for(int i=0;i<start.length;i++){
           pair[i]=new Pair(start[i],end[i],i+1);
       }
       Arrays.sort(pair,(x,y)->x.b-y.b);
       List<Integer> list=new ArrayList<Integer>();
       list.add(pair[0].se);
       int lastEndTime=pair[0].b;
       for(int i=1;i<pair.length;i++){
           if(lastEndTime<pair[i].a){
               lastEndTime=pair[i].b;
               list.add(pair[i].se);
           }
       }
        return list;
    }
}
