package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * 判断是否存在
 * 	通过方法contains 判断一个对象是否在容器中
 * 	判断标准： 是否是同一个对象，而不是name是否相同
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
        // 判断一个对象是否在容器中
        // 判断标准： 是否是同一个对象，而不是name是否相同
		System.out.print("虽然一个新的对象名字也叫 hero 1，但是contains的返回是:");
		System.out.println(heros.contains(new Hero("hero 1")));//false
		System.out.print("而对specialHero的判断，contains的返回是:");
		System.out.println(heros.contains(specialHero));//true
	}
}
