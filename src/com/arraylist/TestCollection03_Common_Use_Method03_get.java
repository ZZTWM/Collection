package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * ͨ��get��ȡָ��λ�õĶ������������±�Խ�磬һ���ᱨ��
 * @author Administrator
 *
 */
public class TestCollection03_Common_Use_Method03_get {
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<Hero>();
		// ��ʼ��5������
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + 1));
		}
		System.out.println(heros);
		
		Hero specialHero = new Hero("special hero");
		heros.add(specialHero);
		//��ȡָ��λ�õĶ���
		System.out.println(heros.get(5));
		//��������˷�Χ����Ȼ�ᱨ��
		System.out.println(heros.get(6));
 	}
}
