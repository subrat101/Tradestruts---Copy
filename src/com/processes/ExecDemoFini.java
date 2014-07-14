package com.processes;

public class ExecDemoFini {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime r = Runtime.getRuntime();
		Process p = null;
		
		try{
			p = r.exec("mspaint");
			p.waitFor();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Unable to execute the process :: ");
			e.printStackTrace();
		}
		System.out.println("mspaint returned "+p.exitValue());
	}

}
