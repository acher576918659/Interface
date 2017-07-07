package tw.aaa.myproject.Interface;

import java.util.ArrayList;


public class Set_Interface {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("john");
		list1.add("john");
		list1.add("mary");
		list1.add(6);
		list1.add(new Integer(6));
		list1.add(new Double(3.14));
		
		list1.remove(1);
		list1.set(2, "xxx");
	
		System.out.println("list1=" + list1);
		System.out.println("list1.contains('mary'):" + list1.contains("john"));
		System.out.println("size:" + list1.size());
	}
}
