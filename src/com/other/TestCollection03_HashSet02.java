package com.other;

import java.util.HashSet;

/**
 * û��˳��
 * @author Administrator
 * Set�е�Ԫ�أ�û��˳��: 
 * 	�ϸ��˵����û�а���Ԫ�صĲ���˳������
 * 	HashSet�ľ���˳�򣬼Ȳ��ǰ��ղ���˳��Ҳ���ǰ���hashcode��˳��
 * 	����hashcode��ר�ŵ��½ڽ���: hashcode ԭ��
 * 	������HashSetԴ�����еĲ���ע��:
 * 		It makes no guarantees as to the iteration order of the set; 
 * 		in particular, it does not guarantee that the order will remain constant over time. 
 * 	����֤Set�ĵ���˳��; ȷ�е�˵���ڲ�ͬ�����£�Ԫ�ص�˳���п��ܲ�һ��
 * 	���仰˵��ͬ���ǲ���0-9��HashSet�У� ��JVM�Ĳ�ͬ�汾�У�������˳���ǲ�һ���ġ� �����ڿ�����ʱ�򣬲���������ĳ���ܲ��˳�����˳�����ǲ��ȶ���
 */
public class TestCollection03_HashSet02 {
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		// Set�е�Ԫ�����У����ǰ��ղ���˳��
		System.out.println(numbers);
	}
}
