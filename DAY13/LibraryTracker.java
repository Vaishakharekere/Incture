package com.demo.DAY13;


import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LibraryTracker {

	public static void main(String[] args) {
		TreeMap<String, List<String>> library=new TreeMap();
		library.put("Alice", Arrays.asList("Java Basics", "Algorithms", "Python 101"));
		library.put("Bob", Arrays.asList("Java Basics", "Data Structures", "C++ Primer"));
		library.put("Charlie", Arrays.asList("Python 101", "Java Basics", "Algorithms"));
		
		Set<String> S= new TreeSet<String>();
		for (List<String> string : library.values()) {
			S.addAll(string);
			
		}
		System.out.println("All Books");
for (String string : S) {
	
	System.out.println(string);
	
}

	}

}
