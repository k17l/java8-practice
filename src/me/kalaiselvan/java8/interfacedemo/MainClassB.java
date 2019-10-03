package me.kalaiselvan.java8.interfacedemo;

public class MainClassB extends MainClassA implements InterfaceA,InterfaceB{

	public static void main(String[] args) {
		MainClassB obj = new MainClassB();
		/* 
		 * If the same is present in super class and all the implemented interface 
		 * the method present in super class has the priority
		 */
		obj.show();
		
		
	}
}
