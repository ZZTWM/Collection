package com.other;

import java.util.HashMap;

/**
 * HashMap的键值对
 * HashMap储存数据的方式是—— 键值对
 * @author Administrator
 *
 */
public class TestCollection02_HashMap01 {
	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("adc", "物理英雄");
		dictionary.put("apc", "魔法英雄");
		dictionary.put("t", "坦克");
		System.out.println(dictionary.get("t"));
	}
}
