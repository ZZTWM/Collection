package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * ��ȡ����������λ�ã�indexOf
 * 	indexOf�����ж�һ��������ArrayList��������λ��
 * 	��containsһ�����жϱ�׼�Ƕ����Ƿ���ͬ�����Ƕ����nameֵ�Ƿ����
 * @author Administrator
 *
 */
public class TestCollection03_Common_Use_Method04_indexOf {
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<Hero>();
		//��ʼ��5������
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + i));
		}
		
		Hero specialHero = new Hero("special hero");
		heros.add(specialHero);
		
		System.out.println(heros);
		System.out.println("specialHero������λ��:" + heros.indexOf(specialHero));
		
		System.out.println("�µ�Ӣ�ۣ�����������\"hero 1\"������λ��:" + heros.indexOf(new Hero("hero 1")));
	}
}
