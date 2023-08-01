package Module5Assignment;

import java.util.Hashtable;
import java.util.Iterator;

public class TestHashTable {

	public static void main(String[] args) {
		Hashtable<String, Integer> student = new Hashtable();
		student.put("Ram",60);
		student.put("Sita", 75);
		student.put("Jay",100);
		student.put("Lalit", 175);
		student.put("Vijay",150);
		
		Iterator names = student.keySet().iterator();
		Integer highestMarks = 0;
		while(names.hasNext()) {
			int marks = student.get(names.next());
			if(marks > highestMarks) {
				highestMarks = marks;
			}
		}
		System.out.println(highestMarks);
		
	}

}
