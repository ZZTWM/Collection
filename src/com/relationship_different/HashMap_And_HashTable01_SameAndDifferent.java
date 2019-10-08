package com.relationship_different;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * 
 * HashMap��Hashtable��ʵ����Map�ӿڣ����Ǽ�ֵ�Ա������ݵķ�ʽ
 * ����1�� 
 * HashMap���Դ�� null
 * Hashtable���ܴ��null
 * ����2��
 * HashMap�����̰߳�ȫ����
 * Hashtable���̰߳�ȫ����
 *
 */
public class HashMap_And_HashTable01_SameAndDifferent {
	public static void main(String[] args) {
		//HashMap��Hashtable��ʵ����Map�ӿڣ����Ǽ�ֵ�Ա������ݵķ�ʽ
		HashMap<String, String> hashMap = new HashMap<>();
		
		//HashMap������null��key,��value
		hashMap.put(null, "123");
		hashMap.put("123", null);
		
		Hashtable<String, String> hashtable = new Hashtable<>();
		//Hashtable������null��key��������null��value
		hashtable.put(null, "123");
		hashtable.put("123", null);
	}
}
