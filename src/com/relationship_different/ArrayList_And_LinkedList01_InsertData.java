package com.relationship_different;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * ��������
 * ArrayList ���룬ɾ��������
 * 	LinkedList�� ���룬ɾ�����ݿ�
 * 	ArrayList��˳��ṹ�����Զ�λ�ܿ죬ָ�����ġ� �����ӰԺλ��һ�������˵�ӰƱ��һ�¾��ҵ�λ���ˡ�
 * 	LinkedList ������ṹ�����������һ�����飬Ҫ�ҳ���99�����飬�����һ��һ��������ȥ�����Զ�λ��
 * @author Administrator
 *
 */
public class ArrayList_And_LinkedList01_InsertData {
	public static void main(String[] args) {
		List<Integer> l;
		l = new ArrayList<>();
		insertFirst(l, "ArrayList");
		
		l = new LinkedList<>();
		insertFirst(l, "LinkedList");
	}
	
	private static void insertFirst(List<Integer> l,String type){
		int total = 1000 * 100;
		final int number = 5;
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < total; i++) {
			l.add(0,number);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.printf("��%s ��ǰ�����%d�����ݣ��ܹ���ʱ %d ���� %n", type, total, end - start);
	}
}
