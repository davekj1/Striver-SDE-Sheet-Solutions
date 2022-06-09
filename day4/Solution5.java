import java.util.HashMap;
public class Solution5{
       public  int solve(int[] A, int B) {
    	HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
    	int xor=0;
    	int count=0;
    	for(int i=0;i<A.length;i++){
    		xor=xor ^ A[i];
    		if(hash.get(xor ^ B)!=null)
    			count+=hash.get(xor ^ B);
    		if(xor==B)
    			count++;
    		if(hash.get(xor)!=null){
    			hash.put(xor,hash.get(xor)+1);
    		}
    		else{
    			hash.put(xor,1);
    		}
    	}
    	return count;
    }
}
