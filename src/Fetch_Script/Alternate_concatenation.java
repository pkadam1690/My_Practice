package Fetch_Script;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Alternate_concatenation {

	
	public static void main(String[] args) 
	{
		String s1="abcd";
		String s2="ABCD";
		String s3="";
		
		//Approach 1
		if(s1.length()==s2.length())
		{
			
		for(int i=0;i<s1.length();i++)
		{
			//s3=s3+s1.charAt(i)+s2.charAt(i);
			
			s3=s3.concat(Character.toString(s1.charAt(i)).concat(Character.toString(s2.charAt(i))));
		}
			
		System.out.println(s3);
		}
			
		System.out.println("###########################################");
		//Approach 2
		ArrayList l = new ArrayList(); 
		String s4="";
		if(s1.length()==s2.length())
		{
		
		for(int i=0;i<s1.length();i++)
		{
			l.add(s1.charAt(i));
			l.add(s2.charAt(i));
		}

		}	
	}
}
