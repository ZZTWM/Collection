package com.exercise;

import java.util.ArrayList;
import java.util.List;

import com.charactor.Hero;
/**
 * ���ȳ�ʼ��һ��Hero���ϣ������100��Hero�������Ʒֱ��Ǵ�
 * hero 0
 * hero 1
 * hero 2
 * ...
 * hero 99.
 * ͨ���������ֶΣ�ɾ�������ֱ����8�ı����Ķ���
 * @author Administrator
 *�����ϰ�Ŀ����ǣ����ܹ���ʹ��Iterator����ǿforѭ���������ݵ�ͬʱ��
 *ɾ�����ݣ�������׳�ConcurrentModificationException
 *����취����׼��һ����ʱ������ר������������Ҫɾ���Ķ��� Ȼ����ɾ��
 */
public class Exercise03_Delete_Data_From_ArrayList {
	public static void main(String[] args) {
        List<Hero> heros = new ArrayList<Hero>();
        
        // ��100��Hero��������
        for (int i = 0; i < 100; i++) {
            heros.add(new Hero("hero name " + i));
        }
 
        //׼��һ��������ר������װҪɾ���Ķ���
        List<Hero> deletingHeros = new ArrayList<>();
 
        for (Hero h : heros) {
            int id = Integer.parseInt(h.name.substring(10));
            if (0 == id % 8)
                deletingHeros.add(h);
        }
        for (Hero h : deletingHeros) {
            heros.remove(h);
        }
//      heros.removeAll(deletingHeros); //ֱ��ͨ��removeAllɾ�����Hero����
        System.out.println(heros);		
	}
}
