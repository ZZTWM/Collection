package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * �ж��Ƿ����
 * 	ͨ������contains �ж�һ�������Ƿ���������
 * 	�жϱ�׼�� �Ƿ���ͬһ�����󣬶�����name�Ƿ���ͬ
 * @author Administrator
 *
 */
public class TestCollection03_Common_Use_Method02_contains {
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<Hero>();
		
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + i));
		}
		Hero specialHero = new Hero("special hero");
		heros.add(specialHero);
		
		System.out.println(heros);
        // �ж�һ�������Ƿ���������
        // �жϱ�׼�� �Ƿ���ͬһ�����󣬶�����name�Ƿ���ͬ
		System.out.print("��Ȼһ���µĶ�������Ҳ�� hero 1������contains�ķ�����:");
		System.out.println(heros.contains(new Hero("hero 1")));//false
		System.out.print("����specialHero���жϣ�contains�ķ�����:");
		System.out.println(heros.contains(specialHero));//true
	}
}
