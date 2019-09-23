package com.relationship_different;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ��List���м�λ�ã��������ݣ��Ƚ�ArrayList�죬����LinkedList�죬������Ϊʲô��
 * ��ʾ�ڵ�ǰ������һ���λ�ã���������
 * �����λ�ò�������
 * ���鶨λ�ܿ죬�������ݱȽ���
 * ����λ�������������ݱȽϿ�
 * ����֣���������10000����ʱ������λ���ܿ�֧Ҫ�����������ܿ�֧���࣬�������������֣��������á�
 * ���������1000����������ܾͲ�һ���ˡ�
 */
public class ArrayList_And_LinkedList04_Insert_Data_Middle {
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
            //�ѵ�ǰ������һ���λ�ã���������
            l.add(l.size()/2,number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("��%s ���м����%d�����ݣ��ܹ���ʱ %d ���� %n", type, total, end - start);
    }
}
