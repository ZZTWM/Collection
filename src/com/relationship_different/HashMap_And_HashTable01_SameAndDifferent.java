package com.relationship_different;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * 
 * HashMap和Hashtable都实现了Map接口，都是键值对保存数据的方式
 * 区别1： 
 * HashMap可以存放 null
 * Hashtable不能存放null
 * 区别2：
 * HashMap不是线程安全的类
 * Hashtable是线程安全的类
 *
 */
public class HashMap_And_HashTable01_SameAndDifferent {
	public static void main(String[] args) {
		//HashMap和Hashtable都实现了Map接口，都是键值对保存数据的方式
		HashMap<String, String> hashMap = new HashMap<>();
		
		//HashMap可以用null作key,作value
		hashMap.put(null, "123");
		hashMap.put("123", null);
		
		Hashtable<String, String> hashtable = new Hashtable<>();
		//Hashtable不能用null作key，不能用null作value
		hashtable.put(null, "123");
		hashtable.put("123", null);
	}
}
