package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * size ���ڻ�ȡArrayList�Ĵ�С
 * @author Administrator
 *
 */
public class TestCollection03_Common_Use_Method07_size {
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<Hero>();
		// ��ʼ��5������
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero" + i));
		}
		
		Hero specialHero = new Hero("special hero");
		heros.add(specialHero);
		System.out.println(heros);
		System.out.println("��ȡArrayList�Ĵ�С��");
		System.out.println(heros.size());
	}
}
