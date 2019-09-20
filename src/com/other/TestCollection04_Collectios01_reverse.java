package com.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection04_Collectios01_reverse {
	public static void main(String[] args) {
		//初始化集合numbers
		List<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}
		
		System.out.println("集合中的数据：");
		System.out.println(numbers);
		
		Collections.reverse(numbers);
		
		System.out.println("翻转后集合中的数据:");
		System.out.println(numbers);
	}
}
