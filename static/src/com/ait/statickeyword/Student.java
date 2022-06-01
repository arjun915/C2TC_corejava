package com.ait.statickeyword;

public class Student {
	int age;
	static String name;
	static int salary=2000;
   Student(int a,String n)
   {
	   age=a;
	   name=n;
   }
   void display()
   {
	   System.out.println(age+" "+name+" "+salary);
	   
   }

  static void change()
   {
	   salary=500;
	   name="virat";
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s1=new Student(20,"arvind");
        Student s2=new Student(22,"bhavan");
        change();
        s1.display();
        s2.display();
        
        
        
	}

}
