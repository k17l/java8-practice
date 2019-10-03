package me.kalaiselvan.java8.foreachdemo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7);
		
		System.out.println("****************** 1 ******************");
		
		for(int i=0;i<7;i++) {
			System.out.println(values.get(i));
		}
		
		System.out.println("****************** 2 ******************");
		
		Iterator<Integer> i = values.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("****************** 3 ******************");
		
		for(Integer value:values) {
			System.out.println(value);
		}
		
		System.out.println("****************** 4 ******************");
		
		values.forEach(j -> System.out.println(j));
	} 
}
