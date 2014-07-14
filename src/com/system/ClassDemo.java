package com.system;

interface A {
	
	final int id = 1;
	final String name = "Subrat";
}

class B implements A {
	
	int deptno;
}

public class ClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			A a = new B();
			B b = new B();
			Class c;
			c = a.getClass();
			System.out.println("a is object of type "+c.getName());
			c = b.getClass();
			System.out.println("b is object of type "+c.getName());
			c = c.getSuperclass();
			System.out.println("Object b's superclass is "+c.getName());
	}

}
