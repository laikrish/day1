package com.capgemini.day2;

public class WordDel {

	public static Object checkWodDel(String string) {
		// TODO Auto-generated method stub
		int i,j;
		String word[]=string.split(" ");
		int x=word.length;
		for(i=0;i<x;i++)
		{
			if(word[i]!=null)
			{
				for(j=i+1;j<x;j++)
				{
					if(word[i].equals(word[j]))
					{
						word[j]=null;
					}
				}
			}
		}
		for(int k=0;k<x;k++)
		{
			if(word[k]!=null)
			{
				return(word[k]+ ' ');
			}
		}
		return string;
			}
	


}
