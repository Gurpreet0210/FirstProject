package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeJava8 {

	public static void main(String[] args) {
		
		String sentence = "ILOVEJAVA";
		String[] a = sentence.split("");
		System.out.println(Arrays.toString(a));
		
		// count of each character
		Map<String, Long> map = Arrays.stream(a).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);   // {A=2, E=1, V=2, I=1, J=1, L=1, O=1}
		
		// duplicate elements from Array
		List<String> map2 = Arrays.stream(a).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(map2);

		
		// Unique elements from Array
		List<String> uniqueCharacters = Arrays.stream(a).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(c -> c.getValue() == 1).map(Map.Entry :: getKey)
		.collect(Collectors.toList());
		
		System.out.println(uniqueCharacters);
		
		// Find first match
		String s = Arrays.stream(a).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(c -> c.getValue() == 1).findFirst().get().getKey();
		
		System.out.println(s);
		
		
		// Sorted Array
		int[] numbers = {5,7,2,9,23,54,66};
		List<Integer> intArr = Arrays.stream(numbers).boxed().sorted().collect(Collectors.toList());
		System.out.println( intArr);
		
		// Reverse sorted Array
		int[] numbers2 = {5,7,2,9,23,54,66};
		List<Integer> intArr2 = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println( intArr2);		
		
		
		// Second highest value from Array
		int[] numbers3 = {5,7,2,9,23,54,66};
		Integer intArr3 = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		System.out.println( intArr3);
		
		
		// Longest string from Array
		String[] stringArr = {"java", "spring", "sprngboot","microservices"};
		String result = Arrays.stream(stringArr).reduce((s1, s2) -> (s1.length() > s2.length()) ? s1 : s2).get();
		System.out.println(result);
		
		// find numbers from Integer array which start from 1
		int[] numbers4 = {3,5,6,33,55,46,43,13,14,16,1};
		List<String> s4 = Arrays.stream(numbers4).boxed().map(n -> n+"").filter(s1 -> s1.startsWith("1")).collect(Collectors.toList());
		System.out.println(s4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
