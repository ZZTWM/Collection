package com.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * swap 交换两个数据的位置
 * @author Administrator
 *
 */
public class TestCollection04_Collectios04_swap {
	public static void main(String[] args) {
		// 初始化集合numbers
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}
		
		System.out.println("集合中的数据：");
		System.out.println(numbers);
		
		Collections.swap(numbers, 0, 5);
		
		System.out.println("交换0和5下标的数据后，集合中的数据：");
		System.out.println(numbers);
	}
}
