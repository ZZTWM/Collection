package com.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * shuffle ����List�����ݵ�˳��
 * @author Administrator
 *
 */
public class TestCollection04_Collectios02_shuffle {
	public static void main(String[] args) {
		//��ʼ������numbers
		List<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}
		
		System.out.println("�����е����ݣ�");
		System.out.println(numbers);
		
		Collections.shuffle(numbers);
		
		System.out.println("�����󼯺��е����ݣ�");
		System.out.println(numbers);
		
	}
}
