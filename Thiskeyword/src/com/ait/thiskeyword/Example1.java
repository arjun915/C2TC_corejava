package com.ait.thiskeyword;

public class Example1 
	{
		Example1()
		{
			System.out.println("RCb e");
		}
	     Example1(int x)
	     {
	    	 this();
	    	 System.out.println(x);
	     }
	  }
 class TestThis
 {
	
	public static void main(String[] args) 
	{
		Example1 e=new Example1(50);
         
	
	}
}
