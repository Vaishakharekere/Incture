package com.demo.DAY14;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Array_Set {

	public static void main(String[] args) {
		
		ArrayList<String> AL=new ArrayList<String>();
		AL.add("alice@example.com");
		AL.add("bob@example.com");
		AL.add( "alice@example.com");
		AL.add("charlie@example.com");
		AL.add(	"bob@example.com");
		AL.add("david@example.com");

		Set<String> S =new TreeSet<String>(AL);
		System.out.println(S);
	}

}
