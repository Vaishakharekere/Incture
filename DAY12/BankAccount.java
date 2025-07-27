package com.demo.DAY12;

import java.util.ArrayList;
import java.util.function.Consumer;


public class BankAccount {

	public static void main(String[] args) {
	ArrayList<Bank> T=new ArrayList<Bank>();
	T.add(new Bank("Vaishakh",800,true));
	T.add(new Bank("Advaith",1800,true));
	T.add(new Bank("SKPV",800,false));
	T.add(new Bank("Chitte",2000,true));
	T.add(new Bank("Ananya",3000,true));
	T.add(new Bank("BYKS",3000,false));
	
	Consumer<Bank> ref=i->{if(i.isActive()==true && i.getSalary()<5000) {
		i.setSalary(i.getSalary()*1.25);
	}
		
	};
display(ref, T);
	}
	
	public static void display(Consumer<Bank> ref,ArrayList<Bank> T) {
		for (Bank bank : T) {
			ref.accept(bank);
			System.out.println(bank);
			
		}
	}

}
