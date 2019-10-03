package me.kalaiselvan.java8.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7);
		Stream<Integer> s1 = values.stream();
		
		Function<Integer,Integer> f = new Function<Integer, Integer>() {
			public Integer apply(Integer i) {
				return i*2;
			}
		};
		
		Stream<Integer> s2 = s1.map(f);
		
		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
			public Integer apply(Integer i,Integer j) {
				return i+j;
			}
		};
		
		Integer result = s2.reduce(0,b);
		System.out.println(result);
		
	}
}