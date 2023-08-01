package Test;

import PackagesAndMultiThreading.ArithmeticOperations;

public class Test {

	 String Test(){
		System.out.println(" I am in Test class ....");
		return "";
	}
	 
	public static void main(String[] args) {
		Test t = new Test();
		ArithmeticOperations ao = new ArithmeticOperations();
		ao.divide();
		System.out.println(ao.factor(6));
		ao.multiply();
		System.out.println(ao.reverse(96987));
		ao.subtract();
	}

}
