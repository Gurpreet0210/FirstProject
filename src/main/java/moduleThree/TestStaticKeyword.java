package moduleThree;

public class TestStaticKeyword {
	static int x = 230;
	
	public static void display() {
		System.out.println(" In the static function ...");
	}
	
	static {
		System.out.println(" in the static block...");
	}
	
	public static void main(String[] args) {
		System.out.println(" Value of static variable....."+ TestStaticKeyword.x);
		TestStaticKeyword.display();
	}
}
