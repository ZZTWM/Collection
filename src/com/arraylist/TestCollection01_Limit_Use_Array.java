package com.arraylist;

import com.charactor.Hero;

/**
 * ʹ������ľ�����
 * ���Ҫ��Ŷ�����󣬿���ʹ�����飬���������о�����
 * ���� ����������10������
 * ���õ�������˷���
 * ����10�ĸ������ַŲ���
 * @author Administrator
 *
 */
public class TestCollection01_Limit_Use_Array {
	public static void main(String[] args) {
		Hero heros[] = new Hero[10];
        //����������10������
        //���õ�������˷���
        //����10�ĸ������ַŲ���
		heros[0] = new Hero("����");
		//�Ų���Ҫ����
		heros[20] = new Hero("��Ī");
	}
}
