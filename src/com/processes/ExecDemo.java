package com.processes;

public class ExecDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Runtime r = Runtime.getRuntime();
		Process p = null;
		
		try{
			p = r.exec("notepad");
		}catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Error Exceuting notepad. ::: " );
			e.printStackTrace();
		}
	}

}
