package moduleThree;

public class TestInheritance {
	TestInheritance(){
		System.out.println("TestInheritance...");
	}
	int num = 12;
	
	public void speak() {
		System.out.println(" SPEAKING ...."+ num);
	}
	
	public static void main(String[] args) {
		Child c =  new Child();
		c.speak();
	}
}

	final class Child extends TestInheritance{
		Child(){
			System.out.println("Child...");
		}
		
}
