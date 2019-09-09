package collection;

import java.util.LinkedList;

import com.charactor.Hero;
/**
 * ��FIFO(�����ȳ���)�������Ƶ�һ�����ݽṹ��FILO������ջStack
 * ���ݽӿ�Stack ��
 * ʵ���ࣺMyStack
 * public class MyStack implements Stack
 * �������ջ�У�ѹ��5��Ӣ�ۣ����ŵ���5��Ӣ��
 * �ٽ���һ��ջ: ջ�Ľṹ���������������ӵ�һ��������ӵ��ӵ����ͷ����������棬����ǹ��ʱ��ֻ�ܴ�������ȡ�ӵ���
 * @author Administrator
 *
 */
public class MyStack implements Stack{

	LinkedList<Hero> heros = new LinkedList<Hero>();
	
	@Override
	public void push(Hero h) {
		heros.addLast(h);
	}

	@Override
	public Hero pull() {
		return heros.removeLast();
	}

	@Override
	public Hero peek() {
		return heros.getLast();
	}
	
	public static void main(String[] args) {
		MyStack heroStack = new MyStack();
		for (int i = 0; i < 5; i++) {
			Hero h = new Hero("hero name" + i);
			System.out.println("ѹ�� hero:" + h);
			heroStack.push(h);
		}
		for (int i = 0; i < 5; i++) {
			Hero h = heroStack.pull();
			System.out.println("���� hero" + h);
		}
	}
}
