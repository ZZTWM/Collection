package com.relationship_different;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ����LinkedHashSet�ļȲ��ظ���
 * ����˳������ԣ���Math.PI�е����֣�
 * ���ճ���˳���ӡ��������ͬ���֣�ֻ����һ��
 * @author Administrator
 *
 */
public class Several_Sets02_No_Repeat_By_Order {
	public static void main(String[] args) {
        Set<Integer> result = new LinkedHashSet<>();
        String str = String.valueOf(Math.PI);
        // ȥ����
        str = str.replace(".", "");
        char[] cs = str.toCharArray();
        for (char c : cs) {
            int num = Integer.parseInt(String.valueOf(c));
            result.add(num);
        }
        System.out.printf("%s�е����ظ������ǣ�%n",String.valueOf(Math.PI));
        System.out.println(result);		
	}
}
