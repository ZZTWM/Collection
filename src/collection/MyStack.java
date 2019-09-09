package collection;

import java.util.LinkedList;

import com.charactor.Hero;
/**
 * 与FIFO(先入先出的)队列类似的一种数据结构是FILO先入后出栈Stack
 * 根据接口Stack ：
 * 实现类：MyStack
 * public class MyStack implements Stack
 * 并向这个栈中，压入5个英雄，接着弹出5个英雄
 * 再解释一下栈: 栈的结构，就像给弹夹添加子弹一样，先添加的子弹，就放在了最下面，打手枪的时候，只能从最上面取子弹。
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
			System.out.println("压入 hero:" + h);
			heroStack.push(h);
		}
		for (int i = 0; i < 5; i++) {
			Hero h = heroStack.pull();
			System.out.println("弹出 hero" + h);
		}
	}
}
