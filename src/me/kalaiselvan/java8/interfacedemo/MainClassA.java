package me.kalaiselvan.java8.interfacedemo;

public class MainClassA implements InterfaceA,InterfaceB{

	public static void main(String[] args) {
		MainClassA obj = new MainClassA();

		// Defult Method		
		obj.defaultMethodDemo();
		System.out.println("*********************************************");
		
		//Static Method
		InterfaceA.staticMethodDemo();
		InterfaceB.staticMethodDemo();
		
		System.out.println("*********************************************");
		obj.show();
	}

	/* If same method is present in both the interfaces it is mandatory to define the method
	 * in implementing class otherwise we will get compile time error
	 */
	
	@Override
	public void show() {
		InterfaceA.super.show();
		System.out.println("show() method from MainCalssA");
	}
	
	
}