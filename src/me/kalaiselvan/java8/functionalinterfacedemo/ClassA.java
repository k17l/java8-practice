package me.kalaiselvan.java8.functionalinterfacedemo;

public class ClassA {

	public static void main(String[] args) {
		InterfaceA interfa = (a,b) -> System.out.println(a+b);
		interfa.sum(10, 11);
		
		InterfaceB interfb = () -> System.out.println("Show method");
		interfb.show();
		
	}
}
