package PackagesAndMultiThreading;

public class MyQueue implements Queue {

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.insert();
		q.delete();
		
	}

	@Override
	public void insert() {
		System.out.println(" I am insert method....");	
	}

	@Override
	public void delete() {
		System.out.println(" I am delete method....");
		
	}

}
