package com.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection04_Collectios01_reverse {
	public static void main(String[] args) {
		//��ʼ������numbers
		List<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}
		
		System.out.println("�����е����ݣ�");
		System.out.println(numbers);
		
		Collections.reverse(numbers);
		
		System.out.println("��ת�󼯺��е�����:");
		System.out.println(numbers);
	}
}
