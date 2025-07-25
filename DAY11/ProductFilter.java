package com.demo.DAY11;


import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ProductFilter {

	public static void main(String[] args) {
		
		ArrayList<Product> AL=new ArrayList<Product>();
		AL.add(new Product("Mouse",500,true));
		AL.add(new Product("Keyboard",1500,true));
		AL.add(new Product("Monitor",15000,false));
		AL.add(new Product("CPU",50000,true));
		AL.add(new Product("Mouse",5000,true));
		
		Predicate<Product> ref= i->i.isAvailable()&&i.getPrice()<50000;
		
		Consumer<Product> ref1=i->System.out.println(i);
		
		display(ref1,AL,ref);
		
		
		
	}
public static void display(Consumer<Product>C,ArrayList<Product> AL,Predicate<Product>P) {
	for (Product product : AL) {
		if(P.test(product))
			C.accept(product);
		
	}

}
}
