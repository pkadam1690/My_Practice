package Fetch_Script;

public class Upper_Lower 
{
	public static void main(String[] args) 
	{
	
		String str ="greatest Number without Loop";
		int upper=0;
		int lower=0;
		
		for(int i=0;i<str.length();i++)
		{
	
			if(Character.isUpperCase(str.charAt(i))==true && str.charAt(i)!=' ')
			{
				upper++;
			}
			else if (str.charAt(i)!=' ') 
			{
			
				lower++;
			}
			

		}
		
		System.out.println("Number of uppercase character "+upper);
		System.out.println("Number of lowercase character "+lower);
		
	}
}
