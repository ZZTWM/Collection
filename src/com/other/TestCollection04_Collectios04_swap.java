package com.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * swap �����������ݵ�λ��
 * @author Administrator
 *
 */
public class TestCollection04_Collectios04_swap {
	public static void main(String[] args) {
		// ��ʼ������numbers
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}
		
		System.out.println("�����е����ݣ�");
		System.out.println(numbers);
		
		Collections.swap(numbers, 0, 5);
		
		System.out.println("����0��5�±�����ݺ󣬼����е����ݣ�");
		System.out.println(numbers);
	}
}
