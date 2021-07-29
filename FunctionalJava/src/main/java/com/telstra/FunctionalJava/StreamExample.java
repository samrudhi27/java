package com.telstra.FunctionalJava;

import java.util.*;
import java.util.stream.Stream;

public class StreamExample {
	
	public static void main(String args[]) {
		System.out.println("**************USING EXISTING COLLECTION************");
		List<String> strings = Arrays.asList("Hollis", "HollisChuang", "hollis", "Hello", "HelloWorld", "Hollis");
		Stream<String> stream = strings.stream();
		//System.out.println(stream);
		stream.forEach(System.out::println);
		System.out.println("************USING STREAM METHOD***************");
		Stream<String> s = Stream.of("Hollis", "HollisChuang", "hollis", "Hello", "HelloWorld", "Hollis");
		s.forEach(System.out::println);
		System.out.println("************FILTER METHOD***************");
		List<String> strings1 = Arrays.asList("Hollis", "", "HollisChuang", "H", "hollis");
		strings1.stream().filter(string -> ! string.isEmpty()).forEach(System.out::println);
		System.out.println("***********MAP METHOD****************");
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		numbers.stream().map( i -> i*i).forEach(System.out::println);
		System.out.println("*************LIMIT METHOD**************");
		List<Integer> numbers1 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		numbers1.stream().limit(4).forEach(System.out::println);
		System.out.println("*************SORTED METHOD**************");
		List<Integer> number2 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		number2.stream().sorted().forEach(System.out::println);
		System.out.println("*************DISTNCT METHOD**************");
		List<Integer> number3 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		number3.stream().distinct().forEach(System.out::println);
		/*
		 * System.out.println("*************MIX OF METHODS**************"); List<String>
		 * str = Arrays.asList("Hollis", "HollisChuang", "hollis", "Hello",
		 * "HelloWorld", "Hollis"); Stream ss = str.stream().filter(string ->
		 * string.length()<= 6).map(String::length).sorted().limit(3) .distinct();
		 * ss.forEach(System.out::println);
		 */
		System.out.println("*************COUNT METHOD**************");
		List<String> st = Arrays.asList("Hollis", "HollisChuang", "hollis","Hollis666", "Hello", "HelloWorld", "Hollis");
		System.out.println(st.stream().count());
		System.out.println("*************COUNT METHOD**************");
		System.out.println("*************COUNT METHOD**************");
		System.out.println("*************COUNT METHOD**************");
		
	
	}

}
