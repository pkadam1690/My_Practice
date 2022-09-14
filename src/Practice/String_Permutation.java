package Practice;


public class String_Permutation
{

	static void swap(Character ch, String st)
	{
		//System.out.println(ch+st);
		String str="";
		
		for(int i=st.length()-1;i>=0;i--)
		{
			
			str=str+st.charAt(i);
		}
		System.out.println(ch+str);
	}
	public static void main(String[] args) 
	{

		String str= "ABC";
		
		char[] chr = str.toCharArray();
		//System.out.println(str.substring(0, 3));
		
		for(int i=0;i<chr.length;i++)
		{
			String st="";
			for(int j=0;j<chr.length;j++)
			{
				if(i!=j)
				{
					st = st+str.charAt(j);
				}
				
			}
			
			System.out.println(str.charAt(i)+st);
			swap(str.charAt(i),st);
			//System.out.println(str.charAt(i)+swap(st));
			
			
		}
	
	
}
	
}
