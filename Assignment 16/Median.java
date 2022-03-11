
24
25
class Median
{
	public static void main(String arg[])	
	{
             	    int n=5;
	   double a[]=new double[n];
                   a[0]=10;
	    a[1]=20;
	    a[2]=30;
	    a[3]=40;
	    a[4]=50;
	  
	double m=0;
	if(n%2==1)
	{
		m=a[(n+1)/2-1];
	}
	else
	{
		m=(a[n/2-1]+a[n/2])/2;
	}
	
       System.out.println("Median :"+m);
}
}