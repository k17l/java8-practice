package me.kalaiselvan.java8.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7);
		Stream<Integer> s = values.stream();
		s.forEach(System.out::println);
		
		/*
		 *  This will throw an exception "stream has already been operated upon or closed"
		 *  Stream once used cannot be reused
		 */
		s.forEach(System.out::println);
	}
}
