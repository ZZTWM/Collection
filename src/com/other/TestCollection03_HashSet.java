package com.other;

import java.util.HashSet;
/**
 * Set�е�Ԫ�أ������ظ�
 * @author Administrator
 *
 */
public class TestCollection03_HashSet {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		names.add("gareen");
		System.out.println(names);
		
		//�ڶ��β���ͬ�������ݣ��ǲ岻��ȥ�ģ�������ֻ�ᱣ��һ��
		names.add("gareen");
		System.out.println(names);
	}
}
