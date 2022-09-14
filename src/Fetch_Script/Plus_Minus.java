package Fetch_Script;
import java.util.ArrayList;

public class Plus_Minus 
{

	public static void main(String[] args) 
	{
		
		System.out.println("************************************************");
		int [] A ={1,-2,3,-4,5,2,7,0,-8,4};
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
		System.out.println("************************************************");
		int tlen=A.length;
		//System.out.println(tlen);
		int x=0,count=0,c=1;
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int i=0;i<A.length ;i++)
		{
			if(A[i]>=0)
			{
			ar.add(A[i]);
			}
			if(A[i]<0)
			{
				ar.add(c, A[i]);
				c+=2;
			}
		}
		
		System.out.println(ar);
		System.out.println("************************************************");
	}
	
}

