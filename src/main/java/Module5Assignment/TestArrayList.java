package Module5Assignment;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		for(int i=1; i<= 10; i++) {
			al.add(i);
		}
		for(int i=1; i<= al.size(); i++) {
			System.out.println(i);
		}
	}

}
