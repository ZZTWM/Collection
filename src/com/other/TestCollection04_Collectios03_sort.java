package com.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * sort��List�е����ݽ�������
 * @author Administrator
 *
 */
public class TestCollection04_Collectios03_sort {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}
		
		System.out.println("�����е����ݣ�");
		System.out.println(numbers);
		
		Collections.shuffle(numbers);
		
		System.out.println("�����󼯺��е�����:");
		System.out.println(numbers);
		
		Collections.sort(numbers);
		
		System.out.println("����󼯺��е�����:");
		System.out.println(numbers);
	}
}
