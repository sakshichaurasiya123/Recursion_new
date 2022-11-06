import java.io.*;
import java.lang.*;
class GFG {
    public static void  permute(char[]a,int l)
    {
        if(l==(a.length-1))
        {
            System.out.println(new String(a));
            return;
        }
        for(int i=l; i<a.length; i++){
            swap(a,i,l);
            permute(a,l+1);
            swap(a,i,l);
        }
    }
    
    public static void swap(int i,int l){
        char c=a[i];
            a[i]=a[l];
            a[l]=c;
        
    }
	public static void main (String[] args) {
	    String str="abc";
	    char [] a=str.toCharArray();
	    int l=0;
	    permute(a,l);
	}
}
