package com.ait.thiskeyword;

public class Demo {
	Demo()
	{
		System.out.println("RCb");
	}
	Demo(int x)
	{
		this();
		System.out.println(x);
		
	}
}
 class TestThis5
 {
	 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo a=new Demo(10);
	}

}