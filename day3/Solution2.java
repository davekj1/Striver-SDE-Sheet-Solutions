class Solution2{
    public double myPow(double x, int n) {
        if(n==0)
        	return 1.0;
        if(n==-1)
        	return 1.0/x;
        if(n==1)
        	return x;
        if(n%2==0){
        	double val=myPow(x,n/2);
        	returm val*val;
        }
        else{
        	double val=myPow(x,(n-1)/2);
        	return x*val*val;
        }
    }
}