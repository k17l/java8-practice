package me.kalaiselvan.java8.streamdemo;

import java.util.Arrays;
import java.util.List;

public class StreamDemo3 {
	
	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7);
		
		//Integer result = values.stream().map(i -> i*2).reduce(0, (i,j) -> i+j);
		Integer result = values.stream().map(i -> i*2).reduce(0, Integer::sum);
		System.out.println(result);
	}
}
