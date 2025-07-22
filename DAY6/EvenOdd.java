package com.demo.DAY6;

import java.util.Scanner;


class Even extends Thread{
	int []Array;
	public Even(int []Array) {
		this.Array=Array;
	}
	@Override
	public void run() {
		for (int i : Array) {
			if(i%2==0)
				System.out.println("Even : "+i);
			
		}
		
	}
}
class Odd extends Thread{
	int []Array;
	public Odd(int []Array) {
		this.Array=Array;
	}
	@Override
	public void run() {
		for (int i : Array) {
			if(i%2!=0)
				System.out.println("Odd : "+i);
			
		}
		
	}
}

public class EvenOdd {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Array Size");
		int n=sc.nextInt();
		int []A=new int[n];
		System.out.println("Array Elements");
		for (int i = 0; i < n; i++) {
			A[i]=sc.nextInt();
			
		}
		Even T1=new Even(A);
		Odd T2=new Odd(A);
		T1.start();
		T1.join();
		T2.start();
		sc.close();
	}

}
