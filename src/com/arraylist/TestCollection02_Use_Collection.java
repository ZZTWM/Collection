package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * ArrayList��Ŷ���:
 * Ϊ�˽������ľ����ԣ�����������ĸ�� �������������� 
 * ArrayList 
 * ����������"capacity"�����Ŷ�������ӣ��Զ����� 
 * ֻ��Ҫ����������������Ӣ�ۼ��ɣ����õ��Ļ��������ı߽����⡣
 * @author Administrator
 *
 */
public class TestCollection02_Use_Collection {
	public static void main(String[] args) {
		//������ArrayList�����ڴ�Ŷ���
		ArrayList<Hero> heros = new ArrayList<Hero>();
		heros.add(new Hero("����"));
		System.out.println(heros.size());
		
        //����������"capacity"�����Ŷ�������ӣ��Զ�����
        //ֻ��Ҫ����������������Ӣ�ۼ��ɣ����õ��Ļ��������ı߽����⡣
		heros.add(new Hero("��Ī"));
		System.out.println(heros.size());
	}
}
