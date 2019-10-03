package me.kalaiselvan.java8.interfacedemo;

public interface InterfaceB {

	default void show() {
		System.out.println("Show method from Interface A");
	}
	
	static void staticMethodDemo() {
		System.out.println("Static method from Interface A");
	}
}
