package me.kalaiselvan.java8.interfacedemo;

public interface InterfaceA {

	default void defaultMethodDemo() {
		System.out.println("Default Method Demo");
	}
	
	static void staticMethodDemo() {
		System.out.println("Static method from Interface A");
	}
	
	default void show() {
		System.out.println("Show method from Interface A");
	}
	
	
	/*
	 * A default method cannot override a method from java.lang.object
	 */
	
	/*
	 * default void equals(Object o) { System.out.println("Some Implementation"); }
	 */
}