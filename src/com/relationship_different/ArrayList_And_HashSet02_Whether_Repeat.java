package com.relationship_different;

import java.util.ArrayList;
import java.util.HashSet;
/**
 * �ܷ��ظ�
 * List�е����ݿ����ظ�
 * Set�е����ݲ��ܹ��ظ�
 * �ظ��жϱ�׼��:
 * ���ȿ�hashcode�Ƿ���ͬ
 * ���hashcode��ͬ������Ϊ�ǲ�ͬ����
 * ���hashcode��ͬ���ٱȽ�equals�����equals��ͬ��������ͬ���ݣ������ǲ�ͬ����
 * �����ϵhashcode����ο�hashcodeԭ��
 * @author Administrator
 *
 */
public class ArrayList_And_HashSet02_Whether_Repeat {
	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		//List�� �����ݿ����ظ�
		System.out.println("-----List-----");
		System.out.println("��List�в�����9 9 ");
		numberList.add(9);
		numberList.add(9);
		System.out.println("List�г�������9��");
		System.out.println(numberList);
		
		System.out.println("-----Set-----");
		HashSet<Integer> numberSet = new HashSet<>();
		System.out.println("��Set����9 9");
		//Set�е����ݲ����ظ�
		numberSet.add(9);
		numberSet.add(9);
		System.out.println("Set��ֻ�ᱣ��һ��9:");
		System.out.println(numberSet);
   	}
}
