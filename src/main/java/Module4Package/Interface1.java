package Module4Package;

import java.util.Scanner;

interface a
{
	int add (int a, int b);
	int mul (int a, int b); 
	
	int attribute = 600;
}

interface b extends a
{
	int add (int a, int b, int c);
	int div (int a, int b);	
}


public class Interface1 implements b
{
	public int add(int a, int b) 
	{		 
		return (a+b);
	}
	
	public int mul(int a, int b) 
	{		 
		return (a*b);
	}
	
	public int div(int a, int b) 
	{		 
		return (a/b);
	}
	
	@Override
	public int add(int a, int b, int c) {
		// TODO Auto-generated method stub
		return 0;
	}
  
 

 



}
