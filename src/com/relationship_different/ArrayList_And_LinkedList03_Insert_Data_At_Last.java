package com.relationship_different;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Administrator
 * �Ƚ� ArrayList��LinkedList ����������100000�����ݣ�˭��˭����Ϊʲô��
 * ֱ�ӵ���add�������ͱ�ʾ������������
 * ��Ϊ�ǲ���������棬���Զ���������ԣ���û��һ���ƶ��ܶ����ݵ���Ҫ������Ҳ�ǳ��Ŀ�
 * ��������ͺܿ죬���۲���������
 */
public class ArrayList_And_LinkedList03_Insert_Data_At_Last {
    public static void main(String[] args) {
        List<Integer> l;
        l = new ArrayList<>();
        insertFirst(l, "ArrayList");
  
        l = new LinkedList<>();
        insertFirst(l, "LinkedList");
  
    }
  
    private static void insertFirst(List<Integer> l, String type) {
        int total = 1000 * 100;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            //ֱ��add�ͱ�ʾ���������
            l.add(number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("��%s ��������%d�����ݣ��ܹ���ʱ %d ���� %n", type, total, end - start);
    }
}
