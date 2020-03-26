package com.epam.tddjunit;

public class DeleteFirst2As {
		public String delete(String string)
		{
			String result;
			if(string.length()<2)
			{
				result=string.replace("A","");
				
			}
			else
			{
			result=string.substring(0,2).replace("A","")+string.substring(2,string.length());
			}
			return result;
		}
}
