package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * תΪ����
 * toArray���԰�һ��ArrayList����ת��Ϊ���顣
 * ��Ҫע����ǣ����Ҫת��Ϊһ��Hero���飬��ô��Ҫ����һ��Hero�������͵Ķ����toArray()��
 * ����toArray������֪������ϣ��ת��Ϊ�������͵����飬����ֻ��ת��ΪObject����
 * @author Administrator
 *
 */
public class TestCollection03_Common_Use_Method08_toArray {
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<Hero>();
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + i));
		}
		
		Hero specialHero = new Hero("special hero");
		heros.add(specialHero);
		System.out.println(heros);
		Hero hs[] = (Hero[])heros.toArray(new Hero[]{});
		System.out.println("���飺" + hs);
	}
}
