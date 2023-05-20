package com.SpringCore2.Dependency_Injection.Constructor_Injection.Ambiguity_Problem;

public class Sum {

	public Sum(int a , int b) {
		System.out.println("INT , INT");
		int sum = a+b;
		System.out.println("Sum is " + sum);
		
	}
	
	public Sum(String a , String b) {
		System.out.println("String , String");
		int sum = Integer.parseInt(a)+Integer.parseInt(b);
		System.out.println("Sum is " + sum);
		
	}
	
	public Sum(Double a , Double b) {
		System.out.println("Double , Double");
		int sum = (int) (a+b);
		System.out.println("Sum is " + sum);
		
	}
	
	public Sum(int a , Double b) {
		System.out.println("Int , Double");
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		int sum = (int) (a+b);
		System.out.println("Sum is " + sum);
	}
	
	
	public Sum(String a , Double b) {
		System.out.println("String , Double");
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		int sum = (int) (Integer.parseInt(a) + b);
		System.out.println("Sum is " + sum);
	}
	
}
