package Module5Assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		
		Map employee =  new HashMap();
		employee.put(1,"Ram");
		employee.put(2,"Gita");
		employee.put(3,"Shayam");
		employee.put(4,"Piter");
		employee.put(5,"Mike");
		
		Iterator itr = employee.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
