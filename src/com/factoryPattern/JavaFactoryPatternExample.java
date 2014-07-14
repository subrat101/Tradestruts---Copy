package com.factoryPattern;

interface Dog
{
	public void speak();
}

class Poodle implements Dog {

	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("The poodle says \"arf\"");
	}
}

class Rotweiler implements Dog {

	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("The Rotweiler says (in a very deep voice) \"WOOF!\"");
	}
}

class SiberianHusky implements Dog {

	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("The SiberianHusky says \"Dude what's up?\"");
	}
}

class DogFactory {
	public static Dog getDog(String criteria) {
		
		if(criteria.equals("small"))
			return new Poodle();
		else if(criteria.equals("big"))
			return new Rotweiler();
		else if(criteria.equals("working"))
			return new SiberianHusky();
		
		return null;
		
	}
}

public class JavaFactoryPatternExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a small dog
		Dog dog = DogFactory.getDog("small");
		dog.speak();
		
		//create a big dog
		dog = DogFactory.getDog("big");
		dog.speak();
		
		//create a working dog
		dog = DogFactory.getDog("working");
		dog.speak();
	}
}
