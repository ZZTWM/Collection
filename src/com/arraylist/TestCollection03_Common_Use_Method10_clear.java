package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * clear 清空一个ArrayList
 * 清空:clear
 * @author Administrator
 *
 */
public class TestCollection03_Common_Use_Method10_clear {
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<Hero>();
		//初始化5个对象
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + i));
		}
		
		System.out.println("ArrayList heros:\t" + heros);
		System.out.println("使用clear清空");
		heros.clear();
		System.out.println("ArrayList heros:\t" + heros);
	}
}
