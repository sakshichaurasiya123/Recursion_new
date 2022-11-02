import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    static int result =0;
    
	public static void main (String[] args) {
		//code
		String s="abc";
		int i=0;
		StringBuffer s1=new StringBuffer();
		subsequence(s1,s,i,s.length());
		System.out.println("Number of subset = "+result);
	}
	
	public static void subsequence(StringBuffer s1, String s, int i,int N)
	{
	    if((i)==N)
	    {
	        System.out.println(s1);
	        result++;
	        return;
	    }
	    
	    //System.out.println(i);
	     subsequence(s1.append(s.charAt(i)),s, i+1,N);
	     s1.deleteCharAt(s1.length()-1);
         subsequence(s1,s, i+1,N);
         	    
	}
}
