package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * �滻��set�����滻ָ��λ�õ�Ԫ��
 * @author Administrator
 *
 */
public class TestCollection03_Common_Use_Method06_set {
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<Hero>();
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + i));
		}
		Hero specialHero = new Hero("special hero");
		heros.add(specialHero);
		
		System.out.println(heros);
		System.out.println("���±���5��Ԫ�أ��滻Ϊ\"hero 5\"");
		heros.set(5, new Hero("�滻�� hero 5"));
		System.out.println(heros);
	}
}
