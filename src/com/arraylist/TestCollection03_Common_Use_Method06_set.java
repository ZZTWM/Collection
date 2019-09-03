package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * 替换：set用于替换指定位置的元素
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
		System.out.println("把下标是5的元素，替换为\"hero 5\"");
		heros.set(5, new Hero("替换成 hero 5"));
		System.out.println(heros);
	}
}
