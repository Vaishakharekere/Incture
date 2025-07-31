package com.demo.DAY16;

import java.util.Arrays;
import java.util.List;

public class Java8 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList(
			    "Amit", "Ajay", "Bob", "Alice", "Anu", "Ravi", "Amar", "Tom", "Anna"
			);
		
		names.stream().filter(i->i.startsWith("A")&& i.length()>3).map(String::toUpperCase).sorted().forEach(System.out::println);
	}

}
