package com.factorial;

import org.eclipse.jdt.internal.compiler.parser.Scanner;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Integer number=0;
		//Scanner scan = new Scanner(System.in);
		//number = scanner.getNextChar();
		//System.out.println("You had entered : "+number);
		long startTime = System.currentTimeMillis();
		Long factorial = getFactorial(20);
		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("factorial = "+factorial);
		System.out.println("Execution in milliseconds :: "+estimatedTime);
	}

	private static Long getFactorial(int n) {
		// TODO Auto-generated method stub
		
		Long fact = 1l;
		
		for(int i=1; i<=n; i++){
			
			fact *= i;
		}
		return fact;
	}

}
