package com.exercise;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * �������Ҫ�жϼ������Ƿ����һ�� name���� "hero 1"�Ķ���Ӧ����ô����
 * @author Administrator
 *
 */
public class Exercise01_Juege_Whether_Same {
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<Hero>();
		// ��ʼ��5������
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + i));
		}
		Hero specialHero = new Hero("special hero");
		heros.add(specialHero);
		String name = "hero 1";
		for (int i = 0; i < heros.size(); i++) {
			Hero h = heros.get(i);
			if(name.equals(h.name)){
				System.out.printf("�ҵ���name��%s�Ķ���",name);
				break;
			}
		}
	}
}
