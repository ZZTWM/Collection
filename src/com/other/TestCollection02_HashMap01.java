package com.other;

import java.util.HashMap;

/**
 * HashMap�ļ�ֵ��
 * HashMap�������ݵķ�ʽ�ǡ��� ��ֵ��
 * @author Administrator
 *
 */
public class TestCollection02_HashMap01 {
	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("adc", "����Ӣ��");
		dictionary.put("apc", "ħ��Ӣ��");
		dictionary.put("t", "̹��");
		System.out.println(dictionary.get("t"));
	}
}
