package com.other;

import java.util.HashMap;

import com.charactor.Hero;

/**
 * �������ظ���ֵ�����ظ�
 * ����HashMap���ԣ�key��Ψһ�ģ��������ظ��ġ� 
 * ���ԣ�����ͬ��key �Ѳ�ͬ��value���뵽 Map�лᵼ�¾�Ԫ�ر����ǣ�ֻ�����������Ԫ�ء� 
 * ������ͬһ�����������Ϊֵ���뵽map�У�ֻҪ��Ӧ��key��һ��
 * @author Administrator
 *
 */
public class TestCollection02_HashMap02 {
	public static void main(String[] args) {
		HashMap<String, Hero> heroMap = new HashMap<String,Hero>();
		heroMap.put("gareen", new Hero("gareen1"));
		System.out.println(heroMap);
		
        //keyΪgareen�Ѿ���value�ˣ�����gareen��Ϊkey�������ݣ��ᵼ��ԭӢ�ۣ�������
        //���������µ�Ԫ�ص�Map��
		heroMap.put("gareen", new Hero("gareen2"));
		System.out.println(heroMap);
		
		heroMap.clear();
		Hero gareen = new Hero("gareen");
		
		//ͬһ�����������Ϊֵ���뵽map�У�ֻҪ��Ӧ��key��һ��
		heroMap.put("hero1", gareen);
		heroMap.put("hero2", gareen);
		
		System.out.println(heroMap);
	}
}
