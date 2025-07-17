package com.demo.DAY4;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		StringBuffer S=new StringBuffer();
	String str=sc.nextLine();
	String []arr=str.split(" ");
		for (String string : arr) {
			S.append(string+" ");
		}
		S.reverse();
		System.out.println(S);
	}

}
