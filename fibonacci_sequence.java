import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int result =0;
    
	public static void main (String[] args) {
		//code
		int N=2;
		System.out.println(fib(N));
	}
	
	public static int fib(int N)
	{
	   if(N<=1)
	    return N;
	   
	   return fib(N-1)+fib(N-2);
	}
}
