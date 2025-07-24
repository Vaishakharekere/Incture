package com.demo.DAY10;

import java.util.HashMap;
import java.util.Scanner;

public class WordFreq {

	public static void main(String[] args) {
		HashMap<String,Integer> HM=new HashMap<String, Integer>(); //HashMap of String as Key and Value as Integer
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String arr[]=str.split(" ");
	
	for (String string : arr) {
		if(HM.containsKey(string)) //Checks if the Key Already exist ,if yes then Increments
		HM.put(string,HM.get(string)+1);
		else
			HM.put(string,1);//Otherwise Assigns Key with Value 1
	}
	System.out.println(HM);
	sc.close();
	

	}

}