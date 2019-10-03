package me.kalaiselvan.java8.lambdaexpressiondemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionDemo1 {

	public static void main(String[] args) {
		List<String> names1 = Arrays.asList("Mahesh","Suresh","Ramesh","Naresh","Kalpesh");
		System.out.println("Original List --> " + names1);
		Collections.sort(names1,(s1,s2) -> s2.compareTo(s1));
		System.out.println("Sorted from Z to A --> " + names1);
	}
}