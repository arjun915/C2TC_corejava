package com.ait.statickeyword;

public class example1 {
	int rollno;
	String name;
    static String college="AIT";
    example1(int r,String n)
    {
    	rollno=r;
    	name=n;
    }
    static void change()
    {
    	college="IIT";
    }
    void display()
    {
    	System.out.println(rollno+" "+name+" "+college);
    }
	public static void main(String[] args) {
		example1 s1= new example1(123,"arjun");
		example1 s2= new example1(11234,"bharath");
		change();
		s1.display();
		s2.display();
		
		// TODO Auto-generated method stub

	}

}
