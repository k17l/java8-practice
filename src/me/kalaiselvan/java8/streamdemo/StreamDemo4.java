package me.kalaiselvan.java8.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamDemo4 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(11,20,35,46,55,68,75);
		
		// Add all numbers divisible by 5
		Integer result1 = values.stream()
								.filter(i -> i%5==0)
								.reduce(0,Integer::sum);
		System.out.println(result1);
		
		// Find the first number divisible by 5
		Optional<Integer> result2 = values.stream().filter(i -> i%5==0).findFirst();
		System.out.println(result2);
		
		// Find first number divisible by 6, if no number divisible by 6 return 0
		Integer result3 = values.stream().filter(i -> i%6==0).findFirst().orElse(0);
		System.out.println(result3);
	}
}