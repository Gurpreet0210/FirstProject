package PackagesAndMultiThreading;

public class ShowException {

	public static void main(String[] args) {
		myArr();
	}
	
	public static void myArr() {
		
		try {
			int a[] = new int[10];
			a[12] = 300;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
