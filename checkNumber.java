package deloitte;
import java.io.*;


public class checkNumber {
    static boolean  checkNumber(int n)
    {
    	boolean flag=true;
    	int prev=-1;
    	int type=-1;
    	while(n!=0)
    	{
    		if(type==-1)
    		{
    			if(prev==-1)
    			{
    				prev=n%10;
    				n=n/10;
    				continue;
    			}
    			if(prev>n%10)
    			{
    				type=1;
    				prev=n%10;
    				n=n/10;
    				continue;
    			}
    			prev=n%10;
    			n=n/10;
    		}
    		else
    		{
    			if(prev==n%10)
    			{
    				flag=false;
    				break;
    			}
    			if(prev<n%10)
    			{
    				flag=false;
    				break;
    			}
    			prev=n%10;
    			n=n/10;
    		}
    	}
    	return flag;
    }
    public static void main(String[] args) {
    int n=127548;
    String count;
	if(checkNumber(n))
    	count<<"yes";
    else
    	count<<"no";
	return 0;
	

}
