package com.relationship_different;

import java.util.ArrayList;
import java.util.HashSet;
/**
 * �Ƿ���˳��
 * ArrayList: ��˳��
 * HashSet: ��˳��
 * 	HashSet�ľ���˳�򣬼Ȳ��ǰ��ղ���˳��Ҳ���ǰ���hashcode��˳��
 * 	����hashcode��ר�ŵ��½ڽ���: hashcode ԭ��
 * 	������HasetSetԴ�����еĲ���ע��
 * 	����֤Set�ĵ���˳��; ȷ�е�˵���ڲ�ͬ�����£�Ԫ�ص�˳���п��ܲ�һ��
 * 	���仰˵��ͬ���ǲ���0-9��HashSet�У� ��JVM�Ĳ�ͬ�汾�У�������˳���ǲ�һ���ġ� �����ڿ�����ʱ�򣬲���������ĳ���ܲ��˳�����˳�����ǲ��ȶ���
 * @author Administrator
 *
 */
public class ArrayList_And_HashSet01_Whether_Order {
	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		//List�е����ݰ��ղ���˳����
		System.out.println("-----List-----");
		System.out.println("��List �в��� 9 5 1");
		numberList.add(9);
		numberList.add(5);
		numberList.add(1);
		System.out.println("List����˳�������ݣ�");
		System.out.println(numberList);
		
		System.out.println("-----Set-----");
		HashSet<Integer> numberSet = new HashSet<Integer>();
		System.out.println("��Set�в��� 9 5 1");
		//Set�е����ݲ��ǰ��ղ���˳����
		numberSet.add(9);
		numberSet.add(5);
		numberSet.add(1);
		System.out.println("Set ���ǰ���˳��������:");
		System.out.println(numberSet);
  	}
}
