package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;
/**
 * ���ӣ�
 * 	add �������÷�
 * 	��һ����ֱ��add���󣬰Ѷ�����������
 * 	heros.add(new Hero("hero " + i));
 * 	�ڶ�������ָ��λ�üӶ���
 * 	heros.add(3, specialHero);
 * @author Administrator
 *
 */
public class TestCollection03_Common_Use_Method01_add {
	
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<Hero>();
		// ��5��������뵽ArrayList��
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero" + i));
		}
		System.out.println(heros);
		// ��ָ��λ�����Ӷ���
		Hero specialHero = new Hero("special hero");
		heros.add(3,specialHero);
		System.out.println(heros.toString());
	}
}
