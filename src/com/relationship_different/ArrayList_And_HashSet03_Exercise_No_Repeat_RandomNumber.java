package com.relationship_different;

import java.util.ArrayList;
import java.util.HashSet;
/**
 * ����50�� 0-9999֮����������Ҫ�������ظ���
 * ʹ��Set���������������ϵ���������ֱ������50��λ�á�
 * ��ΪSet�в��ظ������ԣ��������õ���50������һ���ǲ��ظ���
 */
public class ArrayList_And_HashSet03_Exercise_No_Repeat_RandomNumber {
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		while(numbers.size()<50){
			int i = (int) (Math.random() * 10000);
			numbers.add(i);
		}
		System.out.println("�õ�50�����ظ��������");
		System.out.println(numbers);
   	}
}
