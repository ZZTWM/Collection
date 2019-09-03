package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * 删除：
 * 	remove用于把对象从ArrayList中删除
 * 	remove可以根据下标删除ArrayList的元素
 * 	heros.remove(2);
 * 	也可以根据对象删除
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
		 System.out.println("删除下标是2的对象");
		 System.out.println(heros);
		 System.out.println("删除special hero");
		 heros.remove(specialHero);
		 System.out.println(heros);
	}
}
