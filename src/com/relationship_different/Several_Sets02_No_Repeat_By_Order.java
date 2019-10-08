package com.relationship_different;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 利用LinkedHashSet的既不重复，
 * 又有顺序的特性，把Math.PI中的数字，
 * 按照出现顺序打印出来，相同数字，只出现一次
 * @author Administrator
 *
 */
public class Several_Sets02_No_Repeat_By_Order {
	public static void main(String[] args) {
        Set<Integer> result = new LinkedHashSet<>();
        String str = String.valueOf(Math.PI);
        // 去掉点
        str = str.replace(".", "");
        char[] cs = str.toCharArray();
        for (char c : cs) {
            int num = Integer.parseInt(String.valueOf(c));
            result.add(num);
        }
        System.out.printf("%s中的无重复数字是：%n",String.valueOf(Math.PI));
        System.out.println(result);		
	}
}
