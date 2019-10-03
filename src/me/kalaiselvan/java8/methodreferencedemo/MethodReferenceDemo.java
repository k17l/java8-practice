package me.kalaiselvan.java8.methodreferencedemo;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7);
		values.forEach(System.out::println);
		System.out.println("**********************************************");
		values.forEach(MethodReferenceDemo::square);
	}
	
	public static void square(Integer i) {
		System.out.println(i*i);
	}
}