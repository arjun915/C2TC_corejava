package com.ait.enums;

public class Example2 {
 public enum Season{
	 summer,winter,rainy,spring
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Season s:Season.values()) {
			System.out.println(s);
		}
       System.out.println(Season.valueOf("spring"));
       System.out.println(Season.valueOf("spring").ordinal());
       System.out.println(Season.valueOf("summer").ordinal());
       
	}

}
