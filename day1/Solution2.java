class Solution2{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        List<Integer> c=new ArrayList<Integer>();
        c.add(1);
        list.add(c);
        for(int i=1;i<numRows;i++){
        	c=list.get(i-1);
        	List<Integer> temp=new ArrayList<Integer>();
        	temp.add(1);
        	for(int j=1;j<c.size();j++){
        		temp.add(c.get(j-1)+c.get(j));
        	}
        	temp.add(1);
        	list.add(temp);
        }
        return list;
    }
}