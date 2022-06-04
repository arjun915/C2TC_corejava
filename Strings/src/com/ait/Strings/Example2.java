package com.ait.Strings;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Are you fine?";
		int index = str.lastIndexOf("fine");
		System.out.println(index);
		index = str.lastIndexOf("you", 25);
		System.out.println(index);
		index = str.lastIndexOf("are", 25);
		System.out.println(index);
	}

}
