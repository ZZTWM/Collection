package com.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * shuffle 混淆List中数据的顺序
 * @author Administrator
 *
 */
public class TestCollection04_Collectios02_shuffle {
	public static void main(String[] args) {
		//初始化集合numbers
		List<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}
		
		System.out.println("集合中的数据：");
		System.out.println(numbers);
		
		Collections.shuffle(numbers);
		
		System.out.println("混淆后集合中的数据：");
		System.out.println(numbers);
		
	}
}
