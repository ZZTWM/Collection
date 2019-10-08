package com.relationship_different;

import java.util.HashMap;
import java.util.Set;

/**
 * ʹ�����¼�ֵ�ԣ���ʼ��һ��HashMap��
 * adc - ����Ӣ��
 * apc - ħ��Ӣ��
 * t - ̹��
 * �����HashMap���з�ת��key���value,value���key
 * ��ʾ�� keySet()���Ի�ȡ���е�key, values()���Ի�ȡ���е�value
 * @author Administrator
 *
 */
public class HashMap_And_HashTable02_Exercise_Reverse_Key_And_Value {
	public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        HashMap<String,String> temp = new HashMap<>();
        map.put("adc", "����Ӣ��");
        map.put("apc", "ħ��Ӣ��");
        map.put("t", "̹��");
         
        System.out.println("��ʼ�����Map:");
        System.out.println(map);
        Set<String> keys = map.keySet();
         
        for (String key : keys) {
            String value = map.get(key);
            temp.put(value, key);
        }
        map.clear();
        map.putAll(temp);
         
        System.out.println("��ת���Map:");
        System.out.println(map);
	}
}
