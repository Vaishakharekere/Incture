package com.demo.DAY4;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
	
	String str=sc.nextLine();
	String []arr=str.split(" ");
	int a=arr.length;
	StringBuffer S=new StringBuffer();
	while(a-1>=0) {
		S.append(arr[a-1]);
		S.append(" ");
		a--;
	}
		
	System.out.println(S);
	sc.close();

		}
		
	}


