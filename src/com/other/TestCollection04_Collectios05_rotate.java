package com.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * rotate ��List�е����ݣ����ҹ���ָ����λ�ĳ���
 * @author Administrator
 *
 */
public class TestCollection04_Collectios05_rotate {
	public static void main(String[] args) {
		//��ʼ������numbers
		List<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}
		
		System.out.println("�����е����ݣ�");
		System.out.println(numbers);
		
		Collections.rotate(numbers, 2);
		
		System.out.println("�Ѽ������ҹ���2����λ��������ݺ󣬼����е�����:");
		System.out.println(numbers);
	}
}
