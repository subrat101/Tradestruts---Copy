package com.system;

public class EnvProperty {

	public static void main(String []args){
		
		System.out.println("The java class path is :: "+System.getProperty("java.class.path"));
		System.out.println("The java installation directory is :: "+System.getProperty("java.home"));
		System.out.println("The java class version no.is :: "+System.getProperty("java.class.version"));
		System.out.println("The java vendor specification is ::"+System.getProperty("java.specification.vendor"));
		System.out.println("The java specified version is :: "+System.getProperty("java.specification.version"));
		System.out.println("The java vendor is :: "+System.getProperty("java.vendor"));
		System.out.println("The java vendor url is :: "+System.getProperty("java.vendor.url"));
		System.out.println("The java jdk version is :: "+System.getProperty("java.version"));
		System.out.println("The java virtual machine name is :: "+System.getProperty("java.vm.name"));		
	}
}
