package tw.aaa.myproject.Interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapInterface {

	public static void main(String[] args) {
		Map map1 = new HashMap();
		map1.put("1st", "mary");
		map1.put("2nd", "john");
		map1.put("3rd", "jacky");
		map1.put("3rd", "xxx");
		Set keys = map1.keySet();
		Collection values = map1.values();
		Set mapping = map1.entrySet();
		System.out.println("keys:" + keys);
		System.out.println("values:" + values);
		System.out.println("mapping:" + mapping);
		
		String second=(String)map1.get(2);
		System.out.println("second:" + second);

	}

}
