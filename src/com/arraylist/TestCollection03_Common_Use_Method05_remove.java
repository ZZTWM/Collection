package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * ɾ����
 * 	remove���ڰѶ����ArrayList��ɾ��
 * 	remove���Ը����±�ɾ��ArrayList��Ԫ��
 * 	heros.remove(2);
 * 	Ҳ���Ը��ݶ���ɾ��
 * 	heros.remove(specialHero);
 * @author Administrator
 *
 */
public class TestCollection03_Common_Use_Method05_remove {
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<Hero>();
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + i));
		}
		Hero specialHero = new Hero("special hero");
		heros.add(specialHero);
		
		System.out.println(heros);
		heros.remove(2);
		 System.out.println("ɾ���±���2�Ķ���");
		 System.out.println(heros);
		 System.out.println("ɾ��special hero");
		 heros.remove(specialHero);
		 System.out.println(heros);
	}
}
