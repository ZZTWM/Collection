package com.other;

import java.util.HashSet;
import java.util.Iterator;

public class TestCollection03_HashSet03 {
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<Integer>();
		for (int i = 0; i < 20; i++) {
			numbers.add(i);
		}
		
		//Set���ṩget��������ȡָ��λ�õ�Ԫ��
		//numbers.get(0)
		
		//����Set���Բ��õ�����iterator
		for (Iterator<Integer> iterator = numbers.iterator();iterator.hasNext();) {
			Integer i = (Integer)iterator.next();
			System.out.println(i);
		}
		
		//���߲�����ǿ��forѭ��
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
	}
}
