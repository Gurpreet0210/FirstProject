package PackagesAndMultiThreading;

public class ThreadDemo extends Thread{
//	ThreadDemo (){
//		start();
//		System.out.println(" in constructor....");
//	}
	
	{
		try
		{
			int i;
			for (i = 1; i <= 10; ++i)
				System.out.println(5 + " * " + i + " = "+i * 5);
		}
		catch (Exception ex)
		{
			System.out.println("Exception is : "+ex);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread();
		t.start();
		Thread.sleep(5000);
		
		for(int i=2; i <= 40; i += 2) {
			System.out.println(i);
		}
		
		ThreadDemo t1 = new ThreadDemo();
	}

}
