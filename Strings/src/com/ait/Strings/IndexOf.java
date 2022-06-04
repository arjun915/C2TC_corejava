package com.ait.Strings;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "This is a real world";
		int index4 = s1.indexOf('s');
		System.out.println(index4);
		int index1 = s1.indexOf("is");
		int index2 = s1.indexOf("world");
		System.out.println(index1);
		System.out.println(index2);
		int index3 = s1.indexOf("is",6);
		System.out.println(index3);
	}

}
