package tw.aaa.myproject.Interface;

import java.util.LinkedList;

public class queue1 {
private LinkedList list1;
public void in(){
	list1=new LinkedList();
	list1.offer("a");
	list1.offer("b");
}
public void get(){
	while (list1.peek()!=null){
		String data = (String) list1.poll();
	System.out.println("data:" + data);
}
	}
	public static void main(String[] args) {
		queue1 c=new queue1();
		c.in();
		c.get();
	}

}
