package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * ����һ���������ж��󶼼ӽ���:addAll
 * @author Administrator
 *
 */
public class TestCollection03_Common_Use_Method09_addAll {
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<Hero>();
		
		// ��ʼ��5������
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + i));
		}
		System.out.println("ArrayList heros:\t" + heros);
		//����һ�����������е�Ԫ�أ������뵽����������
		ArrayList<Hero> anotherHeros = new ArrayList<Hero>();
		anotherHeros.add(new Hero("hero a"));
		anotherHeros.add(new Hero("hero b"));
		anotherHeros.add(new Hero("hero c"));
		System.out.println("anotherHeros heros:\t" + anotherHeros);
		heros.addAll(anotherHeros);
		System.out.println("����һ��ArrayList��Ԫ�ض����뵽��ǰArrayList:");
		System.out.println("ArrayList heros:\t" + heros);
	}
}
